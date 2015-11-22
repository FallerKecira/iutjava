package edu.iut.app;

import java.util.ArrayList;

/*
 * 
 * 
 * 
 * 
 */
public interface IApplicationLog {

	public void setMessage(String message);
	
	public String getMessage();
	
	public void addListener(IApplicationLogListener listener);
	
	public ArrayList<IApplicationLogListener> getApplicationLogListeners();
	
	
}
