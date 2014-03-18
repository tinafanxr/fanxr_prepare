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

		// 打开页面
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
		 * //打印checkbox 的大小。 System.out.println(checkboxs.size());
		 */

		// 用getAttribute 得到type是checkbox
		List<WebElement> inputs = dr.findElements(By.tagName("input"));
		for (WebElement input : inputs) {
			if (input.getAttribute("type").equals("checkbox"))

				input.click();

		}

		/*
		 * //选择界面中所有的input 包括checkbox 和redio List<WebElement> inputs =
		 * dr.findElements(By.tagName("input")); for(WebElement input: inputs) {
		 * input.click(); } Thread.sleep(1000);
		 * 
		 * System.out.println("input的个数为： " + inputs.size());
		 */

		List<WebElement> alls = dr.findElements(By
				.cssSelector("input[type=checkbox]"));
		System.out.println(alls.size());
		if (alls.size() > 0) {

			alls.get(alls.size() - 1).click();
		}
		Thread.sleep(1000);

		// 刷新界面
		dr.navigate().refresh();

		Thread.sleep(1000);

		/*
		 * //点击单选按钮 通过Xpath
		 * 
		 * WebElement radio1 =
		 * dr.findElement(By.xpath("html/body/div[1]/form/div[4]/label"));
		 * radio1.click(); Thread.sleep(1000);
		 */

		// 点击单选按钮。
		List<WebElement> radio2 = dr.findElements(By.tagName("input"));
		System.out.println(radio2.size());
		for (WebElement ra : radio2) {
			if (ra.getAttribute("type").equals("radio") ) {
				ra.click();
				System.out.println("选中了radio");
			}

		}
		Thread.sleep(1000);

		// 关闭浏览器
		dr.quit();

	}

}
