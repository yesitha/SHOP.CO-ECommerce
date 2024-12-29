package com.shopco.util;

import java.util.UUID;

public interface UpdateRequestDtoBuilder<UpdateRequest, UpdateRequestDto> {
	Object buildUpdateDto(UpdateRequest request, UUID id);
}
