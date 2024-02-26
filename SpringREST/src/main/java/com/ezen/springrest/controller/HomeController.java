package com.ezen.springrest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
   
   private static Logger logger = LoggerFactory.getLogger(HomeController.class);
   

   @GetMapping("/")
   public String home() {
      return "home";
   }
   
   @GetMapping("/quiz")
   public String quiz() {
	   return "quiz";
   }
   
   @ResponseBody // 이거 추가하면 "fruit" 문자열을 응답해준다.
   @GetMapping(value = "/fruit", produces = "text/plain; charset=UTF-8") 
   public String fruit() {
      //원래의미: /WEB-INF/views/fruit.jsp로 포워드하겠다
      return "fruit";
   }
   
   
}