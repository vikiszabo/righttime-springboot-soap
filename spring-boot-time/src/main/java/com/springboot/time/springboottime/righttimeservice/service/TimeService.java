package com.springboot.time.springboottime.righttimeservice.service;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class TimeService {


    public String getTime() {
        return LocalTime.now().toString();
    }
}
