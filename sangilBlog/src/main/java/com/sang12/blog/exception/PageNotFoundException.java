package com.sang12.blog.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="page not found")
public class PageNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -4785136912743477236L;

}
