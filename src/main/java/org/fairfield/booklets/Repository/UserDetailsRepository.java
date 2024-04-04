package org.fairfield.booklets.Repository;

import org.fairfield.booklets.Entity.UserDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserDetailsRepository {
  private final Map<String, UserDetails> usersByEmail;
  private final Map<Long, UserDetails> usersById;

  public UserDetailsRepository() {
    super();
    this.usersByEmail = new LinkedHashMap<>();
    this.usersById = new LinkedHashMap<>();
    final UserDetails admin1 = UserDetails.newBuilder()
        .withId(1L)
        .withEntityLevelId(3L)
        .withFirstName("Jonah")
        .withLastName("Lydon")
        .withEmail("jonah.lydon@student.fairfield.edu")
        .withPassword(passwordEncoder().encode("pwd"))
        .withAuthorities(Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN")))
        .withPhoneNumber("203-203-2032")
        .build();
    final UserDetails user1 = UserDetails.newBuilder()
        .withId(2L)
        .withEntityLevelId(2L)
        .withFirstName("Sam")
        .withLastName("Rodriguez")
        .withEmail("sam.rodriguez@student.fairfield.edu")
        .withPassword(passwordEncoder().encode("pwd"))
        .withAuthorities(Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER")))
        .withPhoneNumber("203-302-3032")
        .build();

    this.usersByEmail.put(admin1.getUsername(), admin1);
    this.usersByEmail.put(user1.getUsername(), user1);
    this.usersById.put(admin1.getId(), admin1);
    this.usersById.put(user1.getId(), user1);
  }

  public List<UserDetails> findAll() {
    return new ArrayList<>(this.usersByEmail.values());
  }

  public UserDetails findById(final Long id) {
    return this.usersById.get(id);
  }

  public UserDetails findByUsername(String username) {
    return this.usersByEmail.get(username);
  }

  public Boolean authenticateUser(String username, String password) {
    UserDetails user = this.usersByEmail.get(username);
    return user != null && passwordEncoder().matches(password, user.getPassword());
  }

  @Bean
  BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
