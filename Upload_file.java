package com.fanxr;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			WebDriver dr = new ChromeDriver();
		//ָ�����д򿪵��ļ�
	       File file = new File("src/upload_file.html" );
	       String filepath = "file:///" + file.getAbsolutePath();
	       System. out.println( "�����ҳ��Ϊ��" + filepath);
	       Thread.sleep(1000);
	        //������ ����󻯴���
	       dr.get(filepath);
	       dr.manage().window().maximize();
	       Thread.sleep(1000);
	       dr.manage().window().setSize("200");    
	       //WebElement upload = dr.findElement(By.name("file"));
	      // WebElement upload = dr.findElement(By.cssSelector("body > div > div > input"));
	      // WebElement upload = dr.findElement(By.xpath("html/body/div[1]/div/input"));
	       //WebElement upload = dr.findElement(By.xpath("*//input"));
	       WebElement upload =dr.findElement(By.tagName("input"));       
	       
	       upload.sendKeys("D:\\1.txt");
	       Thread.sleep(1000);
	       
	       dr.quit();
	       
	      
	       
	       

	}

}
