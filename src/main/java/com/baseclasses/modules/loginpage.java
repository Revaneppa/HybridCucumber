package com.baseclasses.modules;

import com.baseclasses.baseuse;
import com.baseclasses.utilites.Actionclasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginpage extends baseuse {
   private static  String username = "email";
    private static  String password = "password";
    private static  String loginbutton="//input[@value='Login']";

    public static void setusername(String txtusername) {
    Actionclasses.enteringValue(username,txtusername);
    }
    public static void setPassword(String txtpassword) {
        Actionclasses.enteringValue(password,txtpassword);
    }
    public static void setLoginbutton() {
        Actionclasses.clicking(loginbutton);
    }
    public static void setsignout() {
        Actionclasses.clicking(loginbutton);
    }
    public static void sethomepage() {
        Actionclasses.clicking(loginbutton);
    }

}