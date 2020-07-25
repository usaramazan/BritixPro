package com.bitrix.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1- we create properties obj.

    private  static Properties properties = new Properties();


    static {
        //2-get the path and store in String, or directly pass into fileInputStream
        String path = "configuration.properties";
        //3- we need to open the file
        try{
            FileInputStream file = new FileInputStream(path);
            //4- we ned to load the file to properties obj
            properties.load(file);
            //5- close file
            file.close();
        }catch (IOException e){
            System.out.println("Properties file not found");
        }

    }

    //Our own custom method to read and get values from configuration.properties file
    public static String getProperty(String keyWord){

        return properties.getProperty(keyWord);
    }

}
