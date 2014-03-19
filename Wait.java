package com.fanxr;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class Wait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
        
        //指定所有打开的文件
       File file = new File("src/wait.html" );
       String filepath = "file:///" + file.getAbsolutePath();
       System. out.println( "进入的页面为：" + filepath);
       Thread.sleep(1000);
        //打开连接 并最大化窗口
       dr.get(filepath);
       dr.manage().window().maximize();
       Thread.sleep(1000);
       
       //WebElement link = dr.findElement(By.id("btn"));
      // WebElement link = dr.findElement(By.className("btn"));
       WebElement link = dr.findElement(By.className("btn-primary")); 
       System.out.println("click 按钮的class 的属性是： " + link.getClass() );
       System.out.println("click 按钮的class 的属性是: " + link.getAttribute("class"));
       link.click();
       Thread.sleep(2000);
       
       WebElement lable = dr.findElement(By.className("label"));
       
       (new WebDriverWait(dr, 10)).until(new ExpectedCondition<Boolean>() {
           public Boolean apply(WebDriver d) {
                                   return d.findElement(By.className("label")).isDisplayed();
                           }
       });
       System.out.println(lable.getText());
       System.out.println(lable.getTagName());
       
       dr.quit();
       
	}

}
