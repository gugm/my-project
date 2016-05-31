package com.project.module.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author tanimitsuaki
 *测试
 */
@Controller
public class DemoAction {
	@RequestMapping(value = "/index")
	public String getPage(HttpServletRequest request) {
		System.out.println("11111111111111111111111111111");
		return "/jsp/a";
	}
}
