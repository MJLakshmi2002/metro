package com.example.metroservice.controller;

import com.example.metroservice.service.MetroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metro")
public class MetroController {
    @Autowired
    private MetroService metroService;

    @PostMapping("/checkin")
    public String checkIn(@RequestParam String userId, @RequestParam String stationId) {
        metroService.checkIn(userId, stationId);
        return "Checked in successfully!";
    }

    @PostMapping("/checkout")
    public String checkOut(@RequestParam String userId) {
        metroService.checkOut(userId);
        return "Checked out successfully!";
    }
}