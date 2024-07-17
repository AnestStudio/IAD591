package com.anest.iad591.repository;

import com.anest.iad591.entity.HumiditySoil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumiditySoilRepository extends JpaRepository<HumiditySoil, Long> {

    List<HumiditySoil> findByMonthAndYear(String month, String year);

    HumiditySoil findByDayAndMonthAndYear(String day, String month, String year);
}
