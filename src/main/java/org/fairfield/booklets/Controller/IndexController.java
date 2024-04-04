package org.fairfield.booklets.Controller;

import org.fairfield.booklets.Entity.Booklet;
import org.fairfield.booklets.Entity.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
class IndexController {

  @RequestMapping("/index")
  String getIndex() {
    return "index";
  }

  @ModelAttribute("recentlyViewedBooklets")
  List<Booklet> getRecentlyViewedBooklets(UserDetails user) {
    return user.getRecentlyViewedBooklets();
  }
}
