package com.example.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice7 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("String", 1);
		map.put("data", 2);
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		Iterator<Entry<String, Integer>> itr = entry.iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> entr = itr.next();
			System.out.println(entr.getKey() + "   " + entr.getValue());
		}

		for (Entry<String, Integer> entry1 : map.entrySet()) {
			System.out.println(entry1.getKey() + "   " + entry1.getValue());
		}
	}
}
