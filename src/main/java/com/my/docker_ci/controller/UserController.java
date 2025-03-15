package com.my.docker_ci.controller;

import com.my.docker_ci.dto.UserDto;
import com.my.docker_ci.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("list",
                userService.getAllUsers());
        return "main";
    }

    @GetMapping("/input")
    public String viewNameInput() {
        return "input";
    }

    @PostMapping("/save")
    public String save(UserDto dto) {
        userService.saveUser(dto);
        return "redirect:/";
    }
}
