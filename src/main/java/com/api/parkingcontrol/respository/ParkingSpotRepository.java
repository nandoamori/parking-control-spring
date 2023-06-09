package com.api.parkingcontrol.respository;

import com.api.parkingcontrol.model.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    public boolean existsByApartmentAndBlock(String apartment, String block);
}
