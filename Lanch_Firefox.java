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
		System.out.println("��ǰ��title�ǣ�\n"+ dr.getTitle());
		System.out.println("��ǰ��title �ǣ�\n " + dr.getCurrentUrl());
		
		Thread.sleep(2000);
		
		dr.quit();
	}

}
