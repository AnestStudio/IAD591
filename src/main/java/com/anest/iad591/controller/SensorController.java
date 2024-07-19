package com.anest.iad591.controller;

import com.anest.iad591.dto.ParameterDTO;
import com.anest.iad591.entity.HumidityAir;
import com.anest.iad591.entity.HumiditySoil;
import com.anest.iad591.entity.Temperature;
import com.anest.iad591.service.HumidityAirService;
import com.anest.iad591.service.HumiditySoilService;
import com.anest.iad591.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class SensorController {

    private final TemperatureService temperatureService;
    private final HumiditySoilService humiditySoilService;
    private final HumidityAirService humidityAirService;

    @Autowired
    public SensorController(
            TemperatureService temperatureService,
            HumiditySoilService humiditySoilService,
            HumidityAirService humidityAirService
    ) {
        this.temperatureService = temperatureService;
        this.humiditySoilService = humiditySoilService;
        this.humidityAirService = humidityAirService;
    }

    @GetMapping("/temperatures/month")
    public List<Temperature> getTemperaturesByMonth(
            @RequestParam String month,
            @RequestParam String year
    ) {
        return temperatureService.getTemperaturesByMonth(month, year);
    }

    @GetMapping("/temperatures/day")
    public ResponseEntity<Object> getTemperaturesByDate(
            @RequestParam String day,
            @RequestParam String month,
            @RequestParam String year
    ) {
        Temperature temperature = temperatureService.getTemperaturesByDate(day, month, year);
        HumiditySoil humiditySoil = humiditySoilService.getHumiditySoilByDate(day, month, year);
        HumidityAir humidityAir = humidityAirService.getHumidityAirByDate(day, month, year);
        Map<String, Object> map = new HashMap<>();
        map.put("temperature", temperature);
        map.put("humiditySoil", humiditySoil);
        map.put("humidityAir", humidityAir);

        if (Objects.isNull(temperature) || Objects.isNull(humiditySoil) || Objects.isNull(humidityAir)) {
            return new ResponseEntity<>(new HashMap<>(), HttpStatus.OK);
        }
        return new ResponseEntity<>(Objects.requireNonNullElseGet(map, HashMap::new), HttpStatus.OK);
    }

    @PostMapping
    public Temperature saveTemperature(@RequestBody ParameterDTO parameterDTO) {
        return temperatureService.saveTemperature(parameterDTO);
    }
}
