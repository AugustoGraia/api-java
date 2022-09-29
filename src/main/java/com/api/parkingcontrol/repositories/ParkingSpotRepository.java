package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    @Query("select (count(p) > 0) from ParkingSpotModel p where p.licensePlateCar = ?1")
    boolean existsByLicensePlateCar(String licensePlateCar);
    @Query("select (count(p) > 0) from ParkingSpotModel p where p.parkingSpotNumber = ?1")
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    @Query("select (count(p) > 0) from ParkingSpotModel p where p.apartment = ?1 and p.block = ?2")
    boolean existsByApartmentAndBlock(String apartment, String block);
}

