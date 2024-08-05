package com.example.music_manager.Controller;

import com.example.music_manager.Service.MusicService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MusicController", urlPatterns = "/musics/*")
public class MusicController extends HttpServlet {
    private MusicService musicService;


    @Override
    public void init() throws ServletException {
        this.musicService = new MusicService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getPathInfo();

    }
}
