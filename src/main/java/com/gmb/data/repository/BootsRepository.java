package com.gmb.data.repository;

import com.gmb.data.dictionary.boots.Lacing;
import com.gmb.data.model.Boots;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BootsRepository extends EquipmentRepository<Boots>, CrudRepository<Boots, Long> {

  List<Boots> findByLacing(Lacing lacing);
}
