package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;
import com.example.study.model.entity.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class OrderDetailRepositoryTest extends StudyApplicationTests {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setId(1L);
        orderDetail.setItemId(1L);
        orderDetail.setOrderAt(LocalDateTime.now());
        orderDetail.setUserId(1L);

        OrderDetail newOD = orderDetailRepository.save(orderDetail);
        System.out.println("newItem : "+ newOD);
    }
    @Test
    public void read(){
        Long id = 1L;

        Optional<OrderDetail> orderDetail = orderDetailRepository.findById(id);
        orderDetail.ifPresent(i -> {
            System.out.println("I found");
        });
    }
}
