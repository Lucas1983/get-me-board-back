package com.gmb.data.repository;

import com.gmb.data.dictionary.Brand;
import com.gmb.data.dictionary.Flex;
import com.gmb.data.dictionary.Level;
import com.gmb.data.model.Equipment;
import java.util.List;

public interface EquipmentRepository<T extends Equipment> {

  List<T> findByModel(String model);

  List<T> findByBrand(Brand brand);

  List<T> findByYear(int year);

  List<T> findByFlex(Flex flex);

  List<T> findByLevel(Level level);
}
