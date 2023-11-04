package com.payment.zalopay.controller;

import com.payment.zalopay.model.RefundStatusRequestDTO;
import com.payment.zalopay.service.RefundStatusPaymentService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

@RestController
public class RefundStatusPaymentController {

    @Autowired
    private RefundStatusPaymentService refundStatusService;

    @PostMapping("/api/v1/get-refund-status")
    public ResponseEntity<Map<String, Object>> getStatusRefund(@RequestBody RefundStatusRequestDTO refundStatusDTO) throws JSONException, IOException, URISyntaxException {

        Map<String, Object> result =  this.refundStatusService.getStatusRefund(refundStatusDTO);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
