package com.example.study.repository;

import com.example.study.StudyApplication;
import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User user = new User();
        user.setAccount("TestUser05");
        user.setEmail("TestUser05@gmail.com");
        user.setPhoneNumber("010-5555-5555");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser05");

        User newUser = userRepository.save(user);
        System.out.println("newuser: " + newUser);
    }

    @Test
    public void update() {
        Optional<User> user = userRepository.findById(5L);

        user.ifPresent(selectUser->{
            selectUser.setAccount("updateee");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method()");

            userRepository.save(selectUser);
        });
    }

}
