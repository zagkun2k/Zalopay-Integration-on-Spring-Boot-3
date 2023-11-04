package com.payment.zalopay.controller;

import com.payment.zalopay.model.CallBackPaymentDTO;
import com.payment.zalopay.service.CallBackPaymentService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@RestController
public class CallBackPaymentController {

    @Autowired
    private CallBackPaymentService callBackPaymentService;

    @PostMapping("/api/v1/callback")
    public ResponseEntity<String> callback(@RequestBody CallBackPaymentDTO paymentDTO)
            throws JSONException, NoSuchAlgorithmException, InvalidKeyException {

        JSONObject result = new JSONObject();
        return new ResponseEntity<>(this.callBackPaymentService
                .doCallBack(result, paymentDTO.getJsonString()).toString(), HttpStatus.OK);

    }
}
