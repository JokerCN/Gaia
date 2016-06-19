package com.winchampion.property;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/18.
 */
public class ChartBeanBeanInfo extends SimpleBeanInfo{

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try{
            //将TitlePositionEditor绑定到ChartBean的titlePosition属性中
            PropertyDescriptor titlePositionDescriptor = new PropertyDescriptor("titlePosition",ChartBean.class);
            titlePositionDescriptor.setPropertyEditorClass(TitlePositionEditor.class);
            return new PropertyDescriptor[]{titlePositionDescriptor};
        }catch(IntrospectionException e){
            e.printStackTrace();
            return null;
        }
    }
}
