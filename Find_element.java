package com.fanxr.test;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_element {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();

		File file = new File("src/checkbox.html");
		String filepath = "file:///" + file.getAbsolutePath();
		System.out.println(filepath);

		// ��ҳ��
		dr.get(filepath);
		Thread.sleep(1000);

		/*
		 * List<WebElement> checkboxs =
		 * dr.findElements(By.cssSelector("input[type = checkbox]")); for(
		 * WebElement checkbox: checkboxs){ checkbox.click();
		 * 
		 * }
		 * 
		 * Thread.sleep(1000); dr.navigate().refresh(); Thread.sleep(2000);
		 * 
		 * //��ӡcheckbox �Ĵ�С�� System.out.println(checkboxs.size());
		 */

		// ��getAttribute �õ�type��checkbox
		List<WebElement> inputs = dr.findElements(By.tagName("input"));
		for (WebElement input : inputs) {
			if (input.getAttribute("type").equals("checkbox"))

				input.click();

		}

		/*
		 * //ѡ����������е�input ����checkbox ��redio List<WebElement> inputs =
		 * dr.findElements(By.tagName("input")); for(WebElement input: inputs) {
		 * input.click(); } Thread.sleep(1000);
		 * 
		 * System.out.println("input�ĸ���Ϊ�� " + inputs.size());
		 */

		List<WebElement> alls = dr.findElements(By
				.cssSelector("input[type=checkbox]"));
		System.out.println(alls.size());
		if (alls.size() > 0) {

			alls.get(alls.size() - 1).click();
		}
		Thread.sleep(1000);

		// ˢ�½���
		dr.navigate().refresh();

		Thread.sleep(1000);

		/*
		 * //�����ѡ��ť ͨ��Xpath
		 * 
		 * WebElement radio1 =
		 * dr.findElement(By.xpath("html/body/div[1]/form/div[4]/label"));
		 * radio1.click(); Thread.sleep(1000);
		 */

		// �����ѡ��ť��
		List<WebElement> radio2 = dr.findElements(By.tagName("input"));
		System.out.println(radio2.size());
		for (WebElement ra : radio2) {
			if (ra.getAttribute("type").equals("radio") ) {
				ra.click();
				System.out.println("ѡ����radio");
			}

		}
		Thread.sleep(1000);

		// �ر������
		dr.quit();

	}

}
