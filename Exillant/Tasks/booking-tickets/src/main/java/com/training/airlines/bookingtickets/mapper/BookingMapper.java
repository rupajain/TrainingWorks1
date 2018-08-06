package com.training.airlines.bookingtickets.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.airlines.bookingtickets.registeruser.Booking;
import com.training.airlines.bookingtickets.registeruser.JourneyType;
import com.training.airlines.bookingtickets.registeruser.PassengerInfo;

public class BookingMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Booking booking = new Booking();
		booking.setBookig_id(rs.getInt("bookin_id"));
		booking.setDestinationCity1(rs.getString("destinationCity1"));
		booking.setDestinationCity2(rs.getString("destinationCity2"));
		booking.setDepartDate(rs.getString("departDate"));
		booking.setAmount(rs.getDouble("amount"));
		booking.setReturnDate(rs.getString("returnDate"));
		booking.setDiscount(rs.getDouble("discount"));
		booking.setNoOfPassengers(rs.getInt("noOfPassengers"));
		booking.setJourneyType( rs.getString("journeyType"));
		booking.setOriginCity(rs.getString("originCity"));
		booking.setPassengerInfo((PassengerInfo) rs.getObject("passengerInfo_id"));
		return booking;
	}

}
