package com.fanxr.test;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_group {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		
		File file = new File("src/button_group.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println(filepath);
		dr.get(filepath);
	/*	
		// ͨ�� xpth �ҵ����Ԫ�� 		html/body/div[1]/div/div/div/div/div[2]
		WebElement bt1 = dr.findElement(By.xpath("html/body/div[1]/div/div/div/div/div[2]"));
		System.out.println(bt1.getAttribute("class"));
		bt1.click();
		System.out.println("���second button");
		Thread.sleep(1000);*/
		
		// ͨ����λ text Ϊsecond �ҵ�second button �� 
		WebElement first = dr.findElement(By.className("btn-group"));
		
		List <WebElement> seconds = first.findElements(By.className("btn"));
		for(WebElement se : seconds)
		{
			if(se.getText().equals("second"))
				{se.click();
				break;
				}
			
		}
		
		//�ڵ�����ť�е��ȷ����ť
		Alert alert = dr.switchTo().alert();
		
		//�õ��������е��ı�
		String a = alert.getText();
		System.out.println(a);
		Thread.sleep(1000);
		
		//���ȷ����ť
		alert.accept();
		
		
		dr.quit();
	}
}
