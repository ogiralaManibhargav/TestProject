package net.example.spring.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="flight")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="flightNo")
	private Long flightNo;
	@Column(name="carrierName")
	private String carrierName;
	@Column(name="flightModel")
	private String flightModel;
	@Column(name="seatCapacity")
	private Long seatCapacity;
	@Column(name="dateOfdeparture")
	private String dateOfdeparture;
	
	/**
	 * @return the date
	 */
	@Column(name="statusofFlight")
	private String statusofFlight;
	
	
	@OneToMany(mappedBy = "flight" ,cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
		      CascadeType.REFRESH },targetEntity = Booking.class)
	  @JsonIgnoreProperties("flight")
	private List<Booking> bookingsList;


	/**
	 * @param flightNo
	 * @param carrierName
	 * @param flightModel
	 * @param seatCapacity
	 * @param dateOfdeparture
	 * @param statusofFlight
	 * @param bookingsList
	 */
	public Flight(Long flightNo, String carrierName, String flightModel, Long seatCapacity, String dateOfdeparture,
			String statusofFlight, List<Booking> bookingsList) {
		super();
		this.flightNo = flightNo;
		this.carrierName = carrierName;
		this.flightModel = flightModel;
		this.seatCapacity = seatCapacity;
		this.dateOfdeparture = dateOfdeparture;
		this.statusofFlight = statusofFlight;
		this.bookingsList = bookingsList;
	}
	
	


	/**
	 * @return the flightNo
	 */
	public Long getFlightNo() {
		return flightNo;
	}




	/**
	 * @param flightNo the flightNo to set
	 */
	public void setFlightNo(Long flightNo) {
		this.flightNo = flightNo;
	}




	/**
	 * @return the carrierName
	 */
	public String getCarrierName() {
		return carrierName;
	}




	/**
	 * @param carrierName the carrierName to set
	 */
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}




	/**
	 * @return the flightModel
	 */
	public String getFlightModel() {
		return flightModel;
	}




	/**
	 * @param flightModel the flightModel to set
	 */
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}




	/**
	 * @return the seatCapacity
	 */
	public Long getSeatCapacity() {
		return seatCapacity;
	}




	/**
	 * @param seatCapacity the seatCapacity to set
	 */
	public void setSeatCapacity(Long seatCapacity) {
		this.seatCapacity = seatCapacity;
	}




	/**
	 * @return the dateOfdeparture
	 */
	public String getDateOfdeparture() {
		return dateOfdeparture;
	}




	/**
	 * @param dateOfdeparture the dateOfdeparture to set
	 */
	public void setDateOfdeparture(String dateOfdeparture) {
		this.dateOfdeparture = dateOfdeparture;
	}




	/**
	 * @return the statusofFlight
	 */
	public String getStatusofFlight() {
		return statusofFlight;
	}




	/**
	 * @param statusofFlight the statusofFlight to set
	 */
	public void setStatusofFlight(String statusofFlight) {
		this.statusofFlight = statusofFlight;
	}




	/**
	 * @return the bookingsList
	 */
	public List<Booking> getBookingsList() {
		return bookingsList;
	}




	/**
	 * @param bookingsList the bookingsList to set
	 */
	public void setBookingsList(List<Booking> bookingsList) {
		this.bookingsList = bookingsList;
	}




	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", carrierName=" + carrierName + ", flightModel=" + flightModel
				+ ", seatCapacity=" + seatCapacity + ", dateOfdeparture=" + dateOfdeparture + ", statusofFlight="
				+ statusofFlight + ", bookingsList=" + bookingsList + "]";
	}


	/**
	 * 
	 */
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	


}
