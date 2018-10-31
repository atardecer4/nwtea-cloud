package com.moreo.api.test;


import com.moreo.common.utils.MoreoResponse;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

    @RequestMapping("/")
    public interface TestService {

        @GetMapping("/test")
        MoreoResponse test();
}
