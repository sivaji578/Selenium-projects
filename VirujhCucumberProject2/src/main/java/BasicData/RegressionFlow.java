package BasicData;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class RegressionFlow extends Base{
	By findaRooms=By.xpath("//li[@class='header__nav-item find-rooms']//a[text()='Find rooms']");
	By AddtoBooking=By.xpath("//button[text()='Add to Booking']");
	By Service  =By.xpath("//div[@data-testid='serviceTypeMultiple']");
	By disabilityinformation=By.xpath("//select[@data-testid='selectListSelect']//option[text()='Disability information and support']");
	By clickSelectTable = By.xpath("//input[@placeholder='Select date']");
	By nextmonth        = By.xpath("//button[@aria-label='Next Month']");
	By allDates         = By.xpath("//div[@tabindex='-1']");
	By startTime        = By.xpath("//select[@id='slots.0.startTime']");
	By addnewhost       = By.xpath("(//a[@class='button button--text'])[2]");
	By firstname        = By.xpath("//input[@data-testid='firstNameInput']");
	By lastname         = By.xpath("//input[@data-testid='lastNameInput']");
	By emailhost        = By.xpath("//input[@data-testid='emailInput']");
	By phonenumber      = By.xpath("//input[@data-testid='telephoneInput']");
	By addhostbutton    = By.xpath("//button[text()='Add host to booking']");
	By selectHost       = By.xpath("//div[@class=' css-b99yo3']");
	By addToBasket      = By.xpath("//button[@data-testid='addToBasketButton']");
	By clickBasketBtn   = By.xpath("//button[text()='Add to Basket']");
	By Successmsg       = By.xpath("//h2[text()='Successfully added to basket']");
	By continuetoshoping= By.xpath("//button[text()='Continue booking']");
	By firstavilslot    = By.xpath("//li[@class='booking-slot']");
	
	public void findaRoom()
	{
		WebElement findrooms=driver.findElement(findaRooms);
		findrooms.click();
	}
	public void addBooking() throws InterruptedException
	{
		Thread.sleep(3000);
		List<WebElement> AddtBooking=driver.findElements(AddtoBooking);
		for(int i=0;i<AddtBooking.size();i++)
		{
			String addBookingbutton=AddtBooking.get(i).getText();
			if(addBookingbutton.equalsIgnoreCase("Add to Booking"))
			{
			AddtBooking.get(i).click();
			break;
			}
		}
	}
	public void emergencyService(String Ser,String disa) throws InterruptedException
	{
    Thread.sleep(4000);
	WebElement servicefield= driver.findElement(Service);
	servicefield.click();
	WebElement dropdownElement=driver.findElement(disabilityinformation);
	dropdownElement.click();
	}
	public void selectDate() throws InterruptedException
	{
		WebElement openTable  = driver.findElement(clickSelectTable);
		openTable.click();
		WebElement sidearrow  = driver.findElement(nextmonth);
		sidearrow.click();
		Thread.sleep(4000);
		List<WebElement> AllDate =driver.findElements(allDates);
		for(int i=0;i<AllDate.size();i++)
		{
			//int k=0;
			String text=AllDate.get(i).getText();
			if(text.equalsIgnoreCase("11"))
			{
				//k++;
				AllDate.get(i).click();
				break;
			}
		}
	}
	public void startstime() throws InterruptedException {
		Thread.sleep(4000);
		Select stime=new Select(driver.findElement(startTime));
		stime.selectByValue("10:00");
	}
	public void selectsHost() throws InterruptedException
	{
		 System.out.println("select host testing");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,300)","");
	WebElement addnewhostbtn= driver.findElement(addnewhost);
	addnewhostbtn.click();
    WebElement firstnamebtn= driver.findElement(firstname);
    firstnamebtn.sendKeys("harish");
    WebElement lastnamebtn= driver.findElement(lastname);
    lastnamebtn.sendKeys("painooru");
    WebElement emailbtn= driver.findElement(emailhost);
    emailbtn.sendKeys("yanka@softsuave.com");
    WebElement phonenumberbtn=driver.findElement(phonenumber);
    phonenumberbtn.sendKeys("9618789876");
    WebElement addhostbtn= driver.findElement(addhostbutton);
    addhostbtn.click();
   
//	Thread.sleep(4000);
//	Actions a=new Actions(driver);
//	WebElement SHost  = driver.findElement(selectHost);
//	a.moveToElement(SHost).click().build().perform();
//	
//	//SHost.click();
//	SHost.sendKeys("brand new"+Keys.ENTER);
	}
	public void addBasket()
	{
		Boolean AdBasketBtn =driver.findElement(addToBasket).isEnabled();
		if(AdBasketBtn) {
			System.out.println("Button is enable");
		}
		else
		{
			System.out.println("Button is disable");
		}
	}
	public void clickAddtoBasket()
	{
		WebElement cliAddToBasketBtn=driver.findElement(clickBasketBtn);
		cliAddToBasketBtn.click();
	}
	public void validatesuccessMsg() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement successmessage = driver.findElement(Successmsg);
		String SMsg = successmessage.getText();
		System.out.println(SMsg);
		String Expectedmsg="Successfully added to basket";
		//Assert.assertEquals(SMsg,Expectedmsg);
	}
	public void continueshoppingbtn() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement continuebtn = driver.findElement(continuetoshoping);
		continuebtn.click();
	}
	public void firstavilableslot()
	{
		List<WebElement> allavailbleslots=driver.findElements(firstavilslot);
		for(int i=0;i<=allavailbleslots.size();i++)
		{
		String slotText=allavailbleslots.get(i).getText();
		if(slotText.equalsIgnoreCase("SELECT SLOT"))
		{
			allavailbleslots.get(i).click();
			break;
		}
	    }
	}
	

}
