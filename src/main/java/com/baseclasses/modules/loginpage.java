package com.baseclasses.modules;

import com.baseclasses.baseuse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginpage extends baseuse {
   private static  String username = "email";
    private static  String password = "password";
    private static  String loginbutton="//input[@value='Login']";

    public static void setusername(String txtusername) {
       driver.findElement(By.name(username)).sendKeys(txtusername);
    }
    public static void setPassword(String txtpassword) {
        driver.findElement(By.name(password)).sendKeys(txtpassword);
    }
    public static void setLoginbutton() {
        driver.findElement(By.xpath(loginbutton)).click();
    }

}