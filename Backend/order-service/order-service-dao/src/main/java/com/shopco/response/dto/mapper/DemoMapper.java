package com.shopco.response.dto.mapper;

import com.shopco.entity.Demo;

import com.shopco.enums.DemoType;
import com.shopco.response.dto.DemoResponseDto3;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DemoMapper {
    DemoMapper INSTANCE = Mappers.getMapper(DemoMapper.class);

//    @Mapping(source = "contentId", target = "id")
//    @Mapping(source = "materialType", target = "materialType")
//    @Mapping(source = "createdBy", target = "createdByUserId")
//    @Mapping(source = "lastModifiedBy", target = "lastModifiedByUserId")
    DemoResponseDto3 toDto(Demo demo);

    List<DemoResponseDto3> toDtoList(List<Demo> demos);

    default DemoResponseDto3 materialTypeToMaterialTypeResponseDto(DemoType demoType) {
//        return DemoResponseDto.builder().demoType(demoType).build();
        return null;
    }
}
