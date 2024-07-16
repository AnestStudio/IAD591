package com.anest.iad591.controller;

import com.anest.iad591.dto.TemperatureDTO;
import com.anest.iad591.entity.Temperature;
import com.anest.iad591.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/temperatures")

public class TemperatureController {

    private final TemperatureService temperatureService;

    @Autowired
    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @GetMapping("/month")
    public List<Temperature> getTemperaturesByMonth(
            @RequestParam String month,
            @RequestParam String year
    ) {
        return temperatureService.getTemperaturesByMonth(month, year);
    }

    @GetMapping("/day")
    public Temperature getTemperaturesByDate(
            @RequestParam String day,
            @RequestParam String month,
            @RequestParam String year
    ) {
        return temperatureService.getTemperaturesByDate(day, month, year);
    }

    @PostMapping
    public Temperature saveTemperature(@RequestBody TemperatureDTO temperatureDTO) {
        return temperatureService.saveTemperature(temperatureDTO);
    }
}
