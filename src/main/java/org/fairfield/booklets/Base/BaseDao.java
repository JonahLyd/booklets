package org.fairfield.booklets.Base;

import org.fairfield.booklets.Repository.UserDetailsRepository;
import org.springframework.context.annotation.Bean;

public class BaseDao implements IBaseDao {
  protected UserDetailsRepository userDetailsRepository;

  @Bean
  public UserDetailsRepository userDetailsRepository() {
    return new UserDetailsRepository();
  }
}
