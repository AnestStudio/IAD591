package com.anest.iad591.dto;

import lombok.Data;

@Data
public class SensorStateHistoryDTO {

    private Long deviceId;
    private String deviceName;
    private boolean state;
    private boolean type;
    private String datetime;
}
