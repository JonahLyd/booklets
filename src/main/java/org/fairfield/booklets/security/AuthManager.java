package org.fairfield.booklets.security;

import org.fairfield.booklets.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
@EnableGlobalAuthentication
public class AuthManager implements AuthenticationManager {
  @Autowired
  AuthProvider authenticationProvider;
  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    return authenticationProvider.authenticate(authentication);
  }
}
