package org.fairfield.booklets.Base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends BaseDao {

  @Bean
  public SecurityFilterChain formLoginFilterChain(HttpSecurity http) throws Exception {
    http.userDetailsService(userDetailsServer())
        .authorizeHttpRequests(authorizationManagerRequestMatcherRegistry -> authorizationManagerRequestMatcherRegistry
            .anyRequest().authenticated())
        .formLogin(httpSecurityFormLoginConfigurer -> httpSecurityFormLoginConfigurer
            .loginPage("/login").permitAll()
            .defaultSuccessUrl("/index"))
        .logout(httpSecurityLogoutConfigurer -> httpSecurityLogoutConfigurer.permitAll()
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            .logoutSuccessUrl("/login"));
    return http.build();
  }

  @Bean
  public UserDetailsServer userDetailsServer() {
    return new UserDetailsServer();
  }
}