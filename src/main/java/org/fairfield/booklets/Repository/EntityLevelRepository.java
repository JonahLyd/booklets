package org.fairfield.booklets.Repository;

import org.fairfield.booklets.Entity.EntityLevel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EntityLevelRepository {

  private final Map<Long, EntityLevel> entityLevelsById;

  public EntityLevelRepository() {

    super();

    this.entityLevelsById = new LinkedHashMap<>();

    final EntityLevel entityLevel1 = EntityLevel.newBuilder()
        .withId(1L)
        .withName("Managers")
        .withCanRead(true)
        .withCanCreate(true)
        .withCanDelete(true)
        .withCanEdit(true)
        .withIsAdmin(false)
        .build();
    this.entityLevelsById.put(entityLevel1.getId(), entityLevel1);

    final EntityLevel entityLevel2 = EntityLevel.newBuilder()
        .withId(2L)
        .withName("Workforce")
        .withCanRead(true)
        .withCanCreate(false)
        .withCanDelete(false)
        .withCanEdit(false)
        .withIsAdmin(false)
        .build();
    this.entityLevelsById.put(entityLevel2.getId(), entityLevel2);

    final EntityLevel entityLevel3 = EntityLevel.newBuilder()
        .withId(3L)
        .withName("IT")
        .withCanRead(true)
        .withCanCreate(true)
        .withCanDelete(true)
        .withCanEdit(true)
        .withIsAdmin(true)
        .build();
    this.entityLevelsById.put(entityLevel3.getId(), entityLevel3);
  }

  public List<EntityLevel> findAll() {
    return new ArrayList<>(this.entityLevelsById.values());
  }

  public EntityLevel findById(final Long id) {
    return this.entityLevelsById.get(id);
  }
}
