package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.CounterRequest;
import com.tencent.wxcloudrun.dto.ProductRequest;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.CounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * counter控制器
 */
@RestController
public class ProductController {

    final Logger logger=LoggerFactory.getLogger(ProductController.class);


    /**
     * 获取当前产品
     *
     * @return API response json
     */
    @GetMapping(value = "/pdt/get/{pid}")
    ApiResponse get(@PathVariable String pid) throws JSONException {
        logger.info("/pdt/get pid:{} ",pid);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","kh");
        jsonObject.put("info","product info");
        jsonObject.put("pid",pid);
        jsonObject.put("count",1);
        return ApiResponse.ok(jsonObject);
    }


    /**
     * 获取产品
     *
     * @param request {@link ProductRequest}
     * @return API response json
     */
    @PostMapping(value = "/pdt/info")
    ApiResponse create(@RequestBody ProductRequest request) {
        logger.info("/pdt/get post request param {}",request);
        return ApiResponse.ok(request);
    }

}