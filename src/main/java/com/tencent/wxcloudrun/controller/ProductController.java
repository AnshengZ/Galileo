package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.CounterRequest;
import com.tencent.wxcloudrun.dto.ProductRequest;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.CounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    ApiResponse get(@PathVariable String pid) {
        logger.info("/api/count get request "+pid);
        return ApiResponse.ok("{\"date\":false,\"pid\":\"11231\",\"info\":\"FlvaQv4he4\",\"name\":\"电信小翼版SL181小鹤台灯模型\",}");
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