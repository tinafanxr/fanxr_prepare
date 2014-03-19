package com.fanxr.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Status {

        public static void main(String[] args) throws InterruptedException  {
               // TODO Auto-generated method stub
              
              WebDriver dr = new ChromeDriver();
              
               //指定所有打开的文件
              File file = new File("src/status.html" );
              String filepath = "file:///" + file.getAbsolutePath();
              System. out.println( "进入的页面为：" + filepath);
              
               //打开连接 并最大化窗口
              dr.get(filepath);
              dr.manage().window().maximize();
              Thread.sleep(1000);
              
               //查看文本框是否可用
              WebElement field = dr.findElement(By. name("user"));
              System. out.print("查看文本框是否为可用状态: " );
              System. out.println(field.isEnabled());
               //查看button 是否可用
              WebElement bt = dr.findElement(By. className("btn"));
              System. out.print("查看 按钮是否可用: " );
              System. out.println(bt.isEnabled());
              
               //点击单选按钮并查看是否选中
              WebElement ra = dr.findElement(By. name("radio"));
              ra.click();
              System.out.println(ra.getAttribute("type"));
              Thread.sleep(2000);
              System. out.println("单选按钮被点击以后的是否为选中状态："+ ra.isSelected());
              
              ra.click();
              Thread.sleep(2000);
              System. out.println("单选按钮被点击两次以后的是否为选中状态："+ ra.isSelected());
              
              //实验使用try catch
              try{
            	  dr.findElement(By. name("radio1"));
            	  
              }catch(NoSuchElementException e){
            	  System.out.println("这个元素不存在！！！"+e.getMessage());
            	 // e.printStackTrace();
            	  
            	  System.out.println("######################################################################");
            	  
              }
              
              
              dr.quit();

       }

}
