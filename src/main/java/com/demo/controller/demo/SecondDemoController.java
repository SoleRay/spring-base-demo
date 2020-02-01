package com.demo.controller.demo;

import com.demo.bean.result.Result;
import com.demo.util.resp.ResponseUtil;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second/demo")
public class SecondDemoController {

    @PostMapping(value="/cheat",produces= MediaType.APPLICATION_JSON_VALUE)
    public Result tryCheat(String box){


        return ResponseUtil.setDefaultSuccessResponse();
    }

    @GetMapping(value="/cry",produces= MediaType.APPLICATION_JSON_VALUE)
    public Result willCry(int age){


        return ResponseUtil.setDefaultSuccessResponse();
    }
}
