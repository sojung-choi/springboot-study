package com.example.study.controller;

import com.example.study.model.entity.User;
import com.example.study.model.network.Header;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class GetController {
/*
     @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(method = RequestMethod.GET, path="/getMethod", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getMethod() {
        return "Hi sojung";
    }
 * /
    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(method = RequestMethod.GET, path="/getComment")
    public String getComment() {
        String temp =  "["
                +"{\"writer\":\"sojung\",\"comment\":\"Without changing the grid system try to add component in order to put v-col to the end of row like\",\"date\":\"2020.06.03\"},"
                +"{\"writer\":\"choi\",\"comment\":\"ot the answer you're looking for? Browse other questions tagged javascript html vue.js vuetify.js or ask your own question\",\"date\":\"2020.07.17\"},"
                +"{\"writer\":\"admin\",\"comment\":\"I've looked at this question, but using text align seems hacky, and I'm wondering if there is a better solution?\",\"date\":\"2020.07.18\"},"
                +"{\"writer\":\"benit\",\"comment\":\"ot the answer you're looking for? Browse other questions tagged javascript html vue.js vuetify.js or ask your own question\",\"date\":\"2020.08.05\"}"
                + "]";

        return temp;
    }
*/
    @GetMapping("/header")
    public Header getHeader() {
        return Header.builder().resultCode("OK").description("OK").build();
    }
}
