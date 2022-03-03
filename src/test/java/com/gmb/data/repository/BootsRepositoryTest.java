package com.gmb.data.repository;

import com.gmb.data.dictionary.Brand;
import com.gmb.data.dictionary.Flex;
import com.gmb.data.dictionary.Level;
import com.gmb.data.dictionary.boots.Lacing;
import com.gmb.data.model.Boots;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class BootsRepositoryTest {

  @Autowired BootsRepository bootsRepository;

  @Test
  public void shouldFindByLacing() {

    var boots1 =
        Boots.builder()
            .id(1L)
            .brand(Brand.SALOMON)
            .model("")
            .level(Level.BEGINNER)
            .flex(Flex.SOFT)
            .lacing(Lacing.TRADITIONAL)
            .build();
    var boots2 =
        Boots.builder()
            .id(2L)
            .brand(Brand.BURTON)
            .model("")
            .level(Level.INTERMEDIATE)
            .flex(Flex.MEDIUM)
            .lacing(Lacing.QUICK_PULL)
            .build();
    var boots3 =
        Boots.builder()
            .id(3L)
            .brand(Brand.DC)
            .model("")
            .level(Level.ADVANCED)
            .flex(Flex.STIFF)
            .lacing(Lacing.BOA)
            .build();

    bootsRepository.saveAll(List.of(boots1, boots2, boots3));

    List<Boots> byLacing = bootsRepository.findByLacing(Lacing.TRADITIONAL);

    Assertions.assertThat(byLacing).isNotEmpty().containsExactly(boots1);
  }
}
