package com.example.websaitw.controller;
import com.example.websaitw.models.repos.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping()
    public String home(Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return "about";
    }

    @GetMapping("/login")
    public String login (Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return "login";
    }

}