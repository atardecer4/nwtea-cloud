package com.moreo.api.test.impl;

import com.moreo.api.test.TestService;
import com.moreo.common.base.BaseAPIService;
import com.moreo.common.utils.MoreoResponse;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestServiceImpl extends BaseAPIService implements TestService {
    @Override
    public MoreoResponse test() {
        return setResultSuccess();
    }
}
