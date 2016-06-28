package com.winchampion.utils;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by super on 2016/6/22.
 */
public class PropUtils {
    public static void main(String[] args) {
        System.err.println(getPropValue("config.properties","cron"));
    }
    public static String getPropValue(String filename,String propKey){
        Properties props = new Properties();
        try {
            props.load(PropUtils.class.getClassLoader().getResourceAsStream(filename));
            return props.getProperty(propKey);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
