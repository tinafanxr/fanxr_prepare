package com.fanxr.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class lanch_ie {
	public static void main(String[] args) {
		WebDriver dr = new InternetExplorerDriver();
		dr.manage().window().maximize();
		dr.quit();
	}

}
