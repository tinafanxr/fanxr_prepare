package com.fanxr;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Remote {

	public static void main(String[] args) throws MalformedURLException {
		
		// TODO Auto-generated method stub
		String url = "http://www.baidu.com";

		
		//WebDriver driver  = new RemoteWebDriver(new URL("http://" + "172.16.100.219" + ":4444/wd/hub"), DesiredCapabilities.internetExplorer());
		
		DesiredCapabilities dc = DesiredCapabilities.chrome(); 
		WebDriver driver = new RemoteWebDriver(new URL("http://172.16.100.219:4444/wd/hub"), dc); 
														
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS); 
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
