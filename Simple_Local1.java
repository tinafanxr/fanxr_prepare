package com.fanxr.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Local {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		
		//ָ�����д򿪵��ļ�
		File file =new File("src/form.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println( "�����ҳ��Ϊ��" + filepath);
		
		//������ ����󻯴���
		dr.get(filepath);
		dr.manage().window().maximize();
		
		//ʶ��username 
		//WebElement emailtext = dr.findElement(By.id("inputEmail"));
		WebElement emailtext = dr.findElement(By.name("email"));
		emailtext.clear();
		emailtext.sendKeys("alextowxm@163.com");
		Thread.sleep(1000);
		
		//ʶ��password 
		//WebElement passwd = dr.findElement(By.id("inputPassword"));
		WebElement passwd = dr.findElement(By.name("password"));
		passwd.clear();
		passwd.sendKeys("123123");
		Thread.sleep(1000);
		
		//ʶ�� remember me ��ѡ�� 
		WebElement rm = dr.findElement(By.className("checkbox"));
		rm.click();
		System.out.println("ѡ����remember me ��ѡ��");
		Thread.sleep(2000);
		
		//���sign in ��ť
		WebElement bt = dr.findElement(By.className("btn"));
		bt.click();
		System.out.println("���sign in ��ť");
		Thread.sleep(1000);
		
		//��ӡ from��class
		WebElement fr = dr.findElement(By.tagName("form"));
		 String fr_class = fr.getAttribute("class");
		 System.out.println(fr_class);
		 Thread.sleep(1000);
		 
		 // register ����ִ��js  
		 
		 WebElement re = dr.findElement(By.linkText("register"));
		 ((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut().fadeIn()",re);
		 System.out.println("ִ��js register");
		 Thread.sleep(3000);	
		 	
		
		
		
		//�ر������
		dr.quit();
		
		
		
		
		
		
		
	}

}
