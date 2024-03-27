package org.fairfield.booklets.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class IndexController {

  @GetMapping("/")
  String getIndex() {
    return "index";
  }
}
