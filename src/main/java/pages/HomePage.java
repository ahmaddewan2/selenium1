package pages;

import org.apache.commons.io.serialization.ValidatingObjectInputStream;
import org.bouncycastle.crypto.engines.ISAACEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v122.tethering.Tethering;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

import java.nio.channels.NotYetConnectedException;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//a[text()='Pay Bill as Guest']")
	//WebElement bill;
	
	@FindBy(xpath="//a[contains(text(),'Pay Bill')]")
	WebElement bill;
	
	@FindBy(xpath="//input[@class='jsreq']")
	WebElement username;
	
	@FindBy(id="footer")
	WebElement footer;
	
	//@FindBy(xpath="//a[text()='Get Help']")
	//WebElement gethelp;
	
	@FindBy(xpath="//a[contains(text(),'Get Help')]")
	WebElement gethelp;
	
	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"sidebar\"]/div[4]/a")
	WebElement signup;
	
	@FindBy(xpath="//*[@class=\"badge\"]")
	WebElement epicapp;
	
	@FindBy(linkText=" NYC H+H MyChart Username")
	WebElement usernamehh;
	
	@FindBy(partialLinkText  ="Forgot userna")
	WebElement forgotusername;
	
	@FindBy(partialLinkText ="Forgot pass")
	WebElement forgotpassword;
	
	@FindBy(xpath="//*[@id=\"localeswitch\"]/span")
	WebElement language;
	


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

public void clickpassword() throws InterruptedException{
	//password.click();
	password.sendKeys("1234");
	Thread.sleep(4000);
}

public void clicksignin() throws InterruptedException{
	signin.click();
	Thread.sleep(4000);
}

public void clicksignup() throws InterruptedException{
	signup.click();
	Thread.sleep(4000);
}

public void clickepicapp() throws InterruptedException{
	epicapp.click();
	Thread.sleep(4000);
}

public void clickusernamehh() throws InterruptedException{
	usernamehh.click();
	Thread.sleep(4000);
}

public void clickforgotusername() throws InterruptedException{
	forgotusername.click();
	Thread.sleep(4000);
}

public void clickforgotpassword() throws InterruptedException{
	forgotpassword.click();
	Thread.sleep(4000);
}

public void clicklanguage() throws InterruptedException{
	language.click();
	Thread.sleep(20);
}

public void useOfByClassInLogin() {
	driver.findElement(By.xpath("//input[@class='jsreq']")).sendKeys("ahmad dewan2024");
	pause(10);
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("1234");
	pause(200);
	driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	pause(1000);
}

public void inputTextInusernameAndpasswordFieldThenClicksignIn() {
	
	inputText(username," ahmad dewan 2024");
	pause(300);
	inputText(password,"1234");
	pause(300);
	clickElement(signin);
	pause(100);
}

//cssSelector

public void cssselectorforclassname() {
	driver.findElement(By.cssSelector("input.jsreq")).click();
	pause(10);
	
}

public void cssselectorforid() {
	driver.findElement(By.cssSelector("main#main")).click();
	pause(10);
}

public void cssselelctorforattributesanditsvalue() {
	driver.findElement(By.cssSelector("footer[id='footer']")).click();
}

public void cssselectorclassnameanditsvalue() {
	driver.findElement(By.cssSelector("input.jsreq[title='username']")).click();
	pause(30);
}

public void cssselectoridnameanditsvalue() {
	driver.findElement(By.cssSelector("main#main[title='footer']")).click();
	pause(30);
}

public void usetagnameaslocator() {
	driver.findElement(By.tagName("footer")).click();
	pause(20);
}

public void useofisdisplayed() {
	boolean elementDisplayed=driver.findElement(By.cssSelector("input.jsreq")).isDisplayed();
	System.out.println("is the text displayed? ans:"+ elementDisplayed);
	pause(20);
}

public void useofisdisplayedinsignin() {
	elementDisplayed(username);
	inputText(username, "ahmaddewan2024");
	pause(10);
	elementDisplayed(password);
	inputText(password, "123456");
	pause(20);
	clickElement(signin);
	pause(30);
}

public void useofisenabledinsignin() {
	elementDisplayed(username);
	inputText(username, "ahmaddewan2024");
	pause(10);
	elementDisplayed(password);
	inputText(password, "123456");
	pause(20);
	elementEnabled(signin);
	clickElement(signin);
	pause(30);
}

public void useofisselectedinsignin() {
	elementDisplayed(username);
	inputText(username, "ahmaddewan2024");
	pause(10);
	elementDisplayed(password);
	inputText(password, "123456");
	pause(20);
	elementSelected(language);
	clickElement(language);
	elementEnabled(signin);
	clickElement(signin);
	pause(30);
	
}

























private void elementSelected(WebElement language2) {
	// TODO Auto-generated method stub
	
}



private void elementEnabled(WebElement signin2) {
	// TODO Auto-generated method stub
	
}



private void elementDisplayed(WebElement username2) {
	// TODO Auto-generated method stub
	
}



private void pause(int i) {
	// TODO Auto-generated method stub
	
}



private void inputText(WebElement username2, String string) {
	// TODO Auto-generated method stub
	
}



public void bill() {
	// TODO Auto-generated method stub
	
}
	
	
}
