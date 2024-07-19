package com.anest.iad591.repository;

import com.anest.iad591.entity.SensorStateHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorStateHistoryRepository extends JpaRepository<SensorStateHistory, Long> {
}
