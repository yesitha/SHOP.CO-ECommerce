package com.shopco.util;

import com.shopco.exception.ApplicationException;
import com.shopco.exception.NullNotAllowedException;
import com.shopco.exception.ValueNotExistException;

public interface Creatable<AppRequest, AppResponse> {	
	public AppResponse create(AppRequest req) throws ApplicationException, NullNotAllowedException, ValueNotExistException;
}
