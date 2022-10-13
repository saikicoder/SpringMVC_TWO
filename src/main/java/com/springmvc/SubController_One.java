package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SubController_One {


    @RequestMapping("/show")
    public String display(){
        return "one";
    }

    @RequestMapping("/showName")
    public String displayName(Model model){
        String myName = "Sai Bhavya";
        model.addAttribute("nameValue",myName);
        return "one";
    }
}
