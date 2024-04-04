package org.fairfield.booklets.Controller;

import org.fairfield.booklets.Base.BaseDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController extends BaseDao {
  @GetMapping(value={"/", "/logout"})
  public String getLogin() {
    return "login";
  }

  @RequestMapping("/login-error.html")
  public String loginError(Model model) {
    model.addAttribute("loginError", true);
    return "login.html";
  }

  @ModelAttribute("authenticateLogin")
  Boolean authenticateLogin(String username, String password) {
    return super.userDetailsRepository().authenticateUser(username, password);
  }

}
