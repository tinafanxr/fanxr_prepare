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
		
		//指定所有打开的文件
		File file =new File("src/form.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println( "进入的页面为：" + filepath);
		
		//打开连接 并最大化窗口
		dr.get(filepath);
		dr.manage().window().maximize();
		
		//识别username 
		//WebElement emailtext = dr.findElement(By.id("inputEmail"));
		WebElement emailtext = dr.findElement(By.name("email"));
		emailtext.clear();
		emailtext.sendKeys("alextowxm@163.com");
		Thread.sleep(1000);
		
		//识别password 
		//WebElement passwd = dr.findElement(By.id("inputPassword"));
		WebElement passwd = dr.findElement(By.name("password"));
		passwd.clear();
		passwd.sendKeys("123123");
		Thread.sleep(1000);
		
		//识别 remember me 复选框。 
		WebElement rm = dr.findElement(By.className("checkbox"));
		rm.click();
		System.out.println("选择了remember me 复选框");
		Thread.sleep(2000);
		
		//点击sign in 按钮
		WebElement bt = dr.findElement(By.className("btn"));
		bt.click();
		System.out.println("点击sign in 按钮");
		Thread.sleep(1000);
		
		//打印 from的class
		WebElement fr = dr.findElement(By.tagName("form"));
		 String fr_class = fr.getAttribute("class");
		 System.out.println(fr_class);
		 Thread.sleep(1000);
		 
		 // register 连接执行js  
		 
		 WebElement re = dr.findElement(By.linkText("register"));
		 ((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut().fadeIn()",re);
		 System.out.println("执行js register");
		 Thread.sleep(3000);	
		 	
		
		
		
		//关闭浏览器
		dr.quit();
		
		
		
		
		
		
		
	}

}
