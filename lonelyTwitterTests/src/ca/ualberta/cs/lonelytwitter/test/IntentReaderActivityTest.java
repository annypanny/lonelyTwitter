package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.R;


public class IntentReaderActivityTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity>
{

	public IntentReaderActivityTest()
	{

		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception
	{

		super.setUp();
	}
	
	public void testSendText() {
		String text = "Hello World!";
		// if not edit anything in UI, then use normal is fine
		int code = IntentReaderActivity.NORMAL;
		IntentReaderActivity activity = startwithText(text,code);
		assertEquals("Is the text correct?", text, activity.getText());	
	}
	
	public void testDoubleText() {
		String text = "Hello";
		IntentReaderActivity activity = startwithText(text, IntentReaderActivity.DOUBLE);
		assertEquals("Double transform working?", text+text, activity.getText());
	}
	
	// test the reverse text
	public void testReverse() {
		String text = "Hello";
		int code = IntentReaderActivity.REVERSE;
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY,code);
		setActivityIntent(intent);
		IntentReaderActivity activity = startwithText(text, code);
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		ViewAsserts.assertOnScreen(activity.getWindow().getDecorView(),view);		
	}


	public void testDisplayText() {
		String text = "Hello World!";
		IntentReaderActivity activity = startwithText(text,IntentReaderActivity.NORMAL);
		assertEquals("correct text?",text,activity.getText());
		
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("displays correct text?",text,view.getText().toString());
	}
	
	private IntentReaderActivity startwithText(String text, int code) {
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY,code);
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();
	}

}
