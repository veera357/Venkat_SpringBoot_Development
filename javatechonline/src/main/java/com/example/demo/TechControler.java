package com.example.demo;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechControler {
	
	@GetMapping("/v1")
	public void m1(){
		
		System.out.println("welcome to  springboot");
	}
	
	@GetMapping("/v2")
	public String m2()
	{
		return "String method";
	}
	
	@GetMapping("/v3")
	public List<String> method3(){
		
		List list = new ArrayList<String>();
		list.add("manju");
		list.add("manju2");
		list.add("manju3");
		
		
		return list;
		
		
		
	}
	
	//TechController.method1();
}
