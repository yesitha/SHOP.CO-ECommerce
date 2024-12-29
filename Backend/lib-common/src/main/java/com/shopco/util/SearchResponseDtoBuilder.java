package com.shopco.util;

public interface SearchResponseDtoBuilder<SearchResult, SearchResponse> {
	SearchResponse buildResponseDto(SearchResult searchResult);
}
