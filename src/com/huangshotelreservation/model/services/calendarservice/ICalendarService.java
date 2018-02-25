package com.huangshotelreservation.model.services.calendarservice;

import com.huangshotelreservation.model.domain.City;
import com.huangshotelreservation.model.domain.Room;
import com.huangshotelreservation.model.services.IService;
import com.huangshotelreservation.model.services.exception.CalendarException;

//TO-DO: This is a place holder for the second highest priority use case.
public interface ICalendarService extends IService{
	
	public final String NAME = "ICalendarService";
	
	public boolean RetrieveAvaliableRoom(City city,Room room) throws CalendarException;
}
