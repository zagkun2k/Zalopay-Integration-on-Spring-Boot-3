package com.payment.zalopay.common.constants;

public class ZalopayConstant {

    public static final String APP_ID = "2554";
    public static final String KEY1 = "sdngKKJmqEMzvh5QQcdD2A9XBSKUNaYn";
    public static final String KEY2 = "kLtgPl8HHhfvMuDHPwKfgfsY4Ydm9eIz";
    public static final String ORDER_CREATE_ENDPOINT
            = "https://sandbox.zalopay.com.vn/v001/tpe/createorder";

    public static final String ORDER_STATUS_ENDPOINT
            = "https://sandbox.zalopay.com.vn/v001/tpe/getstatusbyapptransid";

    public static final String REFUND_PAYMENT_ENDPOINT
            = "https://sb-openapi.zalopay.vn/v2/refund";

    public static final String REFUND_STATUS_PAYMENT_ENDPOINT
            = "https://sb-openapi.zalopay.vn/v2/query_refund";
}
