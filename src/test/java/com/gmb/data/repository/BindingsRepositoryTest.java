package com.gmb.data.repository;

import com.gmb.data.dictionary.Brand;
import com.gmb.data.dictionary.Flex;
import com.gmb.data.dictionary.Level;
import com.gmb.data.dictionary.bindings.Type;
import com.gmb.data.model.Bindings;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class BindingsRepositoryTest {

  @Autowired BindingsRepository bindingsRepository;

  @Test
  public void shouldFindByType() {

    var bindings1 =
        Bindings.builder()
            .id(1L)
            .brand(Brand.BURTON)
            .model("")
            .level(Level.BEGINNER)
            .flex(Flex.SOFT)
            .type(Type.TRADITIONAL)
            .build();
    var bindings2 =
        Bindings.builder()
            .id(2L)
            .brand(Brand.BATALEON)
            .model("")
            .level(Level.INTERMEDIATE)
            .flex(Flex.MEDIUM)
            .type(Type.FASTBACK)
            .build();
    var bindings3 =
        Bindings.builder()
            .id(3L)
            .brand(Brand.CAPITA)
            .model("")
            .level(Level.ADVANCED)
            .flex(Flex.STIFF)
            .type(Type.STEP_ON)
            .build();

    bindingsRepository.saveAll(List.of(bindings1, bindings2, bindings3));

    List<Bindings> byType = bindingsRepository.findByType(Type.TRADITIONAL);

    Assertions.assertThat(byType).isNotEmpty().containsExactly(bindings1);
  }
}
