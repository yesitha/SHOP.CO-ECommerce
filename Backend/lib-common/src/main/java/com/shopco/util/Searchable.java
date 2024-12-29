package com.shopco.util;

//import org.springframework.data.domain.PageImpl;

import com.shopco.exception.ApplicationException;
import com.shopco.exception.NullNotAllowedException;
import com.shopco.exception.ValueNotExistException;

public interface Searchable<AppRequest, AppResponse> {
	
	default  AppResponse search(AppRequest req) throws ApplicationException, NullNotAllowedException, ValueNotExistException {
		return null;
	}
	
	default AppResponse search() throws ApplicationException, NullNotAllowedException, ValueNotExistException {
		return null;
	}
	
	default AppResponse search(AppRequest req, Integer pageNumber, Integer pageSize) throws ApplicationException, NullNotAllowedException, ValueNotExistException {
		return null;
	}
//	default PageImpl<AppResponse> searchWithPagination(AppRequest req, int page, int size) throws ApplicationException, NullNotAllowedException, ValueNotExistException {
//		return null;
//	}

}
