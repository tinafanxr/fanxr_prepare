package com.fanxr;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Js {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver dr = new ChromeDriver();
         
         //ָ�����д򿪵��ļ�
        File file = new File("src/js.html" );
        String filepath = "file:///" + file.getAbsolutePath();
        System. out.println( "�����ҳ��Ϊ��" + filepath);
        Thread.sleep(1000);
         //������ ����󻯴���
        dr.get(filepath);
        dr.manage().window().maximize();
        Thread.sleep(1000);
        
        
        //ֱ��ִ��js  ������ʲô��˼
        ((JavascriptExecutor)dr).executeScript("$('#tooltip').fadeOut().fadeIn();");
        ((JavascriptExecutor)dr).executeScript("$('#tooltip').fadeOut();");
        Thread.sleep(1000);
        //button �İ�ť��ִ��js ����
        WebElement bt = dr.findElement(By.className("btn"));
        ((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut()", bt);
        Thread.sleep(1000);
        
        dr.quit();
      
	}

}
