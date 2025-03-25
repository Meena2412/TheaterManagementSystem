package com.theater.Theater_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theater.Theater_Management_System.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

}
