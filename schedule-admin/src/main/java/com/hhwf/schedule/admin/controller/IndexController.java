package com.hhwf.schedule.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 32958 on 2019/11/26.
 */
@Controller
public class IndexController extends BaseController{

    @GetMapping("/index")
    public String index() {
        return "index";
    }


}
