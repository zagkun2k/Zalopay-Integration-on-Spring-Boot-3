package com.payment.zalopay.controller;

import com.payment.zalopay.model.OrderRequestDTO;
import com.payment.zalopay.service.CreateOrderService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
public class CreateOrderController {

    @Autowired
    private CreateOrderService service;

    @PostMapping("/api/v1/create-order")
    public ResponseEntity<Map<String, Object>> createOrder(@RequestBody OrderRequestDTO request) throws JSONException, IOException {

        Map<String, Object> resultOrder = this.service.createOrder(request);
        return new ResponseEntity<>(resultOrder, HttpStatus.OK);
    }
}
