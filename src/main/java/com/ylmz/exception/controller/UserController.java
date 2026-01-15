package com.ylmz.exception.controller;

import com.ylmz.exception.dto.UserRequest;
import com.ylmz.exception.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public String user(@PathVariable("id") Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/user")
    public UserRequest user(@Valid @RequestBody UserRequest userRequest){
        return userService.createUser(userRequest);
    }

}
