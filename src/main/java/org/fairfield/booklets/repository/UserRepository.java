package org.fairfield.booklets.repository;

import org.fairfield.booklets.entity.Booklet;
import org.fairfield.booklets.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Component
@Repository
public class UserRepository {
  private Map<Long, User> idToUser = new HashMap<>();
  private InMemoryUserDetailsManager manager;

  @Bean
  public UserDetailsService userDetailsService() {
    manager = new InMemoryUserDetailsManager();
    manager.createUser(new org.springframework.security.core.userdetails.User("jonah.lydon@student.fairfield.edu", "{noop}pwd", Collections.singleton(new SimpleGrantedAuthority("ADMIN"))));
    manager.createUser(new org.springframework.security.core.userdetails.User("sam.rodriguez@student.fairfield.edu", "{noop}pwd", Collections.singleton(new SimpleGrantedAuthority("USER"))));
    User admin1 = new User();
    admin1.setId(1L);
    admin1.setFullName("Jonah Lydon");
    admin1.setEmail("jonah.lydon@student.fairfield.edu");
    admin1.setPassword("pwd");
    admin1.setPasswordConf("pwd");
    admin1.setPhoneNumber("2032032033");
    List<Booklet> books = new ArrayList<>();
    books.add(Booklet.newBuilder().withFileName("silverSA_TDSDec2016.pdf").withEntityLevelId(1L).build());
    books.add(Booklet.newBuilder().withFileName("brAlloy25C17200StripDataSheet.pdf").withEntityLevelId(2L).build());
    books.add(Booklet.newBuilder().withFileName("jotunSurface37f.pdf").withEntityLevelId(2L).build());
    books.add(Booklet.newBuilder().withFileName("TDS_vinyl_coat.pdf").withEntityLevelId(1L).build());
    admin1.setRecentlyViewedBooklets(books);
    User user1 = new User();
    user1.setId(1L);
    user1.setFullName("Jonah Lydon");
    user1.setEmail("jonah.lydon@student.fairfield.edu");
    user1.setPassword("pwd");
    user1.setPasswordConf("pwd");
    user1.setPhoneNumber("2032032033");
    user1.setRecentlyViewedBooklets(books);

    idToUser.put(admin1.getId(), admin1);
    idToUser.put(user1.getId(), user1);

    return manager;
  }

  /**
   * Saves a user to the 'repo'
   *
   * @param user the user to be saved
   */
  public void save(User user) {
    manager.createUser(new org.springframework.security.core.userdetails.User(user.getEmail(), "{noop}" + user.getPassword(), Collections.singleton(new SimpleGrantedAuthority("USER"))));
    idToUser.put(user.getId(), user);
  }

  /**
   * Gets all users present in 'repo'
   *
   * @return Collection containing all user POJOs
   */
  public Collection<User> findAll() {
    return idToUser.values();
  }

  public User getById(Long id) {
    return idToUser.get(id);
  }
}
