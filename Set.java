package Baidu;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.hash.BloomFilter;

public class Set {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		String url = "http://baidu.com/";
		
		//打开百度界面
		dr.get(url);
		Thread.sleep(1000);
		
		//最大化
		dr.manage().window().maximize();
		
		//找到搜索设置按钮
		WebElement setbt = dr.findElement(By.name("tj_setting"));
		setbt.click();
		Thread.sleep(1000);
		System.out.println(dr.getCurrentUrl());
		System.out.println(dr.getTitle());
		Thread.sleep(1000);
		
		//找到下拉菜单：
		Select select = new Select(dr.findElement(By.name("NR")));
		//select.selectByValue("50");
		//select.selectByVisibleText("每页显示20条");
		select.selectByIndex(3);
		Thread.sleep(1000);
		
		System.out.println(select.getOptions());
		System.out.println(select.getFirstSelectedOption());
		
			
		Thread.sleep(1000);
		
		// 点击保存设置
		WebElement savebt = dr.findElement(By.xpath("//*[@id='gxszButton']/input[1]"));		
		savebt.click();
		
		//在弹出的alert 中点击确定按钮
		
		Alert alert =dr.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		//得到保存以后的界面ttile 和url
		String url1= dr.getCurrentUrl();
		String titl1 = dr.getTitle();
		
		AssertEquals("百度一下，你就知道", url1);
		
		/*try{
				dr.getTitle().startsWith("1111111");
				System.out.println(dr.getTitle() + dr.getTitle().startsWith("1111111"));
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("打开的不是百度的首页");
					
		}*/
		
	/*	// 用if 语句判断界面是否跳转到了百度的首页
		String a = dr.getTitle() + dr.getTitle().startsWith("百度一下");
		if( a == "true")	{
			System.out.println("1111111");
		}
		else {
			System.out.println("22222222");
		}*/
		
		System.out.println("保存成功，界面会到百度首页");
		
			
		dr.quit();
		
		
		
		

	}

	private static void AssertEquals(String string, String url1) {
		// TODO Auto-generated method stub
		
	}


		
	

}
