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
		
		//ָ�����д򿪵��ļ�
		File file =new File("src/modal.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println( "�����ҳ��Ϊ��" + filepath);
		
		//������ ����󻯴���
		dr.get(filepath);
		dr.manage().window().maximize();
		
		WebElement click1 = dr.findElement(By.id("show_modal"));
		click1.click();
		System.out.println("����˽����е�click���� ����������");
		Thread.sleep(1000);
		
	// WebDriverWait(dr,, 10) Ŀǰ������Ϊʲô����д
		new WebDriverWait(dr, 10).until(
				new ExpectedCondition<Boolean>(){
					public Boolean apply(WebDriver d){
						return d.findElement(By.id("show_modal")).isDisplayed();
					}
				}
				
				
				
				);
		
		//������������е� click me ����
		WebElement modal_father = dr.findElement(By.id("myModal"));
		WebElement click2 = modal_father.findElement(By.linkText("click me"));
		//click2.click();
		
		//Ŀǰ�Ҳ����ִ�����js ��ֱ��click������ʲô����
		
		((JavascriptExecutor)dr).executeScript("$(arguments[0]).click()", click2);
		
		WebElement bt_close = dr.findElement(By.className("btn"));
		System.out.println("�رյ������ڡ� ");

		
		
		
		//�˳������
		dr.quit();
		
	}

}
