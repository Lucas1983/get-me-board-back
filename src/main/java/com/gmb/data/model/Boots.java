package com.gmb.data.model;

import com.gmb.data.dictionary.boots.Lacing;
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
public class Boots extends Equipment {

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Lacing lacing;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    Boots boots = (Boots) o;
    return getId() != null && Objects.equals(getId(), boots.getId());
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
