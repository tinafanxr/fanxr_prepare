package com.fanxr;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		
		//ָ�����д򿪵��ļ�
		File file =new File("src/attribute.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println( "�����ҳ��Ϊ��" + filepath);
		
		//������ ����󻯴���
		dr.get(filepath);
		dr.manage().window().maximize();
		
		//WebElement link = dr.findElement(By.id("tooltip"));
		//WebElement link = dr.findElement(By.linkText("hover to see tooltip"));
		WebElement link = dr.findElement(By.xpath("//*[@id='tooltip']"));
		System.out.println(link.getAttribute("data-toggle"));
		Thread.sleep(1000);
		System.out.println(link.getAttribute("href"));
		System.out.println(link.getAttribute("data-original-title"));
		System.out.println(link.getText());
		
		dr.quit();
		
			

	}

}
