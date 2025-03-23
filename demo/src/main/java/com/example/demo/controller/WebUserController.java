package com.example.demo.controller;

import com.example.demo.model.WebUser;
import com.example.demo.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webUser")
public class WebUserController {
    @Autowired
    private WebUserService webUserService;

    @PostMapping("/register")
    public WebUser registerWebUser(@RequestBody WebUser webUser) {
        return this.webUserService.addWebUser(webUser);
    }
}
