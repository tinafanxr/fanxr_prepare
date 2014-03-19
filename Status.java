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
              
               //ָ�����д򿪵��ļ�
              File file = new File("src/status.html" );
              String filepath = "file:///" + file.getAbsolutePath();
              System. out.println( "�����ҳ��Ϊ��" + filepath);
              
               //������ ����󻯴���
              dr.get(filepath);
              dr.manage().window().maximize();
              Thread.sleep(1000);
              
               //�鿴�ı����Ƿ����
              WebElement field = dr.findElement(By. name("user"));
              System. out.print("�鿴�ı����Ƿ�Ϊ����״̬: " );
              System. out.println(field.isEnabled());
               //�鿴button �Ƿ����
              WebElement bt = dr.findElement(By. className("btn"));
              System. out.print("�鿴 ��ť�Ƿ����: " );
              System. out.println(bt.isEnabled());
              
               //�����ѡ��ť���鿴�Ƿ�ѡ��
              WebElement ra = dr.findElement(By. name("radio"));
              ra.click();
              System.out.println(ra.getAttribute("type"));
              Thread.sleep(2000);
              System. out.println("��ѡ��ť������Ժ���Ƿ�Ϊѡ��״̬��"+ ra.isSelected());
              
              ra.click();
              Thread.sleep(2000);
              System. out.println("��ѡ��ť����������Ժ���Ƿ�Ϊѡ��״̬��"+ ra.isSelected());
              
              //ʵ��ʹ��try catch
              try{
            	  dr.findElement(By. name("radio1"));
            	  
              }catch(NoSuchElementException e){
            	  System.out.println("���Ԫ�ز����ڣ�����"+e.getMessage());
            	 // e.printStackTrace();
            	  
            	  System.out.println("######################################################################");
            	  
              }
              
              
              dr.quit();

       }

}
