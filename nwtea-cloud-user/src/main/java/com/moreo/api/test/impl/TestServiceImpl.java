package com.moreo.api.test.impl;

import com.moreo.api.test.TestService;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestServiceImpl implements TestService {
    @Override
    public Map test() {
        Map result = new HashMap();
        result.put("errorCode", 200);
        result.put("message", "success");
        result.put("data", "test");
        return result;
    }
}
