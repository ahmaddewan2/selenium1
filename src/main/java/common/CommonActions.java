package common;

import java.util.NoSuchElementException;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Input;

public class CommonActions {
	
	public static void clickElement(WebElement element) {
		try {
			element.click();
		} catch (NoSuchElementException | NullPointerException e) {
			// TODO: handle exception
		}
	}
	
public static void inputNumber(WebElement element, String input) {
	try {
		element.sendKeys(input);
	} catch (NoSuchElementException| NullPointerException f) {
		f.printStackTrace();
		
	}

}
}


