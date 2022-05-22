package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Myclass1 {
	
	
	
		
		@GetMapping("/a1")
		public void m1(){
			
			System.out.println("welcome to  springboot");
		}
		
		@GetMapping("/a2")
		public String m2()
		{
			return "String method";
		}
		
		@GetMapping("/a3")
		public List<String> method3(){
			
			List list = new ArrayList<String>();
			list.add("venki");
			list.add("venki");
			list.add("venki");
			list.add("venki");
			
			
			return list;
			
			
			
		}
		@GetMapping("/a4")
		public String m4()
		{
			return "String method";
		}

}
