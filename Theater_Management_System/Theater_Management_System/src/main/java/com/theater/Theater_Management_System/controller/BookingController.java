package com.theater.Theater_Management_System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.theater.Theater_Management_System.model.Booking;
import com.theater.Theater_Management_System.service.BookingService;

@RestController
@RequestMapping("/book")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/{showtimeId}")
    public Booking bookTickets(@PathVariable Long showtimeId, @RequestParam int numTickets, @RequestParam String userName) {
        return bookingService.bookTickets(showtimeId, numTickets, userName);
    }
}
