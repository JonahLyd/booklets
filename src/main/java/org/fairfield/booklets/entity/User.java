package org.fairfield.booklets.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

public class User {
  private Long id;

  @NotEmpty(message = "User's name cannot be empty.")
  @Size(min = 5, max = 250)
  private String fullName;

  @NotEmpty(message = "User's email cannot be empty.")
  private String email;

  @NotEmpty(message = "User's password cannot be empty.")
  private String password;

  @NotEmpty(message = "User's password cannot be empty.")
  private String passwordConf;

  private String phoneNumber;

  private List<Booklet> recentlyViewedBooklets;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
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

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public List<Booklet> getRecentlyViewedBooklets() {
    return recentlyViewedBooklets;
  }

  public void setRecentlyViewedBooklets(List<Booklet> recentlyViewedBooklets) {
    this.recentlyViewedBooklets = recentlyViewedBooklets;
  }
}
