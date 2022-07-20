package net.example.spring.exception;

public class Flightnotfoundexception extends Exception{
	
 public Flightnotfoundexception(String s)
 {
	 System.out.println("The flight with given details are not exists with id = "+s);
 }

}
