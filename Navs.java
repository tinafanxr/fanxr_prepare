package com.fanxr;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		
		//指定所有打开的文件
		File file =new File("src/navs.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println( "进入的页面为：" + filepath);
		
		//打开连接 并最大化窗口
		dr.get(filepath);
		dr.manage().window().maximize();
		
		//先找到ul 在定位li
		WebElement ul = dr.findElement(By.className("nav"));
		ul.findElement(By.linkText("Content")).click();
		Thread.sleep(1000);
		System.out.println("点击了Content tab 链接");
		
		//通过linktext直接找到
		WebElement home = dr.findElement(By.linkText("Home"));
		home.click();
		System.out.println("点击了home 链接");
		Thread.sleep(1000);
		
		//通过Xpath 找到About 元素
		WebElement about = dr.findElement(By.xpath("html/body/div[1]/div/ul/li[3]/a"));		
		about.click();
		System.out.println("点击了about tab 链接");
		Thread.sleep(1000);
		//退出浏览器
		dr.quit();
		
	}

}
