package com.akademiakodu.kwejk.data;

import com.akademiakodu.kwejk.Model.Gif;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component //tworzy bina
public class GifRepository {
    public final static List<Gif> ALL_GIFS = Arrays.asList(

            new Gif("android-explosion", "mols", true, 1),
            new Gif("ben-and-mike", "mika", false, 2),
            new Gif("book-dominos", "mem", true, 1),
            new Gif("compiler-bot", "bot", false, 3),
            new Gif("cowboy-coder", "coder", true, 1),
            new Gif("infinite-andrew", "anrew", true, 1));

    public static List<Gif> getAllGifs(){
        return ALL_GIFS;
    }



}
