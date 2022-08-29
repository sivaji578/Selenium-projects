package com.google.thread.classes;

import org.testng.annotations.Test;

public class TestRunBrowser extends Practice {
	@Test
	public void trailData()
	{
		Thread t1=new PracticeSecondProgram("ChromeThread", "Chrome");
		Thread t2=new PracticeSecondProgram("ChromeThread", "Chrome");
		t1.start();
		t2.start();
	}

}
