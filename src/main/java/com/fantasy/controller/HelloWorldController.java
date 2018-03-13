package com.fantasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/3/9.
 */
@Controller
public class HelloWorldController {

  @ResponseBody
  @RequestMapping(value = "hello", method = RequestMethod.GET)
  String hello() {
    return "hello";
  }


}
