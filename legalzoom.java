
package Zoom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class legalzoom {

	ChromeDriver driver;

	@BeforeClass
	public void InvokeBrowser() {

		// CromeDriver Path ...................

		System.setProperty("webdriver.chrome.driver","E:\\Only Crome download\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.legalzoom.com/country/in");

	}

	// We set Priority to each method....

	@Test(priority = 0)
    //Here I'm verifying the title of the Page if it's true only your script execute ahed.
	public void VerifyTitleOfPage() {

		String expected_Title = "LegalZoom | Start a Business, Protect Your Family: LLC Wills Trademark Incorporate & More Online | LegalZoom";

		String Actual_Title;

		Actual_Title = driver.getTitle();

		Assert.assertEquals(Actual_Title, expected_Title);

	}

	@AfterClass
            //This Method run after completing whole method 
	public void CloseBrowser() {

		System.out.println("Done.");
		try {
			driver.wait(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}

	@Test(priority = 50)
             //To click Personal and then Living trust
	public void FindPersonalButton() throws InterruptedException {

		WebElement personal = driver.findElement(By.id("nav-heading-personal"));

		personal.click();

		driver.findElement(By.id("nav-personal-item-3")).click();

		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"hero915-cta-button\"]")).click();

		Thread.sleep(1000);

		
		driver.findElement(By.xpath("//*[@id=\"collapse1623156477351-1\"]/div/div/a")).click();

		Thread.sleep(1000);
	}

	@Test(priority = 100)

	public void ClickonPersonalInfo() {

		System.out.println("Personal info");
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();
	}

	@Test(priority = 150)

	public void FillPropertyInfo() throws InterruptedException {

		WebElement Radio1 = driver.findElement(By.xpath("//*[@id=\"chkctlgrantor_selfonly_CB\"]"));
		Radio1.click();

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();

	}

	@Test(priority = 200)

	public void TellAboutYourself() throws InterruptedException {

		// Name
		driver.findElement(By.name("grantor_first|290240")).sendKeys("ZAIN");
		// Last Name
		driver.findElement(By.name("grantor_last|290242")).sendKeys("Alttam");

		driver.findElement(By.name("grantor_aka|290243")).sendKeys("1320 N new st Bethlehem Pennsylvania  18018 ");

		driver.findElement(By.name("phone_number|295550")).click();
		driver.findElement(By.name("phone_number|295550")).sendKeys("956-999-9999");

		Select select = new Select(driver.findElement(By.name("grantor_married_MC|290244")));

		select.selectByVisibleText("No");

		Select select1 = new Select(driver.findElement(By.name("grantor_children_MC|290247")));

		select1.selectByVisibleText("No");

		Select select2 = new Select(driver.findElement(By.name("PetOwner|298228")));

		select2.selectByVisibleText("No");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();

		driver.findElement(By.name("grantor_address|290261")).sendKeys("1320 N new st Bethlehem Pennsylvania ");
		driver.findElement(By.name("grantor_city|290262")).sendKeys("Riyad");
		driver.findElement(By.name("grantor_county|290263")).sendKeys("Dubai");

		Select slr = new Select(driver.findElement(By.name("grantor_state|290264")));
		slr.selectByVisibleText("Maine");

		driver.findElement(By.name("grantor_zip|290526")).sendKeys("443342");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();

	}

	@Test(priority = 250)

	public void PropertyCheckBoxes() throws InterruptedException {

		WebElement Radio2 = driver.findElement(By.xpath("//*[@id=\"chkctlproperty_insurance_CB\"]"));
		Radio2.click();

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();

		driver.findElement(By.name("property_insurance_info_issuer_1|-89607")).sendKeys("Zein");

		Thread.sleep(1000);

		driver.findElement(By.name("property_insurance_info_desc_1|-89608")).sendKeys("Alttam");

		Thread.sleep(1000);

		driver.findElement(By.name("property_insurance_info_number_1|-89609")).sendKeys("123445343");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();

		Thread.sleep(1000);

		driver.findElement(By.name("grantor_heir_info_percent_1|-89676")).sendKeys("100%");

		Thread.sleep(1000);

		driver.findElement(By.name("grantor_heir_info_name_1|-89677")).sendKeys("Zain A");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("first_successor_trustee|290415")).sendKeys("XYZ");
		Thread.sleep(1000);
		driver.findElement(By.name("second_successor_trustee|290416")).sendKeys("ZZYY");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();
	}

	@Test(priority = 300)

	public void PlanningOptions() throws InterruptedException {

		WebElement Radio3 = driver.findElement(By.xpath("//*[@id=\"chkctllw_self_CB\"]"));
		Radio3.click();

		WebElement Radio4 = driver.findElement(By.xpath("//*[@id=\"chkctlpoa_self_CB\"]"));
		Radio4.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_btnContinue2\"]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ibTestContinueBottom\"]")).click();

		Thread.sleep(1000);

		driver.findElement(By.name("fkPostOption")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_imgButton_Continue\"]")).click();
	}

	@Test(priority = 350)

	public void SecureCheackOut() throws InterruptedException {

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"download-option\"]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"button-next\"]")).click();
		Thread.sleep(1000);

		// Complete your oreder detaills

		driver.findElement(By.name("ctl00$cphMainContent$txt_ContactInfo_FName")).sendKeys("Zain");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$cphMainContent$txt_ContactInfo_LName")).sendKeys("Ahmed");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$cphMainContent$txt_ContactInfo_EmailAddress")).sendKeys("ZainAh34@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_ContactInfo_PhoneNumber\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_ContactInfo_PhoneNumber\"]"))
				.sendKeys("999-999-9999");

		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$cphMainContent$txt_ContactInfo_Street1")).sendKeys("Riyad saudi ");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$cphMainContent$txt_ContactInfo_ZipCode")).sendKeys("90210");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$cphMainContent$txt_ContactInfo_City")).sendKeys("Saudi");
		Thread.sleep(1000);

		Select select5 = new Select(driver.findElement(By.name("ctl00$cphMainContent$ddl_ContactInfo_State")));

		select5.selectByVisibleText("DC");
		Thread.sleep(1000);

		Select select6 = new Select(driver.findElement(By.name("ctl00$cphMainContent$ddl_ContactInfo_Country")));

		select6.selectByVisibleText("Japan");
		Thread.sleep(1000);
	}

	@Test(priority = 400)

	public void PayemetnInformation() throws InterruptedException {

		// Full_Name of Card Holder
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$cphMainContent$txt_PaymentInfo_FName")).sendKeys("Zain");
		// Last_Name
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$cphMainContent$txt_PaymentInfo_LName")).sendKeys("Ahemdd");
		// Credit card Number
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$cphMainContent$txt_CC_Number")).sendKeys("53637382848373773");
		// Expiry date
		Thread.sleep(1000);
		Select select7 = new Select(driver.findElement(By.name("ctl00$cphMainContent$ddl_CC_ExpirationMonth")));
		// Month
		Thread.sleep(1000);
		select7.selectByVisibleText("May");

		Thread.sleep(1000);

		Select select8 = new Select(driver.findElement(By.name("ctl00$cphMainContent$ddl_CC_ExpirationYear")));
		select8.selectByVisibleText("2027");
		
		// BilingZip code
		
		driver.findElement(By.name("ctl00$cphMainContent$txt_CC_ZipCode")).sendKeys("96429");
		Thread.sleep(1000);
		// CVV
		driver.findElement(By.name("ctl00$cphMainContent$txt_CC_SecurityCode")).sendKeys("488");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_imgbtn_CheckOut\"]/span[2]")).click();

		Thread.sleep(1000);

	}

}
