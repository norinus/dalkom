package com.lab.core.service.mapper;

import com.lab.core.domain.CommonCode;
import com.lab.core.service.dto.CommonCodeDTO;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CommonCodeMapper {
    CommonCode toEntity(CommonCodeDTO commonCodeDTO);

    CommonCodeDTO toDto(CommonCode commonCode);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CommonCode partialUpdate(CommonCodeDTO commonCodeDTO, @MappingTarget CommonCode commonCode);
}