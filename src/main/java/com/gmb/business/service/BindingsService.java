package com.gmb.business.service;

import com.gmb.data.model.Bindings;
import com.gmb.data.repository.BindingsRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BindingsService implements EquipmentService<Bindings> {

  @NonNull private final BindingsRepository bindingsRepository;

  @Override
  public Optional<Bindings> findOneById(Long id) {
    return bindingsRepository.findById(id);
  }

  @Override
  public Collection<Bindings> findAll() {
    Collection<Bindings> coll = new ArrayList<>();
    bindingsRepository.findAll().forEach(coll::add);
    return coll;
  }

  @Override
  public void create(Bindings bindings) {
    bindingsRepository.save(bindings);
  }

  @Override
  public void update(Bindings bindings) {
    bindingsRepository.save(bindings);
  }

  @Override
  public void remove(Bindings bindings) {
    bindingsRepository.delete(bindings);
  }

  @Override
  public void removeById(Long id) {
    bindingsRepository.deleteById(id);
  }
}
