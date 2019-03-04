package com.mytest.utils;

import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: melody
 * @Date: 2019/3/4
 * @Version 1.0
 */
public class Utils {
    private static final String PROPERTIES_NAME = "Config.properties";
    public static Properties properties = new Properties();

    static{
        InputStream in = null;
        try{
            in =  Utils.class.getClassLoader().getResourceAsStream(PROPERTIES_NAME);
            properties.load(in);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Read config fail！");
        }finally{
            if(in != null){
                try{
                    in.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
