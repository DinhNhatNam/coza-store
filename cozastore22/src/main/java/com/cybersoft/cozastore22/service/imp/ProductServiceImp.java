package com.cybersoft.cozastore22.service.imp;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface ProductServiceImp {
    boolean insertProduct(MultipartFile file,String title, double price, int id_categori);


    Resource downloadProductFile(String tenFile);
}
