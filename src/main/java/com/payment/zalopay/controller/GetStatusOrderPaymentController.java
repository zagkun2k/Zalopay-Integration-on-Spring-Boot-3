package com.payment.zalopay.controller;

import com.payment.zalopay.model.StatusRequestDTO;
import com.payment.zalopay.service.GetStatusOrderPaymentService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

@RestController
public class GetStatusOrderPaymentController {

    @Autowired
    private GetStatusOrderPaymentService orderPaymentService;

    @PostMapping("/api/v1/order-status")
    public Map<String, Object> getStatusOrder(@RequestBody StatusRequestDTO statusRequestDTO) throws JSONException, URISyntaxException, IOException {

        return this.orderPaymentService.statusOrder(statusRequestDTO);
    }
}
