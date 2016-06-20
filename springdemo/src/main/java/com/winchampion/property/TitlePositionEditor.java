package com.winchampion.property;

import java.beans.PropertyEditorSupport;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/18.
 */
public class TitlePositionEditor extends PropertyEditorSupport {
    public static String[] options = {"Left","Center","Right"};

    @Override
    public String getAsText() {
        int value = (Integer)getValue();
        return options[value];
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        for(int i = 0;i<options.length;i++){
            if(options[i].equals(text)){
                setValue(i);
                return;
            }
        }
    }

    @Override
    public String[] getTags() {
        return options;
    }

    @Override
    public String getJavaInitializationString() {
        return ""+getValue();
    }
}
