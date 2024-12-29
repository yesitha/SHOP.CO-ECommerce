package com.shopco.util;

import com.shopco.exception.ApplicationException;

public interface Deletable {	
	public void delete(Long id) throws ApplicationException;
}
