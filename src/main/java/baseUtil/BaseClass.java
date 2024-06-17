package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v122.serviceworker.model.ServiceWorkerRegistration;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import utils.Configuration;
import static utils.IConstant.*;

public class BaseClass {

	
	public WebDriver driver;
	// public ChromeDriver driver;
	// public EdgeDriver driver;
	// public FirefoxDriver driver;
	public HomePage homePage;
	Configuration configuration;
	

	@BeforeMethod
	public void setUp() {

		configuration = new Configuration();
		initDriver();
		// First job is to recognize the location of driver from your device
		// right click on chromedriver.exe --- properties -- copy the location an paste
		// below
		// System is a Java class and setProperty is a method of System Class
		// 1st way, to show the location of chromedriver
		// This is an absolute path
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/zubaer/eclipse-workspace/org.nychhc.epicmychart/driver/chromedriver");
		// We instantiated the driver here
		WebDriverManager.chromedriver().setup();

		// System.setProperty("webdriver.chrome.driver"
		// ,System.getProperty("user.dir")+"/driver/chromedriver");
		// dynamic path or relative path
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		// System.setProperty("webdriver.edge.driver" ,"./driver/msedgedriver");
		// System.setProperty("webdriver.gecko.driver" ,"./driver/geckodriver");

		//driver = new ChromeDriver();
		// driver = new EdgeDriver();
		// driver = new FirefoxDriver();

		// maximize method is used to maximize the window -- mostly used
		// driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		// deleteAllCookies do delete the cookies
		driver.manage().deleteAllCookies();
		// driver.manage().window().fullscreen();
		driver.get(configuration.getProperties(URL));
		long pageLoadWait = Long.parseLong(configuration.getProperties(PAGELOAD_WAIT));
		long implicitlyWait = Long.parseLong(configuration.getProperties(IMPLICITLY_WAIT));
		//long explicitlyWait = Long.parseLong(configuration.getProperties(EXPLICITLY_WAIT));
		//driver.get("https://epicmychart.nychhc.org/MyChart/Authentication/Login");
		// PageLoadTimeout is used to wait to load the page for curtain amount of time
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		// Implicitly wait is used to wait for each web element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
		//homePage = new HomePage(driver);

		initClass();

	}

	public void initDriver() {
		String browserName = configuration.getProperties(BROWSER);

		switch (browserName) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
			driver = new ChromeDriver();
			break;
		case EDGE:
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver");
			driver = new EdgeDriver();
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
			driver = new FirefoxDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;
		}
	}

	public void initClass() {
		homePage = new HomePage(driver);
		
		
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
