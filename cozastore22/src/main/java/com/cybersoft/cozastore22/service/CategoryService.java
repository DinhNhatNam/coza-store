package com.cybersoft.cozastore22.service;

import com.cybersoft.cozastore22.PayReload.Respone.CategoryRespone;
import com.cybersoft.cozastore22.config.RedisConfig;
import com.cybersoft.cozastore22.entity.CategoryEntity;
import com.cybersoft.cozastore22.repository.CategoryRepository;
import com.cybersoft.cozastore22.service.imp.CategoryServiceImp;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CategoryService implements CategoryServiceImp {
    @Autowired
   private CategoryRepository categoryRepository;

    @Autowired
    Gson gson;

    @Autowired
    private RedisConfig redisTemplate;
    @Override
    public List<CategoryRespone> getAll() {
        System.out.println();

List<CategoryRespone> lisst2 = new ArrayList<>();
if (redisTemplate.hasKey("listcategory")!=null){
String dataRedis = redisTemplate.toString();
}else {
    List<CategoryEntity> list = categoryRepository.findAll();
    for (int i =0;i<list.size();i++){
        CategoryRespone categoryRespone = new CategoryRespone();
        categoryRespone.setId(list.get(i).getId());
        categoryRespone.setName(list.get(i).getName());
        lisst2.add(categoryRespone);
    }

    String datajson = gson.toJson(lisst2);
}


        return lisst2;
    }
}
