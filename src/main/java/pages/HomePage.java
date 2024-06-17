package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// @FindBy(xpath="//a[text()='Pay Bill as Guest']")
	// WebElement bill;
	@FindBy(xpath = "//*[@id=\"main\"]/a")
	WebElement logo;
	
	@FindBy(xpath = "//a[contains(text(),'Pay Bill')]")
	WebElement bill;

	@FindBy(xpath = "//input[@class='jsreq']")
	WebElement username;

	@FindBy(id = "footer")
	WebElement footer;

	// @FindBy(xpath="//a[text()='Get Help']")
	// WebElement gethelp;

	@FindBy(xpath = "//a[contains(text(),'Get Help')]")
	WebElement gethelp;

	@FindBy(xpath = "//*[@id=\"Password\"]")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"submit\"]")
	WebElement signin;

	//@FindBy(xpath = "//*[@id=\"sidebar\"]/div[4]/a")
	//WebElement signup;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/p/a")
	WebElement signup;

	@FindBy(xpath = "//*[@class=\"badge\"]")
	WebElement epicapp;

	@FindBy(linkText = " NYC H+H MyChart Username")
	WebElement usernamehh;

	@FindBy(partialLinkText = "Forgot userna")
	WebElement forgotusername;

	@FindBy(partialLinkText = "Forgot pass")
	WebElement forgotpassword;

	@FindBy(xpath = "//*[@id=\"localeswitch\"]/span")
	WebElement language;

//public void clickbill () throws  InterruptedException{
	// bill.click();
	// clickElement(bill);
	// Thread.sleep(4000);

	
	public void clicklogo() throws InterruptedException {
		logo.click();
		Thread.sleep(4000);
	}
	
	public void clickbill() {
		clickElement(bill);
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickusername() throws InterruptedException {
		username.sendKeys("ahmad dewan 2024");
		Thread.sleep(4000);
	}

	public void clickfooter() throws InterruptedException {
		footer.click();
		Thread.sleep(4000);
	}

	public void clickgethelp() throws InterruptedException {
		// gethelp.click();
		clickElement(gethelp);
		Thread.sleep(4000);
	}

	public void clickpassword() throws InterruptedException {
		// password.click();
		password.sendKeys("1234");
		Thread.sleep(4000);
	}

	public void clicksignin() throws InterruptedException {
		signin.click();
		Thread.sleep(4000);
	}

	public void clicksignup() throws InterruptedException {
		signup.click();
		Thread.sleep(4000);
	}

	public void clickepicapp() throws InterruptedException {
		epicapp.click();
		Thread.sleep(4000);
	}

	public void clickusernamehh() throws InterruptedException {
		usernamehh.click();
		Thread.sleep(4000);
	}

	public void clickforgotusername() throws InterruptedException {
		forgotusername.click();
		Thread.sleep(4000);
	}

	public void clickforgotpassword() throws InterruptedException {
		forgotpassword.click();
		Thread.sleep(4000);
	}

	public void clicklanguage() throws InterruptedException {
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

	public void inputTextInusernameAndpasswordFieldThenClicksignIn() throws InterruptedException {
		Thread.sleep(5000);
		// inputText(username," ahmad dewan 2024");
		// username.sendKeys("Something");
		insertText(username, "ahmad dewan 2024");
		// pause(3);
		Thread.sleep(5000);
		// inputText(password,"1234");
		// password.sendKeys("213");

		insertText(password, "2341");
		Thread.sleep(5000);
		// pause(3);
		clickElement(signin);
		Thread.sleep(5000);
		// pause(3);
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
		pause(300);
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
		boolean elementDisplayed = driver.findElement(By.cssSelector("input.jsreq")).isDisplayed();
		System.out.println("is the text displayed? ans:" + elementDisplayed);
		pause(20);
	}

	public void useofisdisplayedinsignin() {
		elementDisplayed(username);
		// inputText(username, "ahmaddewan2024");
		insertText(username, "ahmad dewan 2024");
		pause(10);
		elementDisplayed(password);
		// inputText(password, "123456");
		insertText(password, "2341");
		pause(20);
		clickElement(signin);
		pause(30);
	}

	public void useofisenabledinsignin() {
		elementDisplayed(username);
		// inputText(username, "ahmaddewan2024");
		insertText(username, "ahmad dewan 2024");
		pause(10);
		elementDisplayed(password);
		// inputText(password, "123456");
		insertText(password, "2341");
		pause(20);
		elementEnabled(signin);
		clickElement(signin);
		pause(30);
	}

	public void useofisselectedinsignin() {
		pause(200);
		elementDisplayed(username);
		// inputText(username, "ahmaddewan2024");
		insertText(username, "ahmad dewan 2024");
		pause(3000);
		elementDisplayed(password);
		// inputText(password, "123456");
		insertText(password, "2341");
		pause(3000);
		elementSelected(language);
		clickElement(language);
		pause(3000);
		elementEnabled(signin);
		clickElement(signin);
		pause(3000);

	}
	
	public void getTheMethodsOfThePage() {
		String actual= driver.getTitle();
		System.out.println("Title name:"+ actual);
		String expected="NYC H+H MyChart - Login Page";
		Assert.assertEquals(actual, expected);
		
		
		String currentUrl= driver.getCurrentUrl();
		System.out.println("current Url:"+ currentUrl);
		String expectedUrl="https://epicmychart.nychhc.org/MyChart/Authentication/Login";
		Assert.assertEquals(actual, expected, "expectedUrl");
		
		
		//String nameOfTheWebElement = driver.findElement(By.name("Submit Login")).getText();
		//System.out.println("Text Present: "+nameOfTheWebElement);
		//String expectedText = "Login";
		//Assert.assertEquals(nameOfTheWebElement, expectedText, "The text of the WebElement doesn't match");
	}
	
	
	public void signUpPageValidation() {//problem************************
		pause(3);
		elementDisplayed(logo);
		verifyTitle(driver, "NYC H+H MyChart - Login Page");
		verifyCurrentUrl(driver, "https://epicmychart.nychhc.org/MyChart/Authentication/Login");
		elementDisplayed(signup);
		verifyTextOfTheWebElement(signup, "Sign up");
		clickElement(signup);
		pause(3);
		verifyTitle(driver, "NYC H+H MyChart - Login Page");
		verifyCurrentUrl(driver, "https://epicmychart.nychhc.org/MyChart/Authentication/Login");
	}
	
	
	public void getAttributeMethod() {
		elementDisplayed(username);
		pause(4);
		
		String value= driver.findElement(By.xpath("//input[@class='jsreq']")).getAttribute("max length");
		System.out.println("the value of maxlength is:"+ value);
		
		
	}
	
	public void use_of_clear_in_login() {//problem**************************
		elementDisplayed(username);
		inputText(username, "February 2024 QA Bootcamp");
		pause(13);
		clearTextTheField(username);
		pause(15);
		inputText(username, "ahmad dewan 2024");
		pause(3);
		elementDisplayed(password);
		inputText(password, "Abc@123a");
		pause(3);
		clearTextTheField(password);
		pause(15);
		inputText(password, "Abc@123abcd");
		pause(3);
		//elementSelected(checkBox);
		//clickElement(checkBox);
		pause(3);
		elementEnabled(signin); // used here
		clickElement(signin);
		pause(3);
	}

	
	

	

}
