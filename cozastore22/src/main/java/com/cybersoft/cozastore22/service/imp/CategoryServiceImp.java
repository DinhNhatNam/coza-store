package com.cybersoft.cozastore22.service.imp;

import com.cybersoft.cozastore22.PayReload.Respone.CategoryRespone;
import com.cybersoft.cozastore22.entity.CategoryEntity;

import java.util.List;

public interface CategoryServiceImp {

    List<CategoryRespone> getAll();
}
