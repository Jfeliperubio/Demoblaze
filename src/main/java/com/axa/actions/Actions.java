package com.axa.actions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}

	public static void writeEditText(WebDriver myBrowser, By editText, String strEditText) {
		clickInObject(myBrowser, editText);
		myBrowser.findElement(editText).sendKeys(strEditText);
	}
	
	public static void clickInObject(WebDriver myBrowser, By objectToClick) {
		WebDriverWait waitElem = new WebDriverWait(myBrowser,5);
		waitElem.until(ExpectedConditions.elementToBeClickable(objectToClick));
		myBrowser.findElement(objectToClick).click();
	}
	
	public static void clickInObject(WebDriver myBrowser, WebElement objectToClick) {
		WebDriverWait waitElem = new WebDriverWait(myBrowser,5);
		waitElem.until(ExpectedConditions.elementToBeClickable(objectToClick));
		objectToClick.click();
	}
	
	public static String getTextFrom(WebDriver myBrowser, By locator) {
        return myBrowser.findElement(locator).getText();
    }

    public static WebElement findElement(WebDriver myBrowser, By locator) {
        return myBrowser.findElement(locator);
    }
    
    public static List<WebElement> findElements(WebDriver myBrowser, By locator) {
        return myBrowser.findElements(locator);
    }
	
	public static void scrollDown(WebDriver myBrowser) {
		JavascriptExecutor js = (JavascriptExecutor) myBrowser;
		float delta = 1F;
		for(float i = delta; i <= 100; i += delta) {
			js.executeScript("window.scrollTo("+(i-delta)/100.0 +"*document.body.scrollHeight, "+i/100.0+"*document.body.scrollHeight);");
		}
	}

	public static void waitForElement(WebDriver myBrowser, By objectWait, Integer seconds) {
		WebDriverWait waitElem = new WebDriverWait(myBrowser,seconds);
		waitElem.until(ExpectedConditions.visibilityOfElementLocated(objectWait));
	}
	
	public static void waitForAllElement(WebDriver driver, List<WebElement> listElements, Integer seconds) {
		WebDriverWait waitElem = new WebDriverWait(driver,seconds);
		waitElem.until(ExpectedConditions.visibilityOfAllElements(listElements));
	}

	
	
	
	public static void confirmAlert(WebDriver myBrowser) {
		WebDriverWait wait = new WebDriverWait(myBrowser, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
    }

	public static Integer toInt(String txtNum, String separator) {
		return Integer.parseInt(txtNum.replaceAll(separator, ""));
	}
	
	public static void waitForPageToLoad(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        wait.until(webDriver -> js.executeScript("return document.readyState").equals("complete"));
    }
		
	public static Integer sumList(ArrayList<Integer> listNums) {
	 Integer sum = 0;
		for (Integer elem : listNums ) sum += elem;
		return sum;
	}

	
}
