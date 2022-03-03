package com.gmb.data;

import com.github.javafaker.Faker;
import com.gmb.data.dictionary.Brand;
import com.gmb.data.dictionary.Classification;
import com.gmb.data.dictionary.Flex;
import com.gmb.data.dictionary.Level;
import com.gmb.data.dictionary.bindings.Type;
import com.gmb.data.dictionary.board.Base;
import com.gmb.data.dictionary.board.Core;
import com.gmb.data.dictionary.board.Profile;
import com.gmb.data.dictionary.board.Shape;
import com.gmb.data.dictionary.boots.Lacing;
import com.gmb.data.model.Bindings;
import com.gmb.data.model.Board;
import com.gmb.data.model.Boots;
import com.gmb.data.repository.BindingsRepository;
import com.gmb.data.repository.BoardRepository;
import com.gmb.data.repository.BootsRepository;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SampleDataGenerator implements CommandLineRunner {

  private static final List<Brand> BRANDS = List.of(Brand.values());
  private static final List<Classification> CLASSIFICATIONS = List.of(Classification.values());
  private static final List<Flex> FLEXES = List.of(Flex.values());
  private static final List<Level> LEVELS = List.of(Level.values());
  private static final List<Base> BASES = List.of(Base.values());
  private static final List<Core> CORES = List.of(Core.values());
  private static final List<Profile> PROFILES = List.of(Profile.values());
  private static final List<Shape> SHAPES = List.of(Shape.values());
  private static final List<Type> TYPES = List.of(Type.values());
  private static final List<Lacing> LACINGS = List.of(Lacing.values());

  private static final Faker FAKER = Faker.instance();

  private static final Random RANDOM = new Random();

  @NonNull private final BootsRepository bootsRepository;
  @NonNull private final BoardRepository boardRepository;
  @NonNull private final BindingsRepository bindingsRepository;

  static <T> T randomEnum(List<T> enums) {
    return enums.get(RANDOM.nextInt(enums.size()));
  }

  @Override
  public void run(String... args) throws Exception {

    generateSampleBoots();
    generateSampleBindings();
    generateSampleBoards();
  }

  private void generateSampleBoards() {

    Stream.<Board>generate(
            () ->
                Board.builder()
                    .brand(randomEnum(BRANDS))
                    .model(FAKER.gameOfThrones().city())
                    .year(RANDOM.nextInt(1990, 2020))
                    .flex(randomEnum(FLEXES))
                    .level(randomEnum(LEVELS))
                    .length(RANDOM.nextInt(140, 180))
                    .classification(randomEnum(CLASSIFICATIONS))
                    .base(randomEnum(BASES))
                    .core(randomEnum(CORES))
                    .profile(randomEnum(PROFILES))
                    .shape(randomEnum(SHAPES))
                    .build())
        .limit(100)
        .forEach(boardRepository::save);
  }

  private void generateSampleBindings() {

    Stream.<Bindings>generate(
            () ->
                Bindings.builder()
                    .brand(randomEnum(BRANDS))
                    .model(FAKER.gameOfThrones().city())
                    .year(RANDOM.nextInt(1990, 2020))
                    .flex(randomEnum(FLEXES))
                    .level(randomEnum(LEVELS))
                    .type(randomEnum(TYPES))
                    .build())
        .limit(100)
        .forEach(bindingsRepository::save);
  }

  public void generateSampleBoots() {

    Stream.<Boots>generate(
            () ->
                Boots.builder()
                    .brand(randomEnum(BRANDS))
                    .model(FAKER.gameOfThrones().city())
                    .year(RANDOM.nextInt(1990, 2020))
                    .flex(randomEnum(FLEXES))
                    .level(randomEnum(LEVELS))
                    .lacing(randomEnum(LACINGS))
                    .build())
        .limit(100)
        .forEach(bootsRepository::save);
  }
}
