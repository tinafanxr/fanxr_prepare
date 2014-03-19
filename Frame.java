package com.fanxr;


import java.io.File;
import java.util.List;
import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		 
			WebDriver dr = new ChromeDriver();
		//ָ�����д򿪵��ļ�
	       File file = new File("src/frame.html" );
	       String filepath = "file:///" + file.getAbsolutePath();
	       System. out.println( "�����ҳ��Ϊ��" + filepath);
	       Thread.sleep(1000);
	        //������ ����󻯴���
	       dr.get(filepath);
	       dr.manage().window().maximize();
	       Thread.sleep(1000);
	       
	       //�ҵ�f1  by id	     
	       dr.switchTo().frame("f1");
	       System.out.println("�л���F1");
	       dr.switchTo().frame("f2");
	       System.out.println("�л���F2");
	       
	    /*   // �ҵ��� ͨ�� web element 
	       dr.switchTo().frame(dr.findElement(By.id("f1")));
	       WebElement click = dr.findElement(By.linkText("click"));
	       click.click();
	       Thread.sleep(1000);
	       //alter 
	       org.openqa.selenium.Alert alert = dr.switchTo().alert();
	       System.out.println("�������ڵ������ǣ�" + alert.getText());
	       Thread.sleep(1000);
	       alert.accept();
	       System.out.println("�л���F1");
	       
	       dr.switchTo().frame(dr.findElement(By.id("f2")));
	       System.out.println("�л���F2");*/
	       
	     /* // �����Ҳ���Ԫ��
	       WebElement f11 = dr.findElement(By.id("f1"));
		   WebElement f22 = dr.findElement(By.id("f2"));
		   dr.switchTo().frame(f11);
		   System.out.println("�л���F1");
		   dr.switchTo().frame(f22);
		   System.out.println("�л���F2");*/
	       
	       // ͨ��index �л�frame 
	    	        
	      
	       
	       WebElement text = dr.findElement(By.id("kw1"));
	       text.sendKeys("cheese");
	       System.out.println("�ڽ���������cheese");
	       Thread.sleep(1000);
	       
	     //�ص�����ߵ�ҳ�� Ҳ����ԭʼҳ��
	       dr.switchTo().defaultContent();
	       dr.switchTo().frame("f1");
	       
	       //ͨ��css�ҵ�click link 
	       WebElement click1 = dr.findElement(By.cssSelector("body > div > div > a"));
	       click1.click();
	       Alert alert = dr.switchTo().alert();
	       Thread.sleep(10000);
	       System.out.println("�������ڵ������ǣ�" + alert.getText());
	       alert.accept();
	       System.out.println("�ر�alert����");
	       
	       dr.quit();
	       
	}

}
