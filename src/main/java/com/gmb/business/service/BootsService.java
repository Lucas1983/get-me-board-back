package com.gmb.business.service;

import com.gmb.data.model.Boots;
import com.gmb.data.repository.BootsRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BootsService implements EquipmentService<Boots> {

  @NonNull private final BootsRepository bootsRepository;

  @Override
  public Optional<Boots> findOneById(Long id) {
    return bootsRepository.findById(id);
  }

  @Override
  public Collection<Boots> findAll() {

    Collection<Boots> coll = new ArrayList<>();
    bootsRepository.findAll().forEach(coll::add);
    return coll;
  }

  @Override
  public void create(Boots boots) {
    bootsRepository.save(boots);
  }

  @Override
  public void update(Boots boots) {
    bootsRepository.save(boots);
  }

  @Override
  public void remove(Boots boots) {
    bootsRepository.delete(boots);
  }

  @Override
  public void removeById(Long id) {
    bootsRepository.deleteById(id);
  }
}
