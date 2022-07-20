package net.example.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.example.spring.exception.Flightnotfoundexception;
import net.example.spring.model.Booking;
import net.example.spring.model.Flight;
import net.example.spring.repo.Bookingrepo;
import net.example.spring.repo.Flightrepo;
import net.example.spring.service.Flightservice;

@RestController
public class Controller {
	@Autowired Flightservice flightService;
	
	@Autowired Bookingrepo bookingService;
	
	/*
	 * 
	 * for(Product prod: o.getProdList())
		{
			prod.setOwner(o);
		}
		//System.out.println("Product list is"+o.getProdList());
		//System.out.println("Inside owner"+o.toString());
		repo.save(o);
		return ResponseEntity.ok(o);
	 */
	
	@PostMapping("/addFlight")
	public ResponseEntity<Flight> addFlight(@RequestBody Flight f)
	{
		System.out.println("############################################"+f.toString());
		f.setStatusofFlight("Active");
		for(Booking b:f.getBookingsList())
		{
			b.setBookingStatus("Active");
			b.setFlight(f);
			bookingService.save(b);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+f.getBookingsList());
		System.out.println("############################################"+f.toString());
		
		flightService.saveFlight(f);
		return null;
	}
	
	@PostMapping("/addBooking")
	public ResponseEntity<Flight> addBooking(@RequestBody Booking b)
	{
	  //b.setFlight(null)
		b.setBookingStatus("Active");
		bookingService.save(b);
		return null;
	}
	
	@GetMapping("/viewFlights")
	public ResponseEntity<List> view()
	{
		
		
		return new ResponseEntity<>(flightService.findAll(),HttpStatus.OK);
		
	}
	
	
	
	
	
	
	@GetMapping("/findbyId/{date}")
	public ResponseEntity<Optional<List<Flight>> > viewbyDate(@PathVariable String date) throws Flightnotfoundexception
	{
		System.out.println("ddddddddddddddddddddddddddddddddddddddd"+date);
		Optional<List<Flight>> f=flightService.findbyId(date);
		
		return ResponseEntity.ok(flightService.findbyId(date));
	}

}
