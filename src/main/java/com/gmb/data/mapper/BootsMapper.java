package com.gmb.data.mapper;

import com.gmb.data.dto.BootsDto;
import com.gmb.data.model.Boots;
import org.mapstruct.Mapper;

@Mapper
public interface BootsMapper {

  Boots toBoots(BootsDto dto);

  BootsDto fromBoots(Boots record);
}
