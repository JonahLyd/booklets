package org.fairfield.booklets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.InputStream;

@Controller
public class BookletController {

  @GetMapping("/booklet")
  String getBooklet(@RequestParam String fileName, @RequestParam String level, Model model) {
    model.addAttribute("file", fileName);
    model.addAttribute("level", level);
    return "booklet";
  }

}
