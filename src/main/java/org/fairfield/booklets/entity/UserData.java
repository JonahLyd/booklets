package org.fairfield.booklets.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Collection;

public class UserData implements UserDetails {
  private Long id;

  @NotNull
  @NotEmpty
  private String firstName;
  @NotNull
  @NotEmpty
  private String lastName;
  @NotNull
  @NotEmpty
  private String email;
  @NotNull
  @NotEmpty
  private String password;
  @NotNull
  @NotEmpty
  private String passwordConf;
  private Collection<? extends GrantedAuthority> authorities;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPasswordConf() {
    return passwordConf;
  }

  public void setPasswordConf(String passwordConf) {
    this.passwordConf = passwordConf;
  }


  public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
    this.authorities = authorities;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
  }

  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return email;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
