package com.gmb.data.model;

import com.gmb.data.dictionary.Brand;
import com.gmb.data.dictionary.Flex;
import com.gmb.data.dictionary.Level;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.Hibernate;

@MappedSuperclass
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class Equipment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long id;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Brand brand;

  @Column(nullable = false)
  private String model;

  @Column private Integer year;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Flex flex;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Level level;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    Equipment equipment = (Equipment) o;
    return id != null && Objects.equals(id, equipment.id);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
