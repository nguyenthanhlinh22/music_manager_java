package com.example.music_manager.Service;

import com.example.music_manager.Model.MusicModel;
import com.example.music_manager.entity.Music;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MusicService {
    private MusicModel musicModel;


    public MusicService(){
        this.musicModel = new MusicModel();
    }

    public List<Music> getAllMusic() throws SQLException {
        //xu li result tra ve
        List<Music> Musics = new ArrayList<>();
        ResultSet resultSet = musicModel.getMusic();
        while (resultSet.next()) {
            int Musicid = resultSet.getInt("Musicid");
            String MusicName = resultSet.getString("MusicName");
            String description = resultSet.getString("description");
            int Musiclist_id = Integer.parseInt(resultSet.getString("Musiclist_id"));


        }



    }


}
