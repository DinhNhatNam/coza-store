package com.cybersoft.cozastore22.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @GetMapping("")
    public ResponseEntity<?> getCate(){

        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
