package net.example.spring.service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.example.spring.exception.Flightnotfoundexception;
import net.example.spring.model.Flight;
import net.example.spring.repo.Flightrepo;

@Service
public class Flightservice {
	
	@Autowired Flightrepo repo;
	
	
	public void saveFlight(Flight f)
	{
		repo.save(f);
	}
	
	public List<Flight> findAll()
	{
		return new ArrayList(repo.findAll());
	}
	
	public Optional<List<Flight>> findbyId(String id ) throws Flightnotfoundexception
	{
		Optional<List<Flight>> f=repo.findbydate(id);
		if(f.isEmpty())
		{
			throw new Flightnotfoundexception(id);
		}
		return repo.findbydate(id);
	}
	
	void deletebyId(String parseLong)
	{
		// repo.findbydate(parseLong);
		
	//	return f;
		
	}

}
