package com.fanxr;


import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

        public static void main(String[] args) throws InterruptedException {
               // TODO Auto-generated method stub
              
              WebDriver dr = new ChromeDriver();
              
              String url = "http://www.baidu.com";
              dr.get(url);
              System. out.println("打开百度" + url);
              Thread. sleep(1000);
              System. out.println(dr.manage().getCookies());
              
               /*//打印cookies
              System.out.println(dr.manage().getCookies());
              
              //删除cookies
              dr.manage().deleteAllCookies();
              System.out.print("删除cookies后的内容是： ");
              System.out.println(dr.manage().getCookies());
              
              // addcookies 后的内容
              Cookie C1 = new Cookie("BAIDUID", "12312312312300000");
              dr.manage().addCookie(C1); 
              System.out.println(dr.manage().getCookies());*/
              
              
             /*  
              //登陆百度
              WebElement bt_login = dr.findElement(By.name("tj_login"));
              bt_login.click();
              Thread.sleep(1000);
              
              WebElement username = dr.findElement(By.id("TANGRAM__PSP_8__userName"));
              username.clear();
              username.sendKeys(" 11111@163.com ");
              
              WebElement passwd = dr.findElement(By.id("TANGRAM__PSP_8__password"));
              passwd.clear();
              passwd.sendKeys("1111111");
              WebElement bt = dr.findElement(By.id("TANGRAM__PSP_8__submit"));
              bt.click();
              System.out.println("登陆成功");
              
              Thread.sleep(3000);
              */
              
              //等到登陆后的cookies
              System.out.println(dr.manage().getCookies());
              dr.manage().deleteAllCookies();
              System.out.println(dr.manage().getCookies());
              
              
               // 通过设置cookie 模拟用户登陆的状态
              
              Cookie C2 = new Cookie ("BAIDUID" , "FDB025A33304AB1B16FA8E37A4D7EC8F" );
              Cookie C3 = new Cookie ("BDUSS","0xxxxxxxWdlZFJTY3JTR352c0Z2MW15eGtmSVBRaXNaVkpUQVFBQUFBJCQAAAAAAAAAAAEAAAByuWwGYWxleHRvd3htAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAKzYKlOs2CpTd");
              dr.manage().addCookie(C2);
              dr.manage().addCookie(C3);
              System. out.println(dr.manage().getCookies());
              Thread.sleep(1000);
              String url1= "http://passport.baidu.com/center";
              Thread. sleep(1000);
              System. out.println(dr.manage().getCookies());
              dr.get(url1);
              Thread. sleep(2000);
                        
              
              dr.quit();
                           
              

       }

}
