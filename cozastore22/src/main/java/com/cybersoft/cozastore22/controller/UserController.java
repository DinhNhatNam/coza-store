package com.cybersoft.cozastore22.controller;

import com.cybersoft.cozastore22.PayReload.Request.SignupRequest;
import com.cybersoft.cozastore22.PayReload.Respone.BaseRespone;
import com.cybersoft.cozastore22.service.imp.UserServiceImp;
import com.cybersoft.cozastore22.utils.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtHelper jwtHelper;

    @Autowired
    private UserServiceImp userServiceImp;


    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestParam String username, @RequestParam String password){
        UsernamePasswordAuthenticationToken authen = new UsernamePasswordAuthenticationToken(username,password);
        authenticationManager.authenticate(authen);

        String token = jwtHelper.generateToken("Muốn cho gì cho");
        BaseRespone baseRespone = new BaseRespone();
        baseRespone.setData(token);

        return new ResponseEntity<>(baseRespone, HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@Valid @RequestBody SignupRequest signupRequest){
boolean check = userServiceImp.insertUser(signupRequest);
BaseRespone baseRespone = new BaseRespone();
baseRespone
        .setMessage(check ? "thêm thành công ": "thêm thất bại ");
baseRespone.setData(check);
        return new ResponseEntity<>(baseRespone, HttpStatus.OK);
    }

}
