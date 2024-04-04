package org.fairfield.booklets.Repository;

import org.fairfield.booklets.Entity.Booklet;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookletRepository {

  private final Map<Long, Booklet> bookletsById;

  public BookletRepository() {

    super();

    this.bookletsById = new LinkedHashMap<>();

    final Booklet booklet1 = Booklet.newBuilder()
        .withId(1L)
        .withUserIdCreated(1L)
        .withUserIdLastModified(1L)
        .withEntityLevelId(1L)
        .withFilePath("files/level1/silverSA_TDSDec2016.pdf")
        .withName("silverSA TDS")
        .withDateCreated(Date.valueOf("3-5-2024"))
        .withDateLastUpdated(Date.valueOf("3-5-2024"))
        .build();
    this.bookletsById.put(booklet1.getId(), booklet1);

    final Booklet booklet2 = Booklet.newBuilder()
        .withId(2L)
        .withUserIdCreated(1L)
        .withUserIdLastModified(1L)
        .withEntityLevelId(1L)
        .withFilePath("files/level1/TDS_vinyl_coat.pdf")
        .withName("TDS vinyl coating")
        .withDateCreated(Date.valueOf("3-6-2024"))
        .withDateLastUpdated(Date.valueOf("3-6-2024"))
        .build();
    this.bookletsById.put(booklet2.getId(), booklet2);

    final Booklet booklet3 = Booklet.newBuilder()
        .withId(3L)
        .withUserIdCreated(1L)
        .withUserIdLastModified(1L)
        .withEntityLevelId(2L)
        .withFilePath("files/level2/brAlloy25C17200StripDataSheet.pdf")
        .withName("Alloy Strip Data Sheet")
        .withDateCreated(Date.valueOf("3-7-2024"))
        .withDateLastUpdated(Date.valueOf("3-7-2024"))
        .build();
    this.bookletsById.put(booklet3.getId(), booklet3);

    final Booklet booklet4 = Booklet.newBuilder()
        .withId(4L)
        .withUserIdCreated(1L)
        .withUserIdLastModified(1L)
        .withEntityLevelId(2L)
        .withFilePath("files/level2/hard-chrome-105-plating-proces.pdf")
        .withName("Hard Chrome Plating Process")
        .withDateCreated(Date.valueOf("3-9-2024"))
        .withDateLastUpdated(Date.valueOf("3-9-2024"))
        .build();
    this.bookletsById.put(booklet4.getId(), booklet4);

    final Booklet booklet5 = Booklet.newBuilder()
        .withId(5L)
        .withUserIdCreated(1L)
        .withUserIdLastModified(1L)
        .withEntityLevelId(2L)
        .withFilePath("files/level2/jotunSurface37f.pdf")
        .withName("Jotun Surface")
        .withDateCreated(Date.valueOf("3-10-2024"))
        .withDateLastUpdated(Date.valueOf("3-10-2024"))
        .build();
    this.bookletsById.put(booklet5.getId(), booklet5);

    final Booklet booklet6 = Booklet.newBuilder()
        .withId(6L)
        .withUserIdCreated(1L)
        .withUserIdLastModified(1L)
        .withEntityLevelId(2L)
        .withFilePath("files/level2/SDS_-_Bright_Gold_Solution_-2022.pdf")
        .withName("SDS Bright Gold Solution")
        .withDateCreated(Date.valueOf("3-13-2024"))
        .withDateLastUpdated(Date.valueOf("3-13-2024"))
        .build();
    this.bookletsById.put(booklet6.getId(), booklet6);
  }

  public List<Booklet> findAll() {
    return new ArrayList<>(this.bookletsById.values());
  }

  public Booklet findById(final Long id) {
    return this.bookletsById.get(id);
  }
}
