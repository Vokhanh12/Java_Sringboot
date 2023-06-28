package com.example.HelloWorld.demo.Controller;

import com.example.HelloWorld.demo.Data.RegistrationData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("/register")
    public String registerUser(@RequestBody RegistrationData registrationData) {
        String username = registrationData.getUsername();
        String password = registrationData.getPassword();
        String email = registrationData.getEmail();

        return "Đăng ký thành công";
    }
}