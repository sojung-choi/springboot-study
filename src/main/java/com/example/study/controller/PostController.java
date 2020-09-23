package com.example.study.controller;

import com.example.study.model.entity.User;
import com.example.study.model.network.Header;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class PostController {

    @GetMapping("/api")
    public Header getHeader() {
        return Header.builder().resultCode("OK").description("OK").build();
    }
}
