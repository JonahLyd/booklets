package org.fairfield.booklets.controller;

import org.fairfield.booklets.entity.Booklet;
import org.fairfield.booklets.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
class IndexController {
  private static final String ENDPOINT_BOOKLET_BY_PATH = "/booklet?fileName=%s&level=%s";

  @RequestMapping(value={"/index", "/index.html"})
  String getIndex(User user, Model model) {
    getRecentlyViewedBooklets(user, model);
    return "index";
  }

  private void getRecentlyViewedBooklets(User user, Model model) {
    int index = 1;
    String file = "filePath";
    String fileName = "fileName";
    for(Booklet booklet: user.getRecentlyViewedBooklets()) {
      model.addAttribute(fileName + index, booklet.getFileName());
      model.addAttribute(file + index, String.format(ENDPOINT_BOOKLET_BY_PATH, booklet.getFileName(), booklet.getEntityLevelId()));
      index += 1;
    }
  }
}
