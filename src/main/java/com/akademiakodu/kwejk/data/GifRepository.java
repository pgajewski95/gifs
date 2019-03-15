package com.akademiakodu.kwejk.data;

import com.akademiakodu.kwejk.Model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component //tworzy bina
public class GifRepository {

    public final static List<Gif> ALL_GIFS = Arrays.asList(

            new Gif("android-explosion", "mols", true, 0),
            new Gif("ben-and-mike", "mika", false, 1),
            new Gif("book-dominos", "mem", true, 0),
            new Gif("compiler-bot", "bot", false, 2),
            new Gif("cowboy-coder", "coder", true, 0),
            new Gif("infinite-andrew", "anrew", true, 0));

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }


    public static List<Gif> getFavorite() {
        List<Gif> favoritesGif = new ArrayList<>();
        for (Gif value : ALL_GIFS) {
            if (value.getFavorite() == true) {
                favoritesGif.add(value);
            }
        }
        return favoritesGif;
    }

    public List<Gif> getGifsCategoryId(int id) {
        List<Gif> categoryGifs = new ArrayList<>();

        for (Gif value: ALL_GIFS){
            if(value.getCategoryId()==id){
                categoryGifs.add(value);
            }
        }
        return categoryGifs;

    }
}

