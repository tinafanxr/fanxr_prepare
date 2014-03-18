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
		
		//�ҵ�info ��ť����� 
		WebElement info1 = dr.findElement(By.linkText("Info"));
		info1.click();
		Thread.sleep(1000);
		
		//�ҵ��򿪵ĸ���Ԫ��
		WebElement button1 = dr.findElement(By.className("dropdown-menu"));
		
		//�ҵ����Ĳ˵�����
		WebElement button2 = button1.findElement(By.linkText("better than"));
		System.out.println("12222222222222222222222222222222222");
		button2.click();
		Thread.sleep(1000);
		
		dr.quit();
		
		

	}

}
