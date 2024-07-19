package com.anest.iad591.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "sensor_state_history")
public class SensorStateHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "device_id", nullable = false)
    private Long deviceId;

    @Column(name = "device_name", nullable = false, length = 100)
    private String deviceName;

    @Column(name = "state", nullable = false)
    private boolean state;

    @Column(name = "type", nullable = false)
    private boolean type;

    @Column(name = "datetime", nullable = false, length = 100)
    private String datetime;
}
