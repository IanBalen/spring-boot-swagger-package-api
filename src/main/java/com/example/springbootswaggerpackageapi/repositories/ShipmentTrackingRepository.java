package com.example.springbootswaggerpackageapi.repositories;

import com.example.springbootswaggerpackageapi.domain.ShipmentTrackingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentTrackingRepository extends JpaRepository<ShipmentTrackingEntity, Long> {
}
