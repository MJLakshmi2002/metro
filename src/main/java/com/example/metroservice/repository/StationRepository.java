package com.example.metroservice.repository;

import com.example.metroservice.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface StationRepository extends JpaRepository<Station, Long> {
    List<Station> findAll();
}