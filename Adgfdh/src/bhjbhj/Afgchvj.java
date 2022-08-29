package bhjbhj;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class Afgchvj extends base {
	
	
	
		By BookAppoinmentN      = By.xpath("//button[text()='Book Appointment Now']");
		By PhoneNo              = By.xpath("//input[@name='phone']");
		By Checkbx              = By.xpath("//input[@name='sendMessagesAboutTestResults']");
		By Savecontinue0        = By.xpath("//button[text()='Save & Continue']");
		By Email                = By.xpath("//input[@name='email']");
		By Confirmemail         = By.xpath("//input[@name='confirmEmail']");
		By Savecontinue         = By.xpath("//button[text()='Save & Continue']");
		By Selectalllocation    = By.xpath("html/body/div/div/div/div/div/form/div/button/div[1]/div");
		//By Selectalllocation    = By.xpath("(//div[@class='sc-jgPznn eEthnu'])[9]");
		By Majorcheckbox        = By.xpath("//input[@name='haCustomer']");
		By Firstnam             = By.xpath("//input[@name='firstName']");
		By Lastnam              = By.xpath("//input[@name='lastName']");
		By Datebirth            = By.xpath("//input[@placeholder='MM/DD/YYYY']");
		By Passportcoutry       = By.xpath("//div[@class=' css-14e1rle']");
		
		By Dropdownpassportcoutry= By.xpath("//div[@class=' css-26l3qy-menu']/div/div");
		By Passport             = By.xpath("//input[@name='passportNo']");
		By Minorcheckbox        = By.xpath("//input[@name='hasMinors']");
		By MFirstnam            = By.xpath("//input[@name='minors.0.firstName']");
		By MLastnam             = By.xpath("//input[@name='minors.0.lastName']");
		By Datebirth2           = By.xpath("(//input[@placeholder='MM/DD/YYYY'])[2]");
		By Relatship            = By.xpath("//input[@name='minors.0.relationship']");
		By Passportcoutry2       = By.xpath("(//div[@class=' css-8atqhb'])[2]");
		By Minorpassport        = By.xpath("//input[@name='minors.0.passportNo']");
		By Savecontinue1        = By.xpath("//button[text()='Save & Continue']");
		By Streetadres          = By.xpath("//input[@name='address.address']");
		By Cty                  = By.xpath("//input[@name='address.city']");
		By Stateslct            = By.xpath("//div[@class=' css-11unzgr']/div");
		By stateTextField       = By.xpath("//div[@class=' css-14e1rle']");
		//By Stateslct            = By.xpath("//div[@class=' css-1wa3eu0-placeholder']");
		//By Dropdown             = By.xpath("")
		By Zipcde		        = By.xpath("//div[text()='ZIP Code']/../div/input");//("//input[@name='address.zipCode']");
		By Savecontinue2        = By.xpath("//button[contains(@type,'submit')]");//("//button[text()='Save & Continue']");
		By Flightdeparture      = By.xpath("//input[@class='sc-gXfWUo dfGyKR']");
		By Date                 = By.xpath("//div[@class='react-datepicker__day react-datepicker__day--031']");
		By Time                 = By.xpath("//li[text()='1:00 AM']");
		By Slots                = By.xpath("//button[@class='sc-TtZHJ cZREMU']");
		By SaveContinu3         = By.xpath("//button[@class='sc-fujyUd cVgsMG']");
		// By Calendr              = By.xpath("(//div[@class='react-datepicker__month'])[1]/div/div");
		By Symtom               = By.xpath("//button[text()='Yes']");
		By Checkbox             = By.xpath("//input[@class='sc-jcwofb jtftyQ']");
		By Savecontinu4         = By.xpath("//button[@class='sc-fujyUd cVgsMG']");
		By covidyes             = By.xpath("//button[text()='Yes']");
		By Savecontinu5         = By.xpath("//button[text()='Save & Continue']");
		By Confirmedcovid19No     = By.xpath("//button[text()='No']");
		By Savecontinu6         = By.xpath("//button[text()='Save & Continue']");
		By Male                 = By.xpath("(//input[@type='radio'])[2]");
		By Racewhite            = By.xpath("(//input[@class='sc-jcwofb jtftyQ'])[8]");
		By Prefernotstate       = By.xpath("(//input[@class='sc-jcwofb jtftyQ'])[13]");
		By Savecontinu7         = By.xpath("//button[text()='Save & Continue']");
		By Hippacheckb1         = By.xpath("//input[@name='hipaaConfirmed']");
		By Hippacheckb2         = By.xpath("//input[@name='consentForTesting']");
		By Savecontinu8         = By.xpath("//button[text()='Save & Continue']");
		By Commitec1            = By.xpath("//input[@name='commitToAttend']");
		By Agreec1              = By.xpath("//input[@name='agreeToCancel']");
		By Confirpay            = By.xpath("//button[text()='Confirm & Pay']");
		By Cardno               = By.xpath("//input[@placeholder='Card number']");
		By Expdate              = By.xpath("//input[@name='exp-date']");
		By Cvc                  = By.xpath("//input[@name='cvc']");
		By Zip                  = By.xpath("//input[@placeholder='ZIP']");
		By Pay                  = By.xpath("(//button[@type='submit'])[2]");
		//Accepting the excel data

		Object data[][] = null;
		JavascriptExecutor js;

		@Test(dataProvider="Required_Data")
		public void allBookAppointmentDetails(String PhNo,String EmailID,String ConfirmEmailID,
				String MajorFN,String MajorLN,String MajorDOB,
				String streetAd,String city, String Zipcode,String DepartureDateAndTime,
				String CardNo,String ExpDate,String CVC ,String CardZipcode)
		{
			
		
		}
		
		
		
		
		//Click BookAppoinment Now option
		public void bookAppoinmentNow() throws IOException
		{
//			data_value
			/*getExcel();
			for(int i=1;i<=row;i++) 
		    { 
			 for(int j=0;j<=cell-1;j++)
			 {
	                System.out.println(data_value[i][j]);
			 }
			}*/
			WebElement ban      = driver.findElement(BookAppoinmentN);
			ban.click();
		}
		//Click phone number option after enter the phone number
		public void phoneNumber()
		{
			WebElement pn       = driver.findElement(PhoneNo);
			pn.sendKeys("9490076668");
		}
		//Select Check box
		public void checkBox()
		{
			WebElement cb       = driver.findElement(Checkbx);
			cb.click();
		}
		public void savecontinue()
		{
			WebElement ssc      =driver.findElement(Savecontinue0);
			ssc.click();
		}
		//Enter Email
		public void email()
		{
			WebElement emaill   = driver.findElement(Email);
			emaill.click();
			emaill.sendKeys("skasi@worksitelabs.com");
			WebElement conformemail= driver.findElement(Confirmemail);
			conformemail.click();
			conformemail.sendKeys("skasi@worksitelabs.com");
		}
		public void saveContinueOption()
		{
			WebElement sc        = driver.findElement(Savecontinue);
			sc.click();
		}
		//So many covid reporting centers there,now selecting one center,Click save&continue option also
		public void selectLocation()
		{
			WebDriverWait wait = new WebDriverWait(driver,99);
			wait.until(ExpectedConditions.visibilityOfElementLocated(Selectalllocation));
			
//			WebElement ele = driver.findElement(Selectalllocation);
//			ele.click();
			List<WebElement> sl  = driver.findElements(Selectalllocation);
			for(int i=0;i<=sl.size()-1;i++) {
				String Locationname=sl.get(i).getText();
				System.out.println(Locationname);
				if(Locationname.equalsIgnoreCase("San Diego - WallyPark Airport Parking"))
				{
					sl.get(i).click();
				}
				
			}
			WebElement sc1       = driver.findElement(Savecontinue);
	        sc1.click();		
		}
		//Registered all major person details
		public void majorDetails()
		{
			WebElement mcb        =driver.findElement(Majorcheckbox);
			mcb.click();
			WebElement fn1        =driver.findElement(Firstnam);
			fn1.sendKeys("Shekhar");
			WebElement ln1        =driver.findElement(Lastnam);
			ln1.sendKeys("kamula");
			
			waitForElement(Datebirth);
			WebElement dob        =driver.findElement(Datebirth);
			//dob.click();
			dob.sendKeys("12/05/1997");
			WebElement passportfield=driver.findElement(Passportcoutry);
			passportfield.click();
			
			waitForElement(Dropdownpassportcoutry);
			List <WebElement> passportdd=driver.findElements(Dropdownpassportcoutry);
			for(int i=0;i<=passportdd.size()-1;i++)
			{
				String  pascountry=passportdd.get(i).getText();
						System.out.println(pascountry);
				if(pascountry.equals("India"))
				{
					passportdd.get(i).click();
					break;
					
				}
			}
			
			WebElement passports  =driver.findElement(Passport);
			passports.sendKeys("ss#123");
			
			
		}
		public void minorDetails() throws InterruptedException
		{
			WebElement micb        =driver.findElement(Minorcheckbox);
			micb.click();
			WebElement fn2         =driver.findElement(MFirstnam);
			fn2.sendKeys("Shanu");
			WebElement ln2         =driver.findElement(MLastnam);
			ln2.sendKeys("s");
			
			waitForElement(Datebirth2);
			WebElement dob1        =driver.findElement(Datebirth2);
			//dob1.click();
			dob1.sendKeys("05/05/2021");
			
			WebElement relationship=driver.findElement(Relatship);
			relationship.sendKeys("son");
			
			waitForElement(Passportcoutry2);
			WebElement passportfield1=driver.findElement(Passportcoutry2);
			passportfield1.click();
			
			waitForElement(Dropdownpassportcoutry);
			List <WebElement> passportdd2=driver.findElements(Dropdownpassportcoutry);
			for(int i=0;i<=passportdd2.size()-1;i++)
			{
				String  pascountry1=passportdd2.get(i).getText();
						System.out.println(pascountry1);
				if(pascountry1.equals("India"))
				{
			
					passportdd2.get(i).click();
					break;
					
				}
			}
			WebElement mipassport  =driver.findElement(Minorpassport);
			mipassport.sendKeys("ss123456");
			
			
			WebElement sc1         =driver.findElement(Savecontinue1);
			sc1.click();
		}
	//What is your address page
		public void yourAddressPage() throws InterruptedException
		{
			WebElement sa=driver.findElement(Streetadres);
			sa.sendKeys("Golden street");
			WebElement city=driver.findElement(Cty);
			city.sendKeys("newyork");
//			WebDriverWait wait = new WebDriverWait(driver,99);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(Stateslct));
			
			waitForElement(stateTextField);
			WebElement we = driver.findElement(stateTextField);
			we.click();
			List <WebElement> stateselectlocation=driver.findElements(Stateslct);
			for(int i=0;i<=stateselectlocation.size()-1;i++)
			{
			String stlc=stateselectlocation.get(i).getText();
			System.out.println(stlc);
			if(stlc.equalsIgnoreCase("California"))
			{
				stateselectlocation.get(i).click();
				break;
			}
			}
			
			waitForElement(Zipcde);
			WebElement zipcode=driver.findElement(Zipcde);
			zipcode.click();
			zipcode.sendKeys("60019");
			
			//waitForElement(Savecontinue2);
			Thread.sleep(5000);
			WebElement savecontnue2=driver.findElement(Savecontinue2);
			savecontnue2.click();
		}
	//Flight departure time&date
		public void departureDateandSlots() throws InterruptedException
		{
			WebElement departure=driver.findElement(Flightdeparture);
			departure.click();
			WebElement datee=driver.findElement(Date);
			datee.click();
			WebElement timee=driver.findElement(Time);
			timee.click();
			
			Thread.sleep(3000);
			List <WebElement> slot=driver.findElements(Slots);
			for(int i=0;i<=slot.size()-1;i++)
			{
				if(slot.get(i).isEnabled())
				{
					slot.get(i).click();
					break;
				}
				else
				{
					System.out.println(i+"Slots is not available");
				}
			}
			WebElement savecontinue3=driver.findElement(SaveContinu3);
			savecontinue3.click();
		}
		public void symptoms()
		{
			WebElement s=driver.findElement(Symtom);
			s.click();
			WebElement chekbox=driver.findElement(Checkbox);
			chekbox.click();
			WebElement savecontinue4=driver.findElement(Savecontinu4);
			savecontinue4.click();
		}
		// CHRONIC MEDICAL CONDITION PAGE
		public void chronicMedicalCondition()
		{
			waitForElement(covidyes);
			WebElement covidyess        = driver.findElement(covidyes);
			covidyess.click();
			WebElement savecontinue5    = driver.findElement(Savecontinu5);
			savecontinue5.click();
		}
		//Case of Covid-19 contact confirmation page
		public void covidConfirmedPage()
		{
			WebElement confirmcovidno              = driver.findElement(Confirmedcovid19No);
			confirmcovidno.click();
			WebElement savecontinue6               = driver.findElement(Savecontinu6);
			savecontinue6.click();
		}
		public void demoGraphicPage()
		{
			WebElement malec                      = driver.findElement(Male);
			malec.click();
			WebElement whitec                     = driver.findElement(Racewhite);
			whitec.click();
			WebElement preferencenotshowc         = driver.findElement(Prefernotstate);
			preferencenotshowc.click();
			WebElement savecontinue7              = driver.findElement(Savecontinu7);
			savecontinue7.click();
		}
		public void hippaPage()
		{
			WebElement hippac1                    = driver.findElement(Hippacheckb1);
			hippac1.click();
			WebElement hippac2                    = driver.findElement(Hippacheckb2);
			hippac2.click();
			WebElement savecontinue8              = driver.findElement(Savecontinu8);
			savecontinue8.click();
		}
		//CONFIRM YOUR BOOKING APPOINTMENT
		public void confirmBookAppointment()
		{
			WebElement commitecheckbox1            = driver.findElement(Commitec1);
			commitecheckbox1.click();
			WebElement agreecheckbox2              = driver.findElement(Agreec1);
			agreecheckbox2.click();
			WebElement confirmtopay                = driver.findElement(Confirpay);
			confirmtopay.click();
		}
		public void cardDetails() throws InterruptedException
		{
			driver.switchTo().frame(2);
		    waitForElement(Cardno);
			WebElement cardnumber                  = driver.findElement(Cardno);
			cardnumber.click();
			cardnumber.sendKeys("4242424242424242");
			WebElement expiredate                  = driver.findElement(Expdate);
			expiredate.sendKeys("12/25");
			WebElement cvv                         = driver.findElement(Cvc);
			cvv.sendKeys("1466");
			WebElement zipcode                    = driver.findElement(Zip);
			zipcode.sendKeys("52015");
			waitForElement(Pay);
			WebElement paymoney                    = driver.findElement(Pay);
			paymoney.click();
		}

		@DataProvider(name="Required_Data")
		public Object[][] loginDataProvider() throws IOException 
		{ 
			data=getExcel();
			return data;
		}

		public Object[][] getExcel() throws IOException { 
			FileInputStream f=new	FileInputStream("C:\\Users\\HP\\Desktop\\No_Minor.xlsx"); 
			XSSFWorkbook wb=new XSSFWorkbook(f); 
			XSSFSheet sheet=wb.getSheetAt(0); 
			int row=sheet.getLastRowNum(); short cell=sheet.getRow(row).getLastCellNum();
					System.out.println(row); System.out.println(cell); 
					Object[][] data_value=new Object[row][cell];
					for(int i=1;i<=row;i++) 
					{ 
						for(int j=0;j<=cell-1;j++)
						{

							data_value[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
							System.out.println(data_value[i-1][j]); 
							System.out.println(i+","+j);
							}
						}


					return data_value;

		}


		

}
