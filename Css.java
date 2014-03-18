package com.fanxr;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		
		//ָ�����д򿪵��ļ�
		File file =new File("src/css.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println( "�����ҳ��Ϊ��" + filepath);
		
		//������ ����󻯴���
		dr.get(filepath);
		dr.manage().window().maximize();
		
		WebElement link = dr.findElement(By.id("tooltip"));
		System.out.println(link.getCssValue("color"));
		System.out.println(link.getTagName());
		//�����״�ӡ��class��ʲô�ô�
		System.out.println(link.getClass());
		System.out.println(link.getLocation());
		System.out.println(link.getSize());
		
		
		dr.quit();

	}

}
