package com.example.demo7.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("业务相关接口")
@RestController
public class DemoController {
    @ApiOperation("查询业务列表")
    @GetMapping("/findDemoList")
    public String findDemoList(){
        return "业务列表内容";
    }

}
