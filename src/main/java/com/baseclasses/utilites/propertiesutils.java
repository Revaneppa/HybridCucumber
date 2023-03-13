package com.baseclasses.utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class propertiesutils {

   public static Properties  properties;
    static FileInputStream fis;
    public static Properties loadalltheproperties(){
        properties  =new Properties();

        try{
            fis=new FileInputStream("alltheproperties.properties");
            properties.load(fis);
        }catch (FileNotFoundException e){
e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return properties;

    }
}
