package org.fairfield.booklets.entity;

import java.util.Date;

public class Booklet {
  private Long id;
  private Long entityLevelId;
  private Long userIdCreated;
  private Long userIdLastModified;
  private String name;
  private String fileName;
  private Date dateCreated;
  private Date dateLastUpdated;

  public Booklet() {

  }

  private Booklet(Builder builder) {
    setId(builder.id);
    setEntityLevelId(builder.entityLevelId);
    setUserIdCreated(builder.userIdCreated);
    setUserIdLastModified(builder.userIdLastModified);
    setName(builder.name);
    setFileName(builder.fileName);
    setDateCreated(builder.dateCreated);
    setDateLastUpdated(builder.dateLastUpdated);
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

  public Long getUserIdCreated() {
    return userIdCreated;
  }

  public void setUserIdCreated(Long userIdCreated) {
    this.userIdCreated = userIdCreated;
  }

  public Long getUserIdLastModified() {
    return userIdLastModified;
  }

  public void setUserIdLastModified(Long userIdLastModified) {
    this.userIdLastModified = userIdLastModified;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Date getDateLastUpdated() {
    return dateLastUpdated;
  }

  public void setDateLastUpdated(Date dateLastUpdated) {
    this.dateLastUpdated = dateLastUpdated;
  }


  public static final class Builder {
    private Long id;
    private Long entityLevelId;
    private Long userIdCreated;
    private Long userIdLastModified;
    private String name;
    private String fileName;
    private Date dateCreated;
    private Date dateLastUpdated;

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

    public Builder withUserIdCreated(Long userIdCreated) {
      this.userIdCreated = userIdCreated;
      return this;
    }

    public Builder withUserIdLastModified(Long userIdLastModified) {
      this.userIdLastModified = userIdLastModified;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withFileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    public Builder withDateCreated(Date dateCreated) {
      this.dateCreated = dateCreated;
      return this;
    }

    public Builder withDateLastUpdated(Date dateLastUpdated) {
      this.dateLastUpdated = dateLastUpdated;
      return this;
    }

    public Booklet build() {
      return new Booklet(this);
    }
  }
}
