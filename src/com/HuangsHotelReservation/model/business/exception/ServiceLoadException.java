package com.HuangsHotelReservation.model.business.exception;

@SuppressWarnings("serial")
public class ServiceLoadException extends Exception{
	
	public ServiceLoadException(final String inputMessage,final Throwable exception) 
	{
		super(inputMessage,exception);
	}
	
}
