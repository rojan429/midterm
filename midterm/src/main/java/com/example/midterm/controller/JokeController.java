package com.example.midterm.controller;

import com.example.midterm.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/joke")
public class JokeController {
    @Autowired
    public JokeService js;

    @GetMapping
    public String getJoke(){
        return js.getJoke();

    }
    public String myController(@ModelAttribute("joke") Model model){
        return "home";
    }

}
