import org.testng.annotations.Test;

import com.google.thread.classes.GoogleFeatureThread;

public class GoogleTestRunner {
	
	public static void main(String[] args) {
		Thread t1=new GoogleFeatureThread("ChromeThread", "Chrome");
//	    Thread t2=new GoogleFeatureThread("FirefoxThread", "Firefox");
		System.out.println("Thread execution start here");
	    t1.start();
//		t2.start();
	}
 
	public void data()
	{
	
		
//		int chromeCount=Integer.parseInt(System.getProperty("Chrome"));
//		int firefoxCount=Integer.parseInt(System.getProperty("Firefox"));
//		for(int i=0,j=0;i<chromeCount||j<firefoxCount;i++,j++)
//		{
//			System.out.println("Thread Started");
//			new GoogleFeatureThread("ChromeThread", "Chrome").start();
//			new GoogleFeatureThread("FirefoxThread", "Firefox").start();
//		}
	}
}


