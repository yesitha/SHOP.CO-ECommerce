package com.shopco.util;

import com.shopco.exception.ApplicationException;
import com.shopco.exception.NullNotAllowedException;
import com.shopco.exception.ValueNotExistException;

import java.util.UUID;

public interface Updatable<AppRequest, AppResponse> {	
	public AppResponse update(AppRequest req, UUID id) throws ApplicationException, NullNotAllowedException, ValueNotExistException;
}
