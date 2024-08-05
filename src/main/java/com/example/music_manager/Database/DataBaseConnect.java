package com.example.music_manager.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnect {
    private static final String Url = "jdbc:mysql://localhost:3306/music_manager?useSSL=false";
    private static final String User = "root";
    private static final String Pass = "thanhlinh22";

    public DataBaseConnect() {};

    public static Connection getConnection() {
        Connection conn = null;
        try{
            Class.forName("com.mysql.jbdc.Diver");
            conn = DriverManager.getConnection(Url, User, Pass);
            System.out.println("connect database success");
        }catch(SQLException  | ClassNotFoundException e  ){
            System.out.println(e.getMessage());
        }
        return conn;
    }


}
