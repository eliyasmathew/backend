package com.coke.masterdata.controller;

import com.coke.masterdata.model.User;
import com.coke.masterdata.repository.UserRespository;
import com.coke.masterdata.service.MasterdataService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Slf4j
public class MasterDataController {

    UserRespository userRespository;
    MasterdataService masterdataService;

    @PostMapping(path = "/setUser")
    public User newUser(@RequestBody User user){
        System.out.println("User: " + user.getEmail());
        return userRespository.save(user);
    }

    @GetMapping(path = "/fetchUser")
    public User getUser(@RequestParam long id){
        User user1 = masterdataService.getData();
        return user1;
    }

}
