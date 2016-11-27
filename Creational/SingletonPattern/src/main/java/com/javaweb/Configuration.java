package com.javaweb;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Practical use of singleton
 *
 * @author Andrii Chernysh
 * @version 1.0 27 Nov 2016
 */
public class Configuration {
    private static Configuration _instance = null;

    private Properties props = null;

    private Configuration() {
        props = new Properties();
        try {
            FileInputStream fis = new FileInputStream(
                    new File("props.txt"));
            props.load(fis);
        } catch (Exception e) {
            // обработайте ошибку чтения конфигурации
        }
    }

    public synchronized static Configuration getInstance() {
        if (_instance == null)
            _instance = new Configuration();
        return _instance;
    }

    // получить значение свойства по имени
    public synchronized String getProperty(String key) {
        String value = null;
        if (props.containsKey(key))
            value = (String) props.get(key);
        else {
            // сообщите о том, что свойство не найдено
        }
        return value;
    }
}
