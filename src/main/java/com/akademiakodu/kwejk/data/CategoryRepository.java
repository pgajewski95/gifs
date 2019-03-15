package com.akademiakodu.kwejk.data;

import com.akademiakodu.kwejk.Model.Category;
import com.akademiakodu.kwejk.Model.Gif;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class CategoryRepository {

    public static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(0, "funny"),
            new Category(1, "sport"),
            new Category(2, "it")
    );
    public static List<Category> getAllCategory() {
        return ALL_CATEGORIES;
    }

    public static Category getCategoryById(int id){
        return ALL_CATEGORIES.get(id);

    }
}
