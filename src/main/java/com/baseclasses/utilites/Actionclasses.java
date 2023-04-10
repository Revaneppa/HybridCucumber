package com.baseclasses.utilites;

import com.baseclasses.baseuse;
import org.openqa.selenium.By;

public class Actionclasses extends baseuse {

public static void enteringValue(String element,String txtvalue){
    driver.findElement(By.name(element)).sendKeys(txtvalue);
}
public static void clicking(String element){
    driver.findElement(By.xpath(element)).click();
    }
}
