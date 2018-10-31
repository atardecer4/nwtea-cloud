package com.moreo.common.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MoreoResponse {
    private int rtnCode;
    private String message;
    private Object data;
}
