package com.lb.out;

import lombok.Data;

@Data
public class Result<T> {

    private T data;

    private Integer code;

    private String msg;


}
