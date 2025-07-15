package com.learning.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        System.out.println("home method called");
        return "index";
    }

    @RequestMapping("addAlien")
    public ModelAndView add(Alien alien, ModelAndView mv) {

        mv.addObject("alien", alien);
        mv.setViewName("result");
       return mv;

    }
}
