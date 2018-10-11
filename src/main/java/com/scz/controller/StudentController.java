/**
 * 
 */
package com.scz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ecom_wm
 *
 */
@Controller
public class StudentController {
     
	
	@RequestMapping("list")
	public String list()
	{
		return "list";
	}
}
