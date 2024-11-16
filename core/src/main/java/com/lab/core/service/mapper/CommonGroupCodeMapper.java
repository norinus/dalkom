package com.lab.core.service.mapper;

import com.lab.core.domain.CommonGroupCode;
import com.lab.core.service.dto.CommonGroupCodeDTO;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CommonGroupCodeMapper {

    CommonGroupCode toEntity(CommonGroupCodeDTO commonGroupCodeDTO);

    CommonGroupCodeDTO toDto(CommonGroupCode commonGroupCode);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CommonGroupCode partialUpdate(CommonGroupCodeDTO commonGroupCodeDTO, @MappingTarget CommonGroupCode commonGroupCode);
}