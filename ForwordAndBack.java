package com.fanxr.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ForwordAndBack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new InternetExplorerDriver();
		String url1 = "http://baidu.com";
		String url2 = "http://mail.163.com";
		System.out.println("��һ������");		
		dr.get(url1);
		System.out.println(dr.getCurrentUrl());
		System.out.println(dr.getTitle());
		Thread.sleep(1000);
		
		System.out.println("�ڶ�������");
		dr.get(url2);
		System.out.println(dr.getCurrentUrl());
		System.out.println(dr.getTitle());
		Thread.sleep(1000);
		
		System.out.println("�ص���һ������");
		dr.navigate().back();
		System.out.println(dr.getCurrentUrl());
		System.out.println(dr.getTitle());
		
		Thread.sleep(1000);
		
		System.out.println("�ص��ڶ�������");
		dr.navigate().forward();
		System.out.println(dr.getCurrentUrl());
		System.out.println(dr.getTitle());
		Thread.sleep(1000);
		
		dr.quit();
		
				
	}

}
