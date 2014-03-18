package com.fanxr.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_keys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		
		File file = new File("src/send_keys.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println(filepath);
		dr.get(filepath);
		
		//选择A中的内容
		WebElement a = dr.findElement(By.id("A"));
		a.sendKeys(Keys.chord(Keys.CONTROL + "a"));
		Thread.sleep(1000);
		a.sendKeys(Keys.chord(Keys.CONTROL + "x"));
		Thread.sleep(1000);
		
		//选择B 并粘贴
		WebElement b = dr.findElement(By.id("B"));
		b.sendKeys(Keys.chord(Keys.CONTROL + "v"));
		Thread.sleep(1000);
		
		a.sendKeys(Keys.chord("good"));
		Thread.sleep(1000);
		
		dr.quit();
	
		
		
		
	}

}
