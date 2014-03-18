package com.fanxr;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		
		//指定所有打开的文件
		File file =new File("src/css.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println( "进入的页面为：" + filepath);
		
		//打开连接 并最大化窗口
		dr.get(filepath);
		dr.manage().window().maximize();
		
		WebElement link = dr.findElement(By.id("tooltip"));
		System.out.println(link.getCssValue("color"));
		System.out.println(link.getTagName());
		//不明白打印的class有什么用处
		System.out.println(link.getClass());
		System.out.println(link.getLocation());
		System.out.println(link.getSize());
		
		
		dr.quit();

	}

}
