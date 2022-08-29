package com.google.thread.classes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Trail.Google;

public class GoogleFeatureThread extends Thread{
	public String browserName;
	Google google;
	public GoogleFeatureThread(String threadName,String browserName)
	{
		super(threadName);
		this.browserName = browserName;
	}
    public void run()
    {
    	
    	google= new Google(new ChromeDriver());
    	System.out.println("The First Thread Start Here"+Thread.currentThread().getName());
    	try
    	{
    		Thread.sleep(2000);
    		google.first(this.browserName);
    		google.setDataValue();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		google.tearDown();
    	}
    	System.out.println("The thread is ended"+Thread.currentThread().getName());
    
    }
}
