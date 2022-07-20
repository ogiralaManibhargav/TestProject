
package net.example.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "booking")
public class Booking {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="bookingId")
private Long bookingId;
@Column(name="bookingDate")
private String bookingDate;
@Column(name="passengerNo")
private Long passengerNo;
@Column(name="nameOfpassenger")
private String nameOfpassenger;

@ManyToOne(fetch = FetchType.LAZY,optional = false,cascade = CascadeType.ALL)
@JoinColumn(name="flightNo",nullable=false)
@JsonIgnoreProperties("bookingsList")
//@Column(name="flight")
private Flight flight;
/**
 * @param bookingId
 * @param bookingDate
 * @param noOfPassengers
 */

/**
 * @param bookingId
 * @param bookingDate
 * @param passengerno
 * @param flight
 */
@Column(name="bookingStatus")
private String bookingStatus;
/**
 * @param bookingId
 * @param bookingDate
 * @param passengerno
 * @param flight
 * @param bookingStatus
 */

/**
 * @return the bookingId
 */
public Long getBookingId() {
	return bookingId;
}

/**
 * @param bookingId the bookingId to set
 */
public void setBookingId(Long bookingId) {
	this.bookingId = bookingId;
}

/**
 * @return the bookingDate
 */
public String getBookingDate() {
	return bookingDate;
}

/**
 * @param bookingDate the bookingDate to set
 */
public void setBookingDate(String bookingDate) {
	this.bookingDate = bookingDate;
}

/**
 * @return the passengerNo
 */
public Long getPassengerNo() {
	return passengerNo;
}

/**
 * @param passengerNo the passengerNo to set
 */
public void setPassengerNo(Long passengerNo) {
	this.passengerNo = passengerNo;
}

/**
 * @return the nameOfpassenger
 */
public String getNameOfpassenger() {
	return nameOfpassenger;
}

/**
 * @param nameOfpassenger the nameOfpassenger to set
 */
public void setNameOfpassenger(String nameOfpassenger) {
	this.nameOfpassenger = nameOfpassenger;
}

/**
 * @return the flight
 */

/**
 * @return the flightO
 */
public Flight getFlight() {
	return flight;
}

/**
 * @param flightO the flightO to set
 */
public void setFlight(Flight flightO) {
	this.flight = flightO;
}


/**
 * @return the bookingStatus
 */
public String getBookingStatus() {
	return bookingStatus;
}

/**
 * @param bookingStatus the bookingStatus to set
 */
public void setBookingStatus(String bookingStatus) {
	this.bookingStatus = bookingStatus;
}

/**
 * @param bookingId
 * @param bookingDate
 * @param passengerNo
 * @param nameOfpassenger
 * @param flight
 * @param bookingStatus
 */
public Booking(Long bookingId, String bookingDate, Long passengerNo, String nameOfpassenger, Flight flight,
		String bookingStatus) {
	super();
	this.bookingId = bookingId;
	this.bookingDate = bookingDate;
	this.passengerNo = passengerNo;
	this.nameOfpassenger = nameOfpassenger;
	this.flight = flight;
	this.bookingStatus = bookingStatus;
}

/**
 * 
 */
public Booking() {
	// TODO Auto-generated constructor stub
}

/**
 * @param bookingId
 * @param bookingDate
 * @param passengerNo
 * @param nameOfpassenger
 * @param flight
 * @param bookingStatus
 */


}