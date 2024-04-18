package org.fairfield.booklets.entity;

public class EntityLevel {
  private Long id;
  private String name;
  private Boolean canRead;
  private Boolean canCreate;
  private Boolean canEdit;
  private Boolean canDelete;
  private Boolean isAdmin;

  public EntityLevel() {

  }

  private EntityLevel(Builder builder) {
    setId(builder.id);
    setName(builder.name);
    setCanRead(builder.canRead);
    setCanCreate(builder.canCreate);
    setCanEdit(builder.canEdit);
    setCanDelete(builder.canDelete);
    isAdmin = builder.isAdmin;
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getCanRead() {
    return canRead;
  }

  public void setCanRead(Boolean canRead) {
    this.canRead = canRead;
  }

  public Boolean getCanCreate() {
    return canCreate;
  }

  public void setCanCreate(Boolean canCreate) {
    this.canCreate = canCreate;
  }

  public Boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public Boolean getCanDelete() {
    return canDelete;
  }

  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }

  public Boolean getAdmin() {
    return isAdmin;
  }

  public void setAdmin(Boolean admin) {
    isAdmin = admin;
  }


  public static final class Builder {
    private Long id;
    private String name;
    private Boolean canRead;
    private Boolean canCreate;
    private Boolean canEdit;
    private Boolean canDelete;
    private Boolean isAdmin;

    private Builder() {
    }

    public Builder withId(Long id) {
      this.id = id;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withCanRead(Boolean canRead) {
      this.canRead = canRead;
      return this;
    }

    public Builder withCanCreate(Boolean canCreate) {
      this.canCreate = canCreate;
      return this;
    }

    public Builder withCanEdit(Boolean canEdit) {
      this.canEdit = canEdit;
      return this;
    }

    public Builder withCanDelete(Boolean canDelete) {
      this.canDelete = canDelete;
      return this;
    }

    public Builder withIsAdmin(Boolean isAdmin) {
      this.isAdmin = isAdmin;
      return this;
    }

    public EntityLevel build() {
      return new EntityLevel(this);
    }
  }
}
