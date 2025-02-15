//package com.example.metroservice.service;

//import com.example.metroservice.model.UserCheckIn;
//import com.example.metroservice.repository.UserCheckInRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.time.LocalDateTime;
//
//@Service
//public class MetroService {
//    @Autowired
//    private UserCheckInRepository userCheckInRepository;
//
//    public void checkIn(String userId, String stationId) {
//        UserCheckIn checkIn = new UserCheckIn();
//        checkIn.setUserId(userId);
//        checkIn.setStationId(stationId);
//        checkIn.setCheckInTime(LocalDateTime.now());
//        userCheckInRepository.save(checkIn);
//    }
//
//    public void checkOut(String userId) {
//        // Implement fare calculation and check-out logic
//    }
//}
package com.example.metroservice.service;

import com.example.metroservice.model.UserCheckIn;
import com.example.metroservice.repository.UserCheckInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class MetroService {

    @Autowired
    private UserCheckInRepository userCheckInRepository;

    public void checkIn(String userId, String stationId) {
        UserCheckIn checkIn = new UserCheckIn();
        checkIn.setUserId(userId);
        checkIn.setStationId(stationId);
        checkIn.setCheckInTime(LocalDateTime.now());
        userCheckInRepository.save(checkIn);
    }

    public void checkOut(String userId) {
        // Implement check-out logic here
    }
}