package com.payment.zalopay.controller;

import com.payment.zalopay.model.RefundRequestDTO;
import com.payment.zalopay.service.RefundPaymentService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RefundPaymentController {

    @Autowired
    private RefundPaymentService refundPaymentService;

    @PostMapping("/api/v1/refund-payment")
    public ResponseEntity<Map<String, Object>> sendRefundRequest(@RequestBody RefundRequestDTO refundRequestDTO) throws JSONException, IOException {

        Map<String, Object> result = this.refundPaymentService.sendRefund(refundRequestDTO);
        return new ResponseEntity<>(new HashMap<>(), HttpStatus.OK);
    }
}
