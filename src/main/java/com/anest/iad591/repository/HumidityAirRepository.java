package com.anest.iad591.repository;

import com.anest.iad591.entity.HumidityAir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumidityAirRepository extends JpaRepository<HumidityAir, Long> {

    List<HumidityAir> findByMonthAndYear(String month, String year);

    HumidityAir findByDayAndMonthAndYear(String day, String month, String year);
}
