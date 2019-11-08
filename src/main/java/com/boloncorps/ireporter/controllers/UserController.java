package com.boloncorps.ireporter.controllers;

import com.boloncorps.ireporter.models.UserReporter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {
    private List<UserReporter> users = new ArrayList<>();
    private AtomicInteger nextId = new AtomicInteger();

    @PostMapping("/register")
    public UserReporter registerUser(@RequestBody UserReporter userReporter){
        userReporter.setUserId(nextId.incrementAndGet());
        Date date= new Date();

        long time = date.getTime();
        Timestamp timestamp = new Timestamp(time);
        userReporter.setRegisteredOn(timestamp);
        users.add(userReporter);
        return userReporter;
    }

    @GetMapping("/users")
    public  List getAllUsers(){
        return users;
    }

    @GetMapping("/users/{id}")
    public UserReporter getSingleUser(@PathVariable("id") long userId ){
        for(UserReporter userReporter: users){
            if(userReporter.getUserId() == userId){
                return userReporter;
            }
        }
        throw new IllegalArgumentException();
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "There is no such user on the system")
    @ExceptionHandler(IllegalArgumentException.class)
    public void badIdExceptionHandler(){
    }

}
