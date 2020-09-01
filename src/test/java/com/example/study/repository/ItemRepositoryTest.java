package com.example.study.repository;

import com.example.study.StudyApplication;
import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Optional;

public class ItemRepositoryTest extends StudyApplicationTests {
    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create(){
        Item item = new Item();
        item.setName("아이템테스트");
        item.setPrice(20000);
        item.setContent("새로운 아이템");

        Item newItem = itemRepository.save(item);
        System.out.println("newItem : "+ newItem);

    }
    @Test
    public void read(){
        Long id = 3L;

        Optional<Item> item = itemRepository.findById(id);
        item.ifPresent(i -> {
        	System.out.println(1);
        });
    }
}
