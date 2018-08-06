package com.training.airlines.bookingtickets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.airlines.bookingtickets.DAO.BookingDAO;
import com.training.airlines.bookingtickets.registeruser.Booking;

@RestController
public class Bookingcontroller {
	
	@Autowired
private BookingDAO bookingDAO;
	
	@GetMapping(path="/getAllbookings")
	public List<Booking> getAllBookings( int[] bookin_id)
	{
		return bookingDAO.getAllBookings(bookin_id);
	}
	
	@GetMapping(path="/getbooking/{bookin_id}")
	public Booking getBooking( Integer bookin_id)
	{
		return bookingDAO.getBooking(bookin_id);
	}
@PostMapping("/book")
	public void bookTicket(@RequestBody Booking booking)
	{
	bookingDAO.insertBooking(booking);
	}
}
