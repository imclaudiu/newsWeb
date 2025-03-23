package com.example.demo.service;

import com.example.demo.model.WebUser;
import com.example.demo.repository.WebUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebUserService {
    @Autowired
    private WebUserRepository webUserRepository;
    

    public WebUser addWebUser(WebUser webUser) {
        return this.webUserRepository.save(webUser);
    }

    public WebUser updateWebUser(WebUser webUser) {
        WebUser updatedWebUser = this.webUserRepository.save(webUser);

//        updatedWebUser.setId(webUser.getId());
        updatedWebUser.setPassword(webUser.getPassword());
        updatedWebUser.setEmail(webUser.getEmail());
        updatedWebUser.setFirstName(webUser.getFirstName());
        updatedWebUser.setLastName(webUser.getLastName());
        updatedWebUser.setUsername(webUser.getUsername());
        updatedWebUser.setEmail(webUser.getEmail());
        updatedWebUser.setGender(webUser.getGender());
        updatedWebUser.setReporter(webUser.isReporter());

        return updatedWebUser;
    }

}
