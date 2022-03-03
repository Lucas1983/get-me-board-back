package com.gmb.data.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

@Entity
@Table
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Kit {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  private Long id;

  @ManyToOne
  @JoinColumn(name = "board_fk")
  private Board board;

  @ManyToOne
  @JoinColumn(name = "boots_fk")
  private Boots boots;

  @ManyToOne
  @JoinColumn(name = "bindings_fk")
  private Bindings bindings;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    Kit kit = (Kit) o;
    return id != null && Objects.equals(id, kit.id);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
