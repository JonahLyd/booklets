package org.fairfield.booklets.Base;

import org.fairfield.booklets.Entity.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServer extends BaseDao implements UserDetailsService {

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    UserDetails userDetails = super.userDetailsRepository().findByUsername(username);

    if (userDetails == null) {
      throw new UsernameNotFoundException(username);
    }

    return userDetails;
  }
}
