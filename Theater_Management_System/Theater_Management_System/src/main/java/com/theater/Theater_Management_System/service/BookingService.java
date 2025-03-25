package com.theater.Theater_Management_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theater.Theater_Management_System.model.Booking;
import com.theater.Theater_Management_System.model.ShowTime;
import com.theater.Theater_Management_System.repository.BookingRepository;
import com.theater.Theater_Management_System.repository.ShowTimeRepository;

@Service
public class BookingService {
	 @Autowired
	    private BookingRepository bookingRepository;
	    @Autowired
	    private ShowTimeRepository showtimeRepository;

	    public Booking bookTickets(Long showtimeId, int numTickets, String userName) {
	        ShowTime showtime = showtimeRepository.findById(showtimeId).orElseThrow();
	        if (showtime.getAvailableSeats() < numTickets) {
	            throw new IllegalArgumentException("Not enough seats available");
	        }
	        showtime.setAvailableSeats(showtime.getAvailableSeats() - numTickets);
	        showtimeRepository.save(showtime);

	        Booking booking = new Booking();
	        booking.setShowtime(showtime);
	        booking.setNumTickets(numTickets);
	        booking.setUserName(userName);
	        return bookingRepository.save(booking);
	    }

}
