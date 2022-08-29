package GridFirstProject;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

public class GridFirstClass {
	public void test1()
	{
		try
		{
		System.out.println("this is first one");
		DesiredCapabilities ds=new DesiredCapabilities();
		}
		catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
		
	}

}
