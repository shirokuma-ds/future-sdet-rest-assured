package com.future.sdet.starter;

public enum WebServiceEndPoints {
    CUSTOMER_GET_ALL("http://localhost:8080/customer/allcustomer"),
    CUSTOMER_GET_BY_ID("http://localhost:8080/customer/{id}"),
    CUSTOMER_ADD("http://localhost:8080/register/customer"),
    CUSTOMER_UPDATE("http://localhost:8080/update/customer"),
    CUSTOMER_DELETE("http://localhost:8080/delete/customer");

    private final String url;

    WebServiceEndPoints(String url) {this.url = url;}

    public String getUrl() {return url;}
}
