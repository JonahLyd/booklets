package org.fairfield.booklets.controller;

import org.fairfield.booklets.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }
}
