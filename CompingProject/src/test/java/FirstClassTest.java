import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstClassTest extends Base{
	FirstClass f;
	
	@BeforeTest
	public void openBroser()
	{
		launch();
		f =new FirstClass(driver);
	}
	@Test
	public void loginBrowser() throws InterruptedException
	{
		
		f.login();
	}
	
}
