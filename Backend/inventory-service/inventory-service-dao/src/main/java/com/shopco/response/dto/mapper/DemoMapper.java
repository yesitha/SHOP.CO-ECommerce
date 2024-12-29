package com.shopco.response.dto.mapper;

import com.shopco.entity.Demo;
import com.shopco.entity.Material;
import com.shopco.entity.MaterialType;
import com.shopco.enums.DemoType;
import com.shopco.response.dto.DemoResponseDto;
import com.shopco.response.dto.MaterialResponseDto;
import com.shopco.response.dto.MaterialTypeResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DemoMapper {
    DemoMapper INSTANCE = Mappers.getMapper(DemoMapper.class);

    @Mapping(source = "contentId", target = "id")
    @Mapping(source = "materialType", target = "materialType")
    @Mapping(source = "createdBy", target = "createdByUserId")
    @Mapping(source = "lastModifiedBy", target = "lastModifiedByUserId")
    DemoResponseDto toDto(Demo demo);

    List<DemoResponseDto> toDtoList(List<Demo> demos);

    default DemoResponseDto materialTypeToMaterialTypeResponseDto(DemoType demoType) {
//        return DemoResponseDto.builder().demoType(demoType).build();
        return null;
    }
}
