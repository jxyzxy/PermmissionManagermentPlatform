package com.jxy.pmp.server.controller;

import com.jxy.pmp.common.response.BaseResponse;
import com.jxy.pmp.common.response.StatusCode;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lumi
 * @date 2019/11/25 15:33
 */
@RestController
@RequestMapping(value = "test")
public class TestController {
    @RequestMapping(value = "/t1")
    public BaseResponse test(ModelMap modelMap){
        BaseResponse baseResponse = new BaseResponse(StatusCode.Success);
        modelMap.put("test","test");
        baseResponse.setData(modelMap);
        return baseResponse;

    }
}
