package org.kamar.system_reactive.thymeleaf_controlers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping({"/"})
public class MainController {

    @GetMapping(value = {"home"})
    public String getHomePage(Model model, @RequestParam(value = "title", required = false) String title){

        model.addAttribute("title", title);
        model.addAttribute("scientists", List.of("samson", "kamar", "baraka"));

        return "index";
    }
}
