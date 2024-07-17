package com.anest.iad591.service;

import com.anest.iad591.dto.ParameterDTO;
import com.anest.iad591.entity.HumiditySoil;
import com.anest.iad591.repository.HumiditySoilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumiditySoilService {

    private final HumiditySoilRepository humiditySoilRepository;

    @Autowired
    public HumiditySoilService(HumiditySoilRepository humiditySoilRepository) {
        this.humiditySoilRepository = humiditySoilRepository;
    }

    public List<HumiditySoil> getTemperaturesByMonth(String month, String year) {
        return humiditySoilRepository.findByMonthAndYear(month, year);
    }

    public HumiditySoil getTemperaturesByDate(String day, String month, String year) {
        return humiditySoilRepository.findByDayAndMonthAndYear(day, month, year);
    }

    public HumiditySoil saveHumiditySoil(ParameterDTO parameterDTO) {
        HumiditySoil humiditySoil = new HumiditySoil();
        humiditySoil.setDay(parameterDTO.getDay());
        humiditySoil.setMonth(parameterDTO.getMonth());
        humiditySoil.setYear(parameterDTO.getYear());
        humiditySoil.setZeroHour(parameterDTO.getZeroHour());
        humiditySoil.setOneHour(parameterDTO.getOneHour());
        humiditySoil.setTwoHour(parameterDTO.getTwoHour());
        humiditySoil.setThreeHour(parameterDTO.getThreeHour());
        humiditySoil.setFourHour(parameterDTO.getFourHour());
        humiditySoil.setFiveHour(parameterDTO.getFiveHour());
        humiditySoil.setSixHour(parameterDTO.getSixHour());
        humiditySoil.setSevenHour(parameterDTO.getSevenHour());
        humiditySoil.setEightHour(parameterDTO.getEightHour());
        humiditySoil.setNineHour(parameterDTO.getNineHour());
        humiditySoil.setTenHour(parameterDTO.getTenHour());
        humiditySoil.setElevenHour(parameterDTO.getElevenHour());
        humiditySoil.setTwelveHour(parameterDTO.getTwelveHour());
        humiditySoil.setThirteenHour(parameterDTO.getThirteenHour());
        humiditySoil.setFourteenHour(parameterDTO.getFourteenHour());
        humiditySoil.setFifteenHour(parameterDTO.getFifteenHour());
        humiditySoil.setSixteenHour(parameterDTO.getSixteenHour());
        humiditySoil.setSeventeenHour(parameterDTO.getSeventeenHour());
        humiditySoil.setEighteenHour(parameterDTO.getEighteenHour());
        humiditySoil.setNineteenHour(parameterDTO.getNineteenHour());
        humiditySoil.setTwentyHour(parameterDTO.getTwentyHour());
        humiditySoil.setTwentyOneHour(parameterDTO.getTwentyOneHour());
        humiditySoil.setTwentyTwoHour(parameterDTO.getTwentyTwoHour());
        humiditySoil.setTwentyThreeHour(parameterDTO.getTwentyThreeHour());
        return humiditySoilRepository.save(humiditySoil);
    }
}
