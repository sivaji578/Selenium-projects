package TestData.JobTrack360Maven;

import org.testng.annotations.Test;

public class compingClassTest extends CompingClass{
	@Test
	public void launch() throws InterruptedException
	{
		Basic n=new Basic();
		n.second();
		first();
	}

}
