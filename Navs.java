package com.fanxr;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		
		//ָ�����д򿪵��ļ�
		File file =new File("src/navs.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println( "�����ҳ��Ϊ��" + filepath);
		
		//������ ����󻯴���
		dr.get(filepath);
		dr.manage().window().maximize();
		
		//���ҵ�ul �ڶ�λli
		WebElement ul = dr.findElement(By.className("nav"));
		ul.findElement(By.linkText("Content")).click();
		Thread.sleep(1000);
		System.out.println("�����Content tab ����");
		
		//ͨ��linktextֱ���ҵ�
		WebElement home = dr.findElement(By.linkText("Home"));
		home.click();
		System.out.println("�����home ����");
		Thread.sleep(1000);
		
		//ͨ��Xpath �ҵ�About Ԫ��
		WebElement about = dr.findElement(By.xpath("html/body/div[1]/div/ul/li[3]/a"));		
		about.click();
		System.out.println("�����about tab ����");
		Thread.sleep(1000);
		//�˳������
		dr.quit();
		
	}

}
