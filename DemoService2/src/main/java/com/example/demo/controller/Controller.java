package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	public static void main(String[] args) {
//			
//		List<String> list = new ArrayList<>();
//		list.add("data");
//		list.stream().forEach(i -> {
//			System.out.println(i);
//		});
//
//		list.forEach(i->System.out.println(i));
//		String data =list.iterator().next();
//		System.out.println(data);
//
//		Set<String> data1 = new HashSet<>();
//		data1.add("aaaa");
//		data1.forEach(i -> System.out.println(i));
//		List<String> list1 = data1.stream().filter(i -> i.equals("aaaa")).collect(Collectors.toList());
//		list.forEach(System.out::println);
//		
//		String data2= data1.stream().filter(i->i.equals("aaaa")).findAny().orElse(null);
//		System.out.println(data2+"pppp");
		
		Map<String,Integer> map = new HashMap<>();
		map.put("data", 1);
		map.put("dataaee", 212);
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		set.forEach(i->{
			System.out.println(i.getKey()+i.getValue());
			});
		
		

	}

	@RequestMapping("/data")
	public String msg() {
		return "data return from DemoService2";
	}
}
