package com.example.music_manager.Model;

import com.example.music_manager.Database.DataBaseConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MusicModel {
    private Connection conn ;

    public MusicModel(){
        this.conn = DataBaseConnect.getConnection();
    }
    public ResultSet getMusic() throws SQLException {
        String sql = "select * from music";
        PreparedStatement preparedStatement = this.conn.prepareStatement(sql);
        return preparedStatement.executeQuery();
    }
}
