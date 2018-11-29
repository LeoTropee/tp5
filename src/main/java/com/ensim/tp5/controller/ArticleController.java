package com.ensim.tp5.controller;

import com.ensim.tp5.model.Article;
import com.ensim.tp5.model.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticleController {
    @Autowired
    ArticleRepository articleRepository;
    @GetMapping("/article")
    public String greeting(@RequestParam(name="idGET",
            required=false, defaultValue="0") long idGET, Model model) {
        Article a = new Article();
        a.setContent("tere");
        model.addAttribute("allArticles",articleRepository.findAll());
        model.addAttribute("article", articleRepository.findById(idGET).get());
        model.addAttribute("id",idGET);
        return "article";
    }
}
