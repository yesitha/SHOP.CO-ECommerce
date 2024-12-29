package com.shopco.util;

public interface SingleResponseDtoBuilder<SingleResult, SingleResponse> {
	SingleResponse buildCreateResponseDto(SingleResult singleResult);	
}