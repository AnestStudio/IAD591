package com.anest.iad591.service;

import com.anest.iad591.dto.TemperatureDTO;
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

    public Temperature saveTemperature(TemperatureDTO temperatureDTO) {
        Temperature temperature = new Temperature();
        temperature.setDay(temperatureDTO.getDay());
        temperature.setMonth(temperatureDTO.getMonth());
        temperature.setYear(temperatureDTO.getYear());
        temperature.setZeroHour(temperatureDTO.getZeroHour());
        temperature.setOneHour(temperatureDTO.getOneHour());
        temperature.setTwoHour(temperatureDTO.getTwoHour());
        temperature.setThreeHour(temperatureDTO.getThreeHour());
        temperature.setFourHour(temperatureDTO.getFourHour());
        temperature.setFiveHour(temperatureDTO.getFiveHour());
        temperature.setSixHour(temperatureDTO.getSixHour());
        temperature.setSevenHour(temperatureDTO.getSevenHour());
        temperature.setEightHour(temperatureDTO.getEightHour());
        temperature.setNineHour(temperatureDTO.getNineHour());
        temperature.setTenHour(temperatureDTO.getTenHour());
        temperature.setElevenHour(temperatureDTO.getElevenHour());
        temperature.setTwelveHour(temperatureDTO.getTwelveHour());
        temperature.setThirteenHour(temperatureDTO.getThirteenHour());
        temperature.setFourteenHour(temperatureDTO.getFourteenHour());
        temperature.setFifteenHour(temperatureDTO.getFifteenHour());
        temperature.setSixteenHour(temperatureDTO.getSixteenHour());
        temperature.setSeventeenHour(temperatureDTO.getSeventeenHour());
        temperature.setEighteenHour(temperatureDTO.getEighteenHour());
        temperature.setNineteenHour(temperatureDTO.getNineteenHour());
        temperature.setTwentyHour(temperatureDTO.getTwentyHour());
        temperature.setTwentyOneHour(temperatureDTO.getTwentyOneHour());
        temperature.setTwentyTwoHour(temperatureDTO.getTwentyTwoHour());
        temperature.setTwentyThreeHour(temperatureDTO.getTwentyThreeHour());
        return temperatureRepository.save(temperature);
    }
}
