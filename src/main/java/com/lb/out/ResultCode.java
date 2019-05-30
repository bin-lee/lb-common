package com.lb.out;


import lombok.Data;

@Data
public class ResultCode {

     static Integer SUCCESS_CODE = 200, FAIL_CODE = 500;
     static String NULL = null;

    private Integer code;

    private String name;

     ResultCode(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    protected static String  getName(Integer code){
         switch (code){
             case 200:
                 return "操作成功";
             case 500:
                 return "操作失败";
             default:
                 return "其它";
         }
    }

}
