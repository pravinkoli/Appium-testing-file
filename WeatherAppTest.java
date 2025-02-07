package appium_demo;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WeatherAppTest {
	
	  public static void main(String[] args) {
	         try {
	        	 
	        		 //device details
	                 DesiredCapabilities capabilities = new DesiredCapabilities();
	                 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	                 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 9 Pro Fold API 35");
	                 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	                 
	                 //base package, launcher 
	                 capabilities.setCapability("appPackage", "com.example.weatherapp");
	                 capabilities.setCapability("appActivity", ".MainActivity");

	                 //driver details
	                 AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);

	                 //accesing the elements
	                 WebElement cityName = driver.findElement(By.id("com.example.weatherapp:id/city"));
	                 WebElement  fetch= driver.findElement(By.id("com.example.weatherapp:id/showButton"));
	             
	                 cityName.sendKeys("Solapur"); //type text 5
	                 fetch.click();
	                 
	                 System.out.println("fetch data sucessfully");
	                 
	                 driver.quit();
	        	 }
	         catch (Exception e) {
	             e.printStackTrace();
	         }
	     
	        	 
	         
	  }
}
	        

