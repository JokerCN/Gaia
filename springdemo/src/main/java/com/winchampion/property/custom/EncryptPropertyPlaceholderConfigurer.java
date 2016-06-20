package com.winchampion.property.custom;

import com.winchampion.utils.DESUtils;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/18.
 */
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
    private String[] encryptPropNames = {"username","password"};

    private boolean isEncryptProp(String propertyName){
        for(String encryptPropName:encryptPropNames){
            if(encryptPropName.equals(propertyName)){
                return true;
            }
        }
        return false;
    }

    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        if(isEncryptProp(propertyName)){
            String decryptValue = DESUtils.getDecryptString(propertyValue);
            return decryptValue;
        }else{
            return propertyValue;
        }
    }
}
