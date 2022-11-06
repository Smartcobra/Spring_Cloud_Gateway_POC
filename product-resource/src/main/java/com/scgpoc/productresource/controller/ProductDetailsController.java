package com.scgpoc.productresource.controller;

import com.scgpoc.productresource.model.OrderRest;
import com.scgpoc.productresource.model.OrderStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/api")
public class ProductDetailsController {

    @GetMapping("/orders")
    public List<OrderRest> getOrders() {

        OrderRest order1 = new OrderRest(UUID.randomUUID().toString(),
                "product-id-1", "user-id-1", 1, OrderStatus.NEW);

        OrderRest order2 = new OrderRest(UUID.randomUUID().toString(),
                "product-id-2", "user-id-1", 1, OrderStatus.NEW);

        return Arrays.asList(order1, order2);
    }
}
