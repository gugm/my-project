package com.project.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * properties配置文件读取类
 *
 * @author qiaoyu
 * @date 2015-01-06
 */
public class PropertyConfigurer extends PropertyPlaceholderConfigurer {

    private static Map<String, Object> ctxPropertiesMap;

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactory,
                                     Properties props) throws BeansException {

        super.processProperties(beanFactory, props);
        //load properties to ctxPropertiesMap  
        ctxPropertiesMap = new HashMap<String, Object>();
        for (Object key : props.keySet()) {
            String keyStr = key.toString();
            String value = props.getProperty(keyStr);
            ctxPropertiesMap.put(keyStr, value);
        }
    }

    //static method for accessing context properties  
    public static Object getContextProperty(String name) {
        try {
            return ctxPropertiesMap.get(name);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            return null;
        }
    }

    public static String getString(String name) {
        try {
            return (String) ctxPropertiesMap.get(name);
        } catch (Exception e) {
            return null;
        }
    }

    public static String getString(String name, String defaultVal) {
        String value = getString(name);
        return value == null ? defaultVal : value;
    }
}
