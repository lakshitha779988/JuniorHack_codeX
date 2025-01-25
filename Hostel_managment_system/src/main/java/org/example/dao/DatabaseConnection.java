package org.example.dao;

import org.example.util.DatabaseConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {


    private static Connection connection;


    public static Connection getConnection(){
        if(connection==null){
            try {
                Properties props = DatabaseConfig.loadProperties();
                String url = props.getProperty("db.url");
                String userName = props.getProperty("db.username");
                String password = props.getProperty("db.password");

                connection = DriverManager.getConnection(url,userName,password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return connection;
    }
}
