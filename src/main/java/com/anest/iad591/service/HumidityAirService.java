package com.anest.iad591.service;

import com.anest.iad591.dto.ParameterDTO;
import com.anest.iad591.entity.HumidityAir;
import com.anest.iad591.repository.HumidityAirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumidityAirService {
    
    private final HumidityAirRepository humidityAirRepository;

    @Autowired
    public HumidityAirService(HumidityAirRepository humidityAirRepository) {
        this.humidityAirRepository = humidityAirRepository;
    }

    public List<HumidityAir> getTemperaturesByMonth(String month, String year) {
        return humidityAirRepository.findByMonthAndYear(month, year);
    }

    public HumidityAir getTemperaturesByDate(String day, String month, String year) {
        return humidityAirRepository.findByDayAndMonthAndYear(day, month, year);
    }

    public HumidityAir saveTemperature(ParameterDTO parameterDTO) {
        HumidityAir humidityAir = new HumidityAir();
        humidityAir.setDay(parameterDTO.getDay());
        humidityAir.setMonth(parameterDTO.getMonth());
        humidityAir.setYear(parameterDTO.getYear());
        humidityAir.setZeroHour(parameterDTO.getZeroHour());
        humidityAir.setOneHour(parameterDTO.getOneHour());
        humidityAir.setTwoHour(parameterDTO.getTwoHour());
        humidityAir.setThreeHour(parameterDTO.getThreeHour());
        humidityAir.setFourHour(parameterDTO.getFourHour());
        humidityAir.setFiveHour(parameterDTO.getFiveHour());
        humidityAir.setSixHour(parameterDTO.getSixHour());
        humidityAir.setSevenHour(parameterDTO.getSevenHour());
        humidityAir.setEightHour(parameterDTO.getEightHour());
        humidityAir.setNineHour(parameterDTO.getNineHour());
        humidityAir.setTenHour(parameterDTO.getTenHour());
        humidityAir.setElevenHour(parameterDTO.getElevenHour());
        humidityAir.setTwelveHour(parameterDTO.getTwelveHour());
        humidityAir.setThirteenHour(parameterDTO.getThirteenHour());
        humidityAir.setFourteenHour(parameterDTO.getFourteenHour());
        humidityAir.setFifteenHour(parameterDTO.getFifteenHour());
        humidityAir.setSixteenHour(parameterDTO.getSixteenHour());
        humidityAir.setSeventeenHour(parameterDTO.getSeventeenHour());
        humidityAir.setEighteenHour(parameterDTO.getEighteenHour());
        humidityAir.setNineteenHour(parameterDTO.getNineteenHour());
        humidityAir.setTwentyHour(parameterDTO.getTwentyHour());
        humidityAir.setTwentyOneHour(parameterDTO.getTwentyOneHour());
        humidityAir.setTwentyTwoHour(parameterDTO.getTwentyTwoHour());
        humidityAir.setTwentyThreeHour(parameterDTO.getTwentyThreeHour());
        return humidityAirRepository.save(humidityAir);
    }
}
