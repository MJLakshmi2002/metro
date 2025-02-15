package com.example.metroservice.repository;

import com.example.metroservice.model.UserCheckIn;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserCheckInRepository extends JpaRepository<UserCheckIn, Long> {
    List<UserCheckIn> findByStationId(String stationId);
}
