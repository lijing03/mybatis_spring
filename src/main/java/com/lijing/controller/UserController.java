package com.lijing.controller;

import com.lijing.inter.IUserOperation;
import com.lijing.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by puhui on 2016/12/14.
 */
@Controller
@RequestMapping("/article")
public class UserController {
    @Autowired
    IUserOperation userMapper;

    @RequestMapping(value = "/list",method= RequestMethod.GET)
    public ModelAndView listall(HttpServletRequest request, HttpServletResponse response){
        List<Article> articles=userMapper.getUserArticles(1);
        ModelAndView mav=new ModelAndView("list");
        mav.addObject("articles",articles);
        return mav;
    }
}
