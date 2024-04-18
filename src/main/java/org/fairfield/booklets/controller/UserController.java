package org.fairfield.booklets.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.fairfield.booklets.entity.User;
import org.fairfield.booklets.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
  @Autowired
  private UserRepository repository;

  @GetMapping("/register")
  public String showRegistrationForm(Model model, User user) {
    model.addAttribute("user", user);
    return "register";
  }

  @PostMapping("/register")
  public String addUser(@Valid User user, BindingResult result, Model model) {
    if (result.hasErrors()) {
      result.getAllErrors().forEach(error -> {
        System.out.println(error.getDefaultMessage());
      });
      return "addUser";
    }

    repository.save(user);
    model.addAttribute("users", repository.findAll());
    return "home";
  }

  public ModelAndView registerUser(@ModelAttribute("user") User user,
                                   HttpServletRequest request, Errors errors) {
    try {
//      Boolean registered = userDetailsServer.registerNewUserAccount(userData);
    } catch (Exception e) {
      throw new Error(e.getMessage());
    }

    return new ModelAndView("successRegister", "user", user);
  }

}
