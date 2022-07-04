package com.movie.reservation.contoroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeConterller {

    
    @GetMapping("/")
    public String getIndexPage(HttpServletRequest request, Model model) {
    	model.addAttribute("hello","서버에서 보내준 값입니다");
    	return "index";
    }
    
    @GetMapping("/member_sign up")
    public String getMember_join(HttpServletRequest request, Model modem) {
    	return "/member_sign up";
    }
}