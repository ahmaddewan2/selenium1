package pages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest  extends BaseClass{
	
	@Test
	public void clickbill () throws InterruptedException{
		homePage.clickbill();
	}
	
	@Test
	public void clickusername()throws InterruptedException{
		homePage.clickusername();
	}
	
	@Test
	public void clickfooter()throws InterruptedException{
		homePage.clickfooter();
	}
	@Test
	public void clickgethelp() throws InterruptedException{
		homePage.clickgethelp();
	}

}
