package com.cybersoft.cozastore22.service.imp;

import com.cybersoft.cozastore22.PayReload.Request.SignupRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserServiceImp {
    boolean insertUser(SignupRequest signupRequest);


}
