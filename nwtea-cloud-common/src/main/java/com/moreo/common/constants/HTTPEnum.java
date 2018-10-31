package com.moreo.common.constants;

import lombok.Getter;

@Getter
public enum HTTPEnum {
    SUCCESS(200, "success"), FAILED(500, "failed");

    private Integer code;
    private String message;


    HTTPEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HTTPEnum codeOf(Integer code) {
        for (HTTPEnum httpEnum : values()) {
            if (httpEnum.getCode() == code){
                return httpEnum;
            }
        }
        return null;
    }

}
