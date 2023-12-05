package com.cybersoft.cozastore22.service;

import com.cybersoft.cozastore22.PayReload.Request.SignupRequest;
import com.cybersoft.cozastore22.entity.UserEntity;
import com.cybersoft.cozastore22.repository.UserRepository;
import com.cybersoft.cozastore22.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceImp {
@Autowired
private UserRepository userRepository;
@Autowired
private PasswordEncoder passwordEncoder;
    @Override
    public boolean insertUser(SignupRequest signupRequest) {
        UserEntity user = new UserEntity();
        user.setEmail(signupRequest.getUsername());
        user.setPassword(passwordEncoder.encode(signupRequest.getPass()));
        boolean isSuccess=false;
        try {
userRepository.save(user);
isSuccess=true;
        }catch (Exception E){
            System.out.println("lỗi insert user  "+E.getLocalizedMessage());
        }
        return isSuccess;
    }
}
