package com.example.study.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path="/getMethod")
    public String getMethod() {
        return "Hi sojung";
    }
}
