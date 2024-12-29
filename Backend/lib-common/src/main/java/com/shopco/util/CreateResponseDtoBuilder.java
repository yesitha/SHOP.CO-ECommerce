package com.shopco.util;

public interface CreateResponseDtoBuilder<Entity, CreateResponseDto> extends ResponseDtoBuilder {
	CreateResponseDto buildCreateResponseDto(Entity entity);
}
