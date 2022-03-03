package com.gmb.data.repository;

import com.gmb.data.dictionary.bindings.Type;
import com.gmb.data.model.Bindings;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BindingsRepository
    extends EquipmentRepository<Bindings>, CrudRepository<Bindings, Long> {

  List<Bindings> findByType(Type type);
}
