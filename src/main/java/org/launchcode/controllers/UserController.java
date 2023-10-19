package org.launchcode.controllers;

import jakarta.validation.Valid;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("/add")
    public String displayAddUserForm(Model model) {
        model.addAttribute(new User());     //automatic name: "user"
        return "user/add";
    }

    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute @Valid User user, Errors errors, String verify) {
        model.addAttribute("user", user);
        if (user.getPassword().equals(verify)) {
            if (errors.hasErrors()) {
                return "user/add";
            } else {
                return "user/index";
            }
        }
        model.addAttribute("error", "Passwords must match.");
            return "user/add";


    }


}