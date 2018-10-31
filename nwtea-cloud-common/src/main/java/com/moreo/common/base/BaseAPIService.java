package com.moreo.common.base;

import com.moreo.common.constants.HTTPEnum;
import com.moreo.common.utils.MoreoResponse;

public abstract class BaseAPIService {
    private final HTTPEnum SUCCESS = HTTPEnum.SUCCESS;
    private final HTTPEnum FAILED = HTTPEnum.FAILED;

    protected MoreoResponse setResultFailed(String message, Object data) {
        return setResult(FAILED.getCode(), message, data);
    }

    protected MoreoResponse setResultFailed() {
        return setResult(FAILED.getCode(), FAILED.getMessage(), null);
    }

    protected MoreoResponse setResultSuccess(Object data) {

        return setResult(SUCCESS.getCode(), SUCCESS.getMessage(), data);
    }

    protected MoreoResponse setResultSuccess() {

        return setResult(SUCCESS.getCode(), SUCCESS.getMessage(), null);
    }

    protected MoreoResponse setResult(int rtnCode, String errorMsg, Object Data) {
        return new MoreoResponse(rtnCode, errorMsg, Data);
    }
}
