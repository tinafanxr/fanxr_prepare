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
         
         //指定所有打开的文件
        File file = new File("src/alert.html" );
        String filepath = "file:///" + file.getAbsolutePath();
        System. out.println( "进入的页面为：" + filepath);
        Thread.sleep(1000);
         //打开连接 并最大化窗口
        dr.get(filepath);
        dr.manage().window().maximize();
        Thread.sleep(1000);
        
       //点击链接弹出alert 窗口
        WebElement link = dr.findElement(By.id("tooltip"));
        Thread.sleep(1000);
        System.out.println("title的值是： " + link.getAttribute("title"));
        System.out.println("链接的内容为： " + link.getText());
        link.click();
        
        //在alert 上的一些操作。 
        org.openqa.selenium.Alert alert = dr.switchTo().alert();
        System.out.println(alert.getText());      
        alert.accept();
        
        dr.quit();
        
        

	}

}
