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
         
         //ָ�����д򿪵��ļ�
        File file = new File("src/form.html" );
        String filepath = "file:///" + file.getAbsolutePath();
        System. out.println( "�����ҳ��Ϊ��" + filepath);
        
         //������ ����󻯴���
        dr.get(filepath);
        dr.manage().window().maximize();
        
       //ѡ��ѡ��
        //WebElement checkbox = dr.findElement(By.cssSelector("input[type = checkbox]"));
        WebElement checkbox = dr.findElement(By.xpath("html/body/div[1]/div/form/fieldset/label[1]"));
        checkbox.click();
        Thread.sleep(1000);
        
        //ѡ��ѡ��ť
        //WebElement ra =dr.findElement(By.cssSelector("input[type = radio]"));
        WebElement ra =dr.findElement(By.xpath("html/body/div[1]/div/form/fieldset/label[2]"));
        ra.click();
        Thread.sleep(1000);
        
      /*  //ѡ�������˵��е����һ��ѡ��
        WebElement father = dr.findElement(By.className("select"));
        List <WebElement> lists = father.findElements(By.tagName("option"));
        lists.get(lists.size() - 1).click();
        Thread.sleep(1000);*/
        
        //ѡ�������˵�ֵΪ1 ��ѡ��
        WebElement father = dr.findElement(By.className("select"));
        List <WebElement> lists = father.findElements(By.tagName("option"));
        for(WebElement list : lists){
        	if (list.getText().equals("1"))
        	{
        		list.click();
        	}
        }
        Thread.sleep(1000);
        
       
        
        //ѡ��ť�����
        WebElement bt = dr.findElement(By.className("btn"));
        System.out.println(bt.getText());
        System.out.println("value ��ֵ�ǣ� " + bt.getAttribute("value"));
        System.out.println("type��ֵ�ǣ� " + bt.getAttribute("type"));
        bt.click();
        Thread.sleep(1000);
        
        //�������alert��ȷ����ť��
        Alert alert = dr.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(1000);
        
        
        
        dr.quit();
        
        
        

	}

}
