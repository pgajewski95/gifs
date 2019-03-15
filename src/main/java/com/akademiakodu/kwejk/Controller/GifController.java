package com.akademiakodu.kwejk.Controller;

import com.akademiakodu.kwejk.Model.Gif;
import com.akademiakodu.kwejk.data.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GifController {
@Autowired
    GifRepository gifRepository = new GifRepository();
    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){
        // 1. Wyciaganie gifow
        List<Gif> gifs = gifRepository.getAllGifs();
        // 2. przekazanie gifa do view
        modelMap.put("gifs", gifs);


        return "home";
    }

    @RequestMapping("/favorites")
    public String gifFavorities(ModelMap modelMap){
        List<Gif> gifs= gifRepository.getFavorite();

        modelMap.put("gifs", gifs);
        return "favorites";

    }

}
