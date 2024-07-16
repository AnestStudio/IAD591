package com.anest.iad591.repository;

import com.anest.iad591.entity.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemperatureRepository extends JpaRepository<Temperature, Long> {

    List<Temperature> findByMonthAndYear(String month, String year);

    Temperature findByDayAndMonthAndYear(String day, String month, String year);
}
