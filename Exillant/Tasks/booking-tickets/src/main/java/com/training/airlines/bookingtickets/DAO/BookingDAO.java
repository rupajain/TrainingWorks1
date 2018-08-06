package com.training.airlines.bookingtickets.DAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import com.training.airlines.bookingtickets.mapper.BookingMapper;
import com.training.airlines.bookingtickets.registeruser.Booking;
import com.training.airlines.bookingtickets.registeruser.JourneyType;
import com.training.airlines.bookingtickets.registeruser.PassengerInfo;

@Repository
public class BookingDAO {
	private DataSource datasource;
	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	public Booking getBooking(Integer bookin_id) {
		String sql = "select bookin_id,originCity,destinationCity1,destinationCity2,departDate,"
				+ " returnDate,noOfPassengers,amount,journeyType,passengerInfo_id,discount from Booking where bookin_id="
				+ bookin_id;

		Booking booking = (Booking) jdbcTemplateObject.queryForObject(sql, new Object[] { bookin_id },
				new BookingMapper());

		return booking;
	}

	public List<Booking> getAllBookings(int[] bookin_id) {
//		String sql = "select bookin_id,'originCity','destinationCity1','destinationCity2','departDate',"
//				+ " 'returnDate',noOfPassengers,amount,'journeyType',passengerInfo_id,discount from Booking where bookin_id="
//				+ 101;
		String sql = "select bookin_id,'originCity','destinationCity1','destinationCity2','departDate',"
				+ " 'returnDate',noOfPassengers,amount,'journeyType',passengerInfo_id,discount from Booking ";
			
		List<Map<String, Object>> rows = jdbcTemplateObject.queryForList(sql);
		List<Booking> bookings = new ArrayList<>();
		Booking booking = new Booking();

		for (Map row : rows) {
			booking.setBookig_id(Integer.parseInt(row.get("bookin_id").toString()));
			booking.setAmount(Double.parseDouble(row.get("amount").toString()));
			booking.setDepartDate(row.get("departDate").toString());
			booking.setReturnDate(row.get("returnDate").toString());
			booking.setDestinationCity1(row.get("destinationCity1").toString());
			booking.setDestinationCity2(row.get("destinationCity2").toString());
			booking.setDiscount(Double.parseDouble(row.get("discount").toString()));
			 booking.setJourneyType( row.get("journeyType").toString());
			//booking.setJourneyType(JourneyType.SINGLE);
			booking.setNoOfPassengers(Integer.parseInt(row.get("noOfPassengers").toString()));
			booking.setOriginCity(row.get("originCity").toString());
			// booking.setPassengerInfo((PassengerInfo) (row.get("passengerInfo_id")));
			bookings.add(booking);
		}
		return bookings;
	}

	public void insertBooking(Booking booking) {
		String sql = "insert into Booking (bookin_id,originCity,destinationCity1,destinationCity2,departDate,"
				+ "returnDate,noOfPassengers,amount,journeyType,passengerInfo_id,discount) values(?,?,?,?,?,?,?,?,?,?,?)";

		System.out.println("sql..." + sql + "....." + booking + "........" + jdbcTemplateObject);
		jdbcTemplateObject.update(sql, booking.getBookig_id(), booking.getOriginCity(), booking.getDestinationCity1(),
				booking.getDestinationCity2(), booking.getDepartDate(), booking.getReturnDate(),
				 booking.getNoOfPassengers(), booking.getAmount(), booking.getJourneyType(),
				booking.getPassengerInfo(), booking.getDiscount());

		return;

	}
}
