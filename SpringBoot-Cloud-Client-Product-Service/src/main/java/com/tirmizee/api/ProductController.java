package com.tirmizee.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping(path = "/hello")
	public String hello(HttpServletRequest request) throws InterruptedException {
//		Thread.sleep(1500);
		return "hello product service port : " + request.getLocalPort();
	}

}
