package TestData.JobTrack360Maven;

import org.testng.annotations.Test;

public class EmailTest extends Email{
	@Test
	public void emailLogin() throws InterruptedException
	{
		Basic b=new Basic();
		b.third();
		loginFlow();
	}

}
