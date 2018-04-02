package com.wiley.beginningspring.ch3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Project: basic
 * @Author: fanlihua
 * @Date: 2018/3/29
 */

@Controller
public class helloServlet {

    @RequestMapping("/hello")
    public ModelAndView sayHello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello, Reader!");
        mv.setViewName("helloReader");
        return mv;
    }

}
