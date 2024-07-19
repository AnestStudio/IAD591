package com.anest.iad591.controller;

import com.anest.iad591.dto.SensorStateHistoryDTO;
import com.anest.iad591.entity.SensorStateHistory;
import com.anest.iad591.service.SensorStateHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class StateController {

    private final SensorStateHistoryService sensorStateHistoryService;

    @Autowired
    public StateController(SensorStateHistoryService sensorStateHistoryService) {
        this.sensorStateHistoryService = sensorStateHistoryService;
    }

    @PostMapping("/device/state/add")
    public SensorStateHistory addDeviceStateHistory(@RequestBody SensorStateHistoryDTO sensorStateHistoryDTO) {
        return sensorStateHistoryService.save(sensorStateHistoryDTO);
    }

    @GetMapping("/device/state/counts")
    public Map<Long, SensorStateHistoryService.SensorStateCounts> getCountsByDeviceId(
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
    ) {
        return sensorStateHistoryService.getSensorStateHistoryCountsByDeviceId(date);
    }
}
