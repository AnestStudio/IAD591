package com.anest.iad591.service;

import com.anest.iad591.dto.SensorStateHistoryDTO;
import com.anest.iad591.entity.SensorStateHistory;
import com.anest.iad591.repository.SensorStateHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SensorStateHistoryService {

    private final SensorStateHistoryRepository sensorStateHistoryRepository;

    @Autowired
    public SensorStateHistoryService(SensorStateHistoryRepository sensorStateHistoryRepository) {
        this.sensorStateHistoryRepository = sensorStateHistoryRepository;
    }

    public SensorStateHistory save(SensorStateHistoryDTO sensorStateHistoryDTO) {
        SensorStateHistory sensorStateHistory = new SensorStateHistory();
        sensorStateHistory.setDeviceId(sensorStateHistoryDTO.getDeviceId());
        sensorStateHistory.setDeviceName(sensorStateHistoryDTO.getDeviceName());
        sensorStateHistory.setState(sensorStateHistoryDTO.isState());
        sensorStateHistory.setType(sensorStateHistoryDTO.isType());
        sensorStateHistory.setDatetime(sensorStateHistoryDTO.getDatetime());
        return sensorStateHistoryRepository.save(sensorStateHistory);
    }

    public Map<Long, SensorStateCounts> getSensorStateHistoryCountsByDeviceId(LocalDate date) {
        List<SensorStateHistory> devices = sensorStateHistoryRepository.findAll().stream()
                .filter(device -> convertUnixTimeToLocalDate(device.getDatetime()).equals(date))
                .toList();;
        Map<Long, SensorStateCounts> countsByDeviceId = new HashMap<>();

        for (SensorStateHistory device : devices) {
            countsByDeviceId.putIfAbsent(device.getDeviceId(), new SensorStateCounts());
            SensorStateCounts counts = countsByDeviceId.get(device.getDeviceId());

            if (device.isType()) {
                if (device.isState()) {
                    counts.autoOn++;
                } else {
                    counts.autoOff++;
                }
            } else {
                if (device.isState()) {
                    counts.manualOn++;
                } else {
                    counts.manualOff++;
                }
            }
        }
        return countsByDeviceId;
    }

    private LocalDate convertUnixTimeToLocalDate(String timestamp) {
        long epoch = Long.parseLong(timestamp);
        return Instant.ofEpochSecond(epoch).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static class SensorStateCounts {
        public long autoOn = 0;
        public long autoOff = 0;
        public long manualOn = 0;
        public long manualOff = 0;
    }
}
