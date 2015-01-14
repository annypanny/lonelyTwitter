package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;


public class Reader extends User
{
	private static Boolean enabled = false;
	public void setName(String name) throws IOExcepetion  //if change name = x, 
	{
        if (x.length() > 8) {
        	// throw an exception (new &runtime) and call
        	//throw new RuntimeErrorException("Name too long");
        	throw new IOException("Name too long!");
        }
		this.name = x;
		
	}

}
