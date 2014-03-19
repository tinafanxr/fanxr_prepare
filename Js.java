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
         
         //指定所有打开的文件
        File file = new File("src/js.html" );
        String filepath = "file:///" + file.getAbsolutePath();
        System. out.println( "进入的页面为：" + filepath);
        Thread.sleep(1000);
         //打开连接 并最大化窗口
        dr.get(filepath);
        dr.manage().window().maximize();
        Thread.sleep(1000);
        
        
        //直接执行js  不明白什么意思
        ((JavascriptExecutor)dr).executeScript("$('#tooltip').fadeOut().fadeIn();");
        ((JavascriptExecutor)dr).executeScript("$('#tooltip').fadeOut();");
        Thread.sleep(1000);
        //button 的按钮上执行js 淡出
        WebElement bt = dr.findElement(By.className("btn"));
        ((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut()", bt);
        Thread.sleep(1000);
        
        dr.quit();
      
	}

}
