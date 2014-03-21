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
		
		//�򿪰ٶȽ���
		dr.get(url);
		Thread.sleep(1000);
		
		//���
		dr.manage().window().maximize();
		
		//�ҵ��������ð�ť
		WebElement setbt = dr.findElement(By.name("tj_setting"));
		setbt.click();
		Thread.sleep(1000);
		System.out.println(dr.getCurrentUrl());
		System.out.println(dr.getTitle());
		Thread.sleep(1000);
		
		//�ҵ������˵���
		Select select = new Select(dr.findElement(By.name("NR")));
		//select.selectByValue("50");
		//select.selectByVisibleText("ÿҳ��ʾ20��");
		select.selectByIndex(3);
		Thread.sleep(1000);
		
		System.out.println(select.getOptions());
		System.out.println(select.getFirstSelectedOption());
		
			
		Thread.sleep(1000);
		
		// �����������
		WebElement savebt = dr.findElement(By.xpath("//*[@id='gxszButton']/input[1]"));		
		savebt.click();
		
		//�ڵ�����alert �е��ȷ����ť
		
		Alert alert =dr.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		//�õ������Ժ�Ľ���ttile ��url
		String url1= dr.getCurrentUrl();
		String titl1 = dr.getTitle();
		
		AssertEquals("�ٶ�һ�£����֪��", url1);
		
		/*try{
				dr.getTitle().startsWith("1111111");
				System.out.println(dr.getTitle() + dr.getTitle().startsWith("1111111"));
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("�򿪵Ĳ��ǰٶȵ���ҳ");
					
		}*/
		
	/*	// ��if ����жϽ����Ƿ���ת���˰ٶȵ���ҳ
		String a = dr.getTitle() + dr.getTitle().startsWith("�ٶ�һ��");
		if( a == "true")	{
			System.out.println("1111111");
		}
		else {
			System.out.println("22222222");
		}*/
		
		System.out.println("����ɹ�������ᵽ�ٶ���ҳ");
		
			
		dr.quit();
		
		
		
		

	}

	private static void AssertEquals(String string, String url1) {
		// TODO Auto-generated method stub
		
	}


		
	

}
