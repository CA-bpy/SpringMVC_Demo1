package com.ca_bpy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Create controller object.
 * Processing user submitted requests.
 */
@Controller
public class MyController {
    @RequestMapping(value = {"/some.do","/first.do"})
    public ModelAndView doSome() {
        //Handle the request for some.do
        System.out.println("处理some.do请求");
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg1","练习SpringMVC做web开发1");
        mv.addObject("med1","执行doSome方法");
        mv.setViewName("some");
        return mv;
    }

    @RequestMapping(value = {"/other.do","/second.do"})
    public ModelAndView doOther() {
        //Handle the request for other.do
        System.out.println("处理other.do请求");
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg2","练习SpringMVC做web开发2");
        mv.addObject("med2","执行doOther方法");
        mv.setViewName("other");
        return mv;
    }
}
