//package com.example.metroservice.model;
//import jakarta.persistence.*;
//import lombok.Data;
//import java.time.LocalDateTime;
//@Data
//@Entity
//public class UserCheckIn {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String userId;
//    private String stationId;
//    private LocalDateTime checkInTime;
//}

package com.example.metroservice.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class UserCheckIn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String stationId;
    private LocalDateTime checkInTime;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalDateTime checkInTime) {
        this.checkInTime = checkInTime;
    }
}