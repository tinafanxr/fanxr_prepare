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
		//指定所有打开的文件
	       File file = new File("src/frame.html" );
	       String filepath = "file:///" + file.getAbsolutePath();
	       System. out.println( "进入的页面为：" + filepath);
	       Thread.sleep(1000);
	        //打开连接 并最大化窗口
	       dr.get(filepath);
	       dr.manage().window().maximize();
	       Thread.sleep(1000);
	       
	       //找到f1  by id	     
	       dr.switchTo().frame("f1");
	       System.out.println("切换到F1");
	       dr.switchTo().frame("f2");
	       System.out.println("切换到F2");
	       
	    /*   // 找到矿建 通过 web element 
	       dr.switchTo().frame(dr.findElement(By.id("f1")));
	       WebElement click = dr.findElement(By.linkText("click"));
	       click.click();
	       Thread.sleep(1000);
	       //alter 
	       org.openqa.selenium.Alert alert = dr.switchTo().alert();
	       System.out.println("弹出窗口的内容是：" + alert.getText());
	       Thread.sleep(1000);
	       alert.accept();
	       System.out.println("切换到F1");
	       
	       dr.switchTo().frame(dr.findElement(By.id("f2")));
	       System.out.println("切换到F2");*/
	       
	     /* // 这样找不到元素
	       WebElement f11 = dr.findElement(By.id("f1"));
		   WebElement f22 = dr.findElement(By.id("f2"));
		   dr.switchTo().frame(f11);
		   System.out.println("切换到F1");
		   dr.switchTo().frame(f22);
		   System.out.println("切换到F2");*/
	       
	       // 通过index 切换frame 
	    	        
	      
	       
	       WebElement text = dr.findElement(By.id("kw1"));
	       text.sendKeys("cheese");
	       System.out.println("在界面中输入cheese");
	       Thread.sleep(1000);
	       
	     //回到最外边的页面 也就是原始页面
	       dr.switchTo().defaultContent();
	       dr.switchTo().frame("f1");
	       
	       //通过css找到click link 
	       WebElement click1 = dr.findElement(By.cssSelector("body > div > div > a"));
	       click1.click();
	       Alert alert = dr.switchTo().alert();
	       Thread.sleep(10000);
	       System.out.println("弹出窗口的内容是：" + alert.getText());
	       alert.accept();
	       System.out.println("关闭alert窗口");
	       
	       dr.quit();
	       
	}

}
