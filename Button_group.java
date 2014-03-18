package com.fanxr.test;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_group {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		
		File file = new File("src/button_group.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println(filepath);
		dr.get(filepath);
	/*	
		// 通过 xpth 找到这个元素 		html/body/div[1]/div/div/div/div/div[2]
		WebElement bt1 = dr.findElement(By.xpath("html/body/div[1]/div/div/div/div/div[2]"));
		System.out.println(bt1.getAttribute("class"));
		bt1.click();
		System.out.println("点击second button");
		Thread.sleep(1000);*/
		
		// 通过定位 text 为second 找到second button 。 
		WebElement first = dr.findElement(By.className("btn-group"));
		
		List <WebElement> seconds = first.findElements(By.className("btn"));
		for(WebElement se : seconds)
		{
			if(se.getText().equals("second"))
				{se.click();
				break;
				}
			
		}
		
		//在弹出按钮中点击确定按钮
		Alert alert = dr.switchTo().alert();
		
		//得到弹出框中的文本
		String a = alert.getText();
		System.out.println(a);
		Thread.sleep(1000);
		
		//点击确定按钮
		alert.accept();
		
		
		dr.quit();
	}
}
