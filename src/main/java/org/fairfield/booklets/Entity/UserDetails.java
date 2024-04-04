package org.fairfield.booklets.Entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public class UserDetails extends User {
  private Long id;
  private Long entityLevelId;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private List<Booklet> recentlyViewedBooklets;

  private UserDetails(Builder builder) {
    super(builder.email, builder.password, builder.authorities);
    setId(builder.id);
    setEntityLevelId(builder.entityLevelId);
    setFirstName(builder.firstName);
    setLastName(builder.lastName);
    setPhoneNumber(builder.phoneNumber);
    setRecentlyViewedBooklets(builder.recentlyViewedBooklets);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getEntityLevelId() {
    return entityLevelId;
  }

  public void setEntityLevelId(Long entityLevelId) {
    this.entityLevelId = entityLevelId;
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

  public static final class Builder {
    private Long id;
    private Long entityLevelId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private List<GrantedAuthority> authorities;
    private List<Booklet> recentlyViewedBooklets;

    private Builder() {
    }

    public Builder withId(Long id) {
      this.id = id;
      return this;
    }

    public Builder withEntityLevelId(Long entityLevelId) {
      this.entityLevelId = entityLevelId;
      return this;
    }

    public Builder withFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder withLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder withEmail(String email) {
      this.email = email;
      return this;
    }

    public Builder withPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public Builder withPassword(String password) {
      this.password = password;
      return this;
    }

    public Builder withAuthorities(List<GrantedAuthority> authorities) {
      this.authorities = authorities;
      return this;
    }

    public Builder withRecentlyViewedBooklets(List<Booklet> recentlyViewedBooklets) {
      this.recentlyViewedBooklets = recentlyViewedBooklets;
      return this;
    }

    public UserDetails build() {
      return new UserDetails(this);
    }
  }
}
