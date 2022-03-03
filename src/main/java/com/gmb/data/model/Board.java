package com.gmb.data.model;

import com.gmb.data.dictionary.Classification;
import com.gmb.data.dictionary.board.Base;
import com.gmb.data.dictionary.board.Core;
import com.gmb.data.dictionary.board.Profile;
import com.gmb.data.dictionary.board.Shape;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.Hibernate;

@Entity
@Table
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Board extends Equipment {

  @Column(nullable = false)
  private Integer length;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Classification classification;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Profile profile;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Shape shape;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Core core;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Base base;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    Board board = (Board) o;
    return getId() != null && Objects.equals(getId(), board.getId());
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
