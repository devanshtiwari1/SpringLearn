package com.devansh.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //tells spring framework it can create a it can create bean of this type
public class HelloController {

	@RequestMapping("/hello")
	public String hello()
	{
		return "hello";
	}
}
