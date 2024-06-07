package pages;

import org.apache.commons.io.serialization.ValidatingObjectInputStream;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Pay Bill as Guest']")
	WebElement bill;
	
	@FindBy(xpath="//input[@class='jsreq']")
	WebElement username;
	
	@FindBy(id="footer")
	WebElement footer;
	
	@FindBy(xpath="//a[text()='Get Help']")
	WebElement gethelp;
	


//public void clickbill () throws  InterruptedException{
	//bill.click();
	//clickElement(bill);
	//Thread.sleep(4000);
	

public void clickbill() {
	clickElement(bill);
	try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}



public void clickusername()throws InterruptedException{
	username.sendKeys("ahmad dewan 2024");
	Thread.sleep(4000);
}

public void clickfooter()throws InterruptedException{
	footer.click();
	Thread.sleep(4000);
}

public void clickgethelp() throws InterruptedException{
	//gethelp.click();
	clickElement(gethelp);
	Thread.sleep(4000);
}

public void bill() {
	// TODO Auto-generated method stub
	
}
	
	
}
