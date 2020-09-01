package com.example.study.repository;

import com.example.study.StudyApplication;
import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User user = new User();
        user.setAccount("TestUser06");
        user.setEmail("TestUser06@gmail.com");
        user.setPhoneNumber("010-6666-6666");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser06");


        User newUser = userRepository.save(user);
        System.out.println("newuser: " + newUser);
    }

    @Test
    public void update() {
        Optional<User> user = userRepository.findById(7L);

        user.ifPresent(selectUser->{
            selectUser.setAccount("updateee77");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method()");

            userRepository.save(selectUser);
        });
    }

    @Test
    @Transactional
    public void read(){
        //select * from user where id = ?

        Optional<User> user = userRepository.findByAccount("updateee");

        user.ifPresent(selectUser ->{
            //System.out.println("user : " + selectUser);
            //System.out.println("email : " + selectUser.getEmail());

            selectUser.getOrderDetailList().stream().forEach(detail ->{
                Item item = detail.getItem();
                System.out.println(item);
            });
        });
    }

    @Test
    public void delete(){
        Optional<User> user = userRepository.findById(6L);
        user.ifPresent(selectUser->{
           userRepository.delete(selectUser);
        });
    }

}
