package com.gmb.data.mapper;

import com.gmb.data.dto.BindingsDto;
import com.gmb.data.model.Bindings;
import org.mapstruct.Mapper;

@Mapper
public interface BindingsMapper {

  Bindings toBindings(BindingsDto dto);

  BindingsDto fromBindings(Bindings record);
}
