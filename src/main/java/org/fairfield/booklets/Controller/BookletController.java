package org.fairfield.booklets.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookletController {

  @GetMapping("/booklet")
  String getBooklet() {
    return "booklet";
  }

}
