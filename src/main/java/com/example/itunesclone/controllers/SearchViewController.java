package com.example.itunesclone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchViewController {

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String getSearch(@RequestParam("song") String song, Model model){

        // get the "song" search
        // find the song from the database
        // return search view and add the data to the model.


        return "search";
    }
}
