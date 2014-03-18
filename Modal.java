package com.fanxr;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Modal {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		
		//指定所有打开的文件
		File file =new File("src/modal.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println( "进入的页面为：" + filepath);
		
		//打开连接 并最大化窗口
		dr.get(filepath);
		dr.manage().window().maximize();
		
		WebElement click1 = dr.findElement(By.id("show_modal"));
		click1.click();
		System.out.println("点击了界面中的click界面 并弹出窗口");
		Thread.sleep(1000);
		
	// WebDriverWait(dr,, 10) 目前不明白为什么这样写
		new WebDriverWait(dr, 10).until(
				new ExpectedCondition<Boolean>(){
					public Boolean apply(WebDriver d){
						return d.findElement(By.id("show_modal")).isDisplayed();
					}
				}
				
				
				
				);
		
		//点击弹出窗口中的 click me 链接
		WebElement modal_father = dr.findElement(By.id("myModal"));
		WebElement click2 = modal_father.findElement(By.linkText("click me"));
		//click2.click();
		
		//目前我不理解执行这个js 和直接click（）有什么区别
		
		((JavascriptExecutor)dr).executeScript("$(arguments[0]).click()", click2);
		
		WebElement bt_close = dr.findElement(By.className("btn"));
		System.out.println("关闭弹出窗口。 ");

		
		
		
		//退出浏览器
		dr.quit();
		
	}

}
