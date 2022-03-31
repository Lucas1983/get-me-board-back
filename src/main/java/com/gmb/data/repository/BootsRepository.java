package com.gmb.data.repository;

import com.gmb.data.dictionary.boots.Lacing;
import com.gmb.data.model.Boots;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BootsRepository
    extends EquipmentRepository<Boots>, PagingAndSortingRepository<Boots, Long> {

  List<Boots> findByLacing(Lacing lacing);
}
