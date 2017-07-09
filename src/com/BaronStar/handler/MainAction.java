package com.BaronStar.handler;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
//标记这个类是一个Handler处理器  
@Controller  
public class MainAction{  
  
    @RequestMapping("/main")//制定这个控制类对应的url  
    public String hello(Model model){  
        String message = "SpringMVC";  
        //为model添加Attribute  
        model.addAttribute("message",message);  
        return "jsp/main";  
    }  

}  
