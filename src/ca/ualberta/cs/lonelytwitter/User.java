package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class User extends Object implements UserLike 
{
	protected String name;
	
	public String getName()
	{
		return name;
	}

	
	public abstract void setName(String x) throws IOException;//if change name = x, 
	
	// this return to the User (eg:this=self in python) 
		// name = x (no need for this)
		//this.name = x;
		
	

	public User(String name)
	{
		// calling the constructor, and constructor calling superclass
		super();
		this.name = name;
	}
	
	public User()
	{
		super();
		// if the user don't want to use name
		this.name = "anonymous"
	
	
	

}
