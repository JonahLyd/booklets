package org.fairfield.booklets.security;

import org.fairfield.booklets.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class AuthProvider implements AuthenticationProvider {
  @Autowired
  UserRepository userRepository;
  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    String creds = (String) authentication.getCredentials();
    String payloadUser = (String) authentication.getPrincipal();

    System.out.println(payloadUser);
    System.out.println(creds);
//    String credsFormat = actualUser.getEmail() + ":" + actualUser.getPassword();
//    if (actualUser == null || !credsFormat.equals(creds)) {
//      authentication.setAuthenticated(false);
//      return authentication;
//    }
    return authentication;
  }

  @Override
  public boolean supports(Class<?> authentication) {
    return Authentication.class.isAssignableFrom(authentication);
  }
}
