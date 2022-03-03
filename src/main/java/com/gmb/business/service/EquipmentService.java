package com.gmb.business.service;

import com.gmb.data.model.Equipment;
import java.util.Collection;
import java.util.Optional;

public interface EquipmentService<T extends Equipment> {

  Optional<T> findOneById(Long id) throws Exception;

  Collection<T> findAll() throws Exception;

  void create(T equipment) throws Exception;

  void update(T equipment) throws Exception;

  void remove(T equipment) throws Exception;

  void removeById(Long id) throws Exception;
}
