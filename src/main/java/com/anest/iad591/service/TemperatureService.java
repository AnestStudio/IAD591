package com.anest.iad591.service;

import com.anest.iad591.dto.ParameterDTO;
import com.anest.iad591.entity.Temperature;
import com.anest.iad591.repository.TemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperatureService {

    private final TemperatureRepository temperatureRepository;

    @Autowired
    public TemperatureService(TemperatureRepository temperatureRepository) {
        this.temperatureRepository = temperatureRepository;
    }

    public List<Temperature> getTemperaturesByMonth(String month, String year) {
        return temperatureRepository.findByMonthAndYear(month, year);
    }

    public Temperature getTemperaturesByDate(String day, String month, String year) {
        return temperatureRepository.findByDayAndMonthAndYear(day, month, year);
    }

    public Temperature saveTemperature(ParameterDTO parameterDTO) {
        Temperature temperature = new Temperature();
        temperature.setDay(parameterDTO.getDay());
        temperature.setMonth(parameterDTO.getMonth());
        temperature.setYear(parameterDTO.getYear());
        temperature.setZeroHour(parameterDTO.getZeroHour());
        temperature.setOneHour(parameterDTO.getOneHour());
        temperature.setTwoHour(parameterDTO.getTwoHour());
        temperature.setThreeHour(parameterDTO.getThreeHour());
        temperature.setFourHour(parameterDTO.getFourHour());
        temperature.setFiveHour(parameterDTO.getFiveHour());
        temperature.setSixHour(parameterDTO.getSixHour());
        temperature.setSevenHour(parameterDTO.getSevenHour());
        temperature.setEightHour(parameterDTO.getEightHour());
        temperature.setNineHour(parameterDTO.getNineHour());
        temperature.setTenHour(parameterDTO.getTenHour());
        temperature.setElevenHour(parameterDTO.getElevenHour());
        temperature.setTwelveHour(parameterDTO.getTwelveHour());
        temperature.setThirteenHour(parameterDTO.getThirteenHour());
        temperature.setFourteenHour(parameterDTO.getFourteenHour());
        temperature.setFifteenHour(parameterDTO.getFifteenHour());
        temperature.setSixteenHour(parameterDTO.getSixteenHour());
        temperature.setSeventeenHour(parameterDTO.getSeventeenHour());
        temperature.setEighteenHour(parameterDTO.getEighteenHour());
        temperature.setNineteenHour(parameterDTO.getNineteenHour());
        temperature.setTwentyHour(parameterDTO.getTwentyHour());
        temperature.setTwentyOneHour(parameterDTO.getTwentyOneHour());
        temperature.setTwentyTwoHour(parameterDTO.getTwentyTwoHour());
        temperature.setTwentyThreeHour(parameterDTO.getTwentyThreeHour());
        return temperatureRepository.save(temperature);
    }
}
