package org.example.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DatabaseConfig {

    public static Properties loadProperties(){
        Properties properties = new Properties();
        try(FileInputStream fis = new FileInputStream("src/main/resources/db.properties")) {

            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
}
