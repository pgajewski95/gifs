package com.akademiakodu.kwejk.Controller;

import com.akademiakodu.kwejk.Model.Category;
import com.akademiakodu.kwejk.Model.Gif;
import com.akademiakodu.kwejk.data.CategoryRepository;
import com.akademiakodu.kwejk.data.GifRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    GifRepository gifRepository;
@RequestMapping("/categories")
    public String gifCategories(ModelMap modelMap){

    List<Category> categories = categoryRepository.getAllCategory();
    modelMap.put("categories", categories);
    return "/categories";
}
@RequestMapping("/category/{id}")
    public String gifCategory(@PathVariable int id, ModelMap modelMap){
    List<Gif> gifs = gifRepository.getGifsCategoryId(id);
    modelMap.put("gifs", gifs);
    modelMap.put("categories", categoryRepository.getCategoryById(id));
    return "favorites";
}

}
