package com.fanxr.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		
		File file = new File("src/button_dropdown.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println(filepath);
		dr.get(filepath);
		
		//找到info 按钮并点击 
		WebElement info1 = dr.findElement(By.linkText("Info"));
		info1.click();
		Thread.sleep(1000);
		
		//找到打开的父及元素
		WebElement button1 = dr.findElement(By.className("dropdown-menu"));
		
		//找到最后的菜单连接
		WebElement button2 = button1.findElement(By.linkText("better than"));
		System.out.println("12222222222222222222222222222222222");
		button2.click();
		Thread.sleep(1000);
		
		dr.quit();
		
		

	}

}
