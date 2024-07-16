package com.anest.iad591.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "temperature")
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 2)
    private String day;

    @Column(nullable = false, length = 2)
    private String month;

    @Column(nullable = false, length = 4)
    private String year;

    @Column(name = "0h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String zeroHour;

    @Column(name = "1h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String oneHour;

    @Column(name = "2h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String twoHour;

    @Column(name = "3h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String threeHour;

    @Column(name = "4h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String fourHour;

    @Column(name = "5h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String fiveHour;

    @Column(name = "6h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String sixHour;

    @Column(name = "7h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String sevenHour;

    @Column(name = "8h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String eightHour;

    @Column(name = "9h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String nineHour;

    @Column(name = "10h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String tenHour;

    @Column(name = "11h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String elevenHour;

    @Column(name = "12h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String twelveHour;

    @Column(name = "13h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String thirteenHour;

    @Column(name = "14h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String fourteenHour;

    @Column(name = "15h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String fifteenHour;

    @Column(name = "16h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String sixteenHour;

    @Column(name = "17h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String seventeenHour;

    @Column(name = "18h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String eighteenHour;

    @Column(name = "19h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String nineteenHour;

    @Column(name = "20h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String twentyHour;

    @Column(name = "21h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String twentyOneHour;

    @Column(name = "22h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String twentyTwoHour;

    @Column(name = "23h", nullable = false, length = 10, columnDefinition = "varchar(10) default '0'")
    private String twentyThreeHour;
}
