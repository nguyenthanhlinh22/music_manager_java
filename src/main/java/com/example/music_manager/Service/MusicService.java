package com.example.music_manager.Service;

import com.example.music_manager.Model.MusicModel;
import com.example.music_manager.entity.Music;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
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
            int category_id = Integer.parseInt(resultSet.getString("category_id"));
            Date publication_date = resultSet.getDate("publication_date");
            int composer_id = Integer.parseInt(resultSet.getString("composer_id"));
            int singer_id = Integer.parseInt(resultSet.getString("singer_id"));

            Music music = new Music( MusicName, description, Musiclist_id , category_id, publication_date, composer_id, singer_id);
            music.setMusicid(Musicid);
            music.setMusiclist_id(Musiclist_id);
            music.setCategory_id(category_id);
            music.setComposer_id(composer_id);
            music.setSinger_id(singer_id);
            Musics.add(music);




        }
        return Musics;



    }


    public void  renderListMusics(HttpServletRequest request, HttpServletResponse response ) throws SQLException, ServletException, IOException {
        List<Music> musics = this.getAllMusic();
        request.setAttribute("musics", musics);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
        requestDispatcher.forward(request, response);
    }


}
