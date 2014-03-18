package com.fanxr.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lanch_Firefox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
	
		String url;
		url = " http://www.baidu.com";
		dr.get(url);
		System.out.println("当前的title是：\n"+ dr.getTitle());
		System.out.println("当前的title 是：\n " + dr.getCurrentUrl());
		
		Thread.sleep(2000);
		
		dr.quit();
	}

}
