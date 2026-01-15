package com.ylmz.exception.service;

import com.ylmz.exception.dto.UserRequest;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    public String getUser(Long id) {
        // id ==1 için EntityNotFoundException aldığını var sayarsak ;
        if(id == 1 )
          throw new EntityNotFoundException("User is not found...");
        else  return "OK";
    }

    public UserRequest createUser(UserRequest userRequest) {
        // validation hatasını göreceğimizden service de bu kısım için gelen requesti gönderdik.
        return userRequest;
    }
}
