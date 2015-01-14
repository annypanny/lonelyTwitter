package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

import android.widget.ArrayAdapter;


public class LonelyTweetFavourite extends User
{
    private Date timestamp;
    private ListView OldFavList;
    
    public FavTweet (Tweet tweet, User user) {
    	this.tweet = tweet;
    	this.user = user;
    }
    
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
			R.layout.list_item, tweets);
    OldFavList = setAdapter(adapter);
    
	@Override
	public void setName(String x) throws IOException
	{
		// TODO Auto-generated method stub
		  if (x.length() > 8) {
	        	throw new IOException("Name too long!");
	        }
			this.name = x;

	}

}
