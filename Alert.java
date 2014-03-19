package com.fanxr;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
         
         //ָ�����д򿪵��ļ�
        File file = new File("src/alert.html" );
        String filepath = "file:///" + file.getAbsolutePath();
        System. out.println( "�����ҳ��Ϊ��" + filepath);
        Thread.sleep(1000);
         //������ ����󻯴���
        dr.get(filepath);
        dr.manage().window().maximize();
        Thread.sleep(1000);
        
       //������ӵ���alert ����
        WebElement link = dr.findElement(By.id("tooltip"));
        Thread.sleep(1000);
        System.out.println("title��ֵ�ǣ� " + link.getAttribute("title"));
        System.out.println("���ӵ�����Ϊ�� " + link.getText());
        link.click();
        
        //��alert �ϵ�һЩ������ 
        org.openqa.selenium.Alert alert = dr.switchTo().alert();
        System.out.println(alert.getText());      
        alert.accept();
        
        dr.quit();
        
        

	}

}
