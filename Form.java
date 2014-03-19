package com.fanxr;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver dr = new ChromeDriver();
         
         //指定所有打开的文件
        File file = new File("src/form.html" );
        String filepath = "file:///" + file.getAbsolutePath();
        System. out.println( "进入的页面为：" + filepath);
        
         //打开连接 并最大化窗口
        dr.get(filepath);
        dr.manage().window().maximize();
        
       //选择复选框
        //WebElement checkbox = dr.findElement(By.cssSelector("input[type = checkbox]"));
        WebElement checkbox = dr.findElement(By.xpath("html/body/div[1]/div/form/fieldset/label[1]"));
        checkbox.click();
        Thread.sleep(1000);
        
        //选择单选按钮
        //WebElement ra =dr.findElement(By.cssSelector("input[type = radio]"));
        WebElement ra =dr.findElement(By.xpath("html/body/div[1]/div/form/fieldset/label[2]"));
        ra.click();
        Thread.sleep(1000);
        
      /*  //选择下拉菜单中的最后一个选项
        WebElement father = dr.findElement(By.className("select"));
        List <WebElement> lists = father.findElements(By.tagName("option"));
        lists.get(lists.size() - 1).click();
        Thread.sleep(1000);*/
        
        //选择下拉菜单值为1 的选项
        WebElement father = dr.findElement(By.className("select"));
        List <WebElement> lists = father.findElements(By.tagName("option"));
        for(WebElement list : lists){
        	if (list.getText().equals("1"))
        	{
        		list.click();
        	}
        }
        Thread.sleep(1000);
        
       
        
        //选择按钮并点击
        WebElement bt = dr.findElement(By.className("btn"));
        System.out.println(bt.getText());
        System.out.println("value 的值是： " + bt.getAttribute("value"));
        System.out.println("type的值是： " + bt.getAttribute("type"));
        bt.click();
        Thread.sleep(1000);
        
        //点击弹出alert的确定按钮。
        Alert alert = dr.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(1000);
        
        
        
        dr.quit();
        
        
        

	}

}
