package com.playstore.users.Exceptions;

public class AppCannotBeDeletedException extends Exception{

	public AppCannotBeDeletedException()
	{
		super("App cannot be deleted");
	}
}