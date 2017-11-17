package com.sogou.imeda.betty;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>();

		tree.put(5, "bbb");
		tree.put(3, "ddd");
		tree.put(10, "ccc");
		tree.put(1, "aaa");
		tree.put(2, "eee");
		System.out.println("firstKey:" + tree.firstKey());
		// for (Entry<Integer, String> entry : tree.entrySet()) {
		// System.out.println(entry.getKey() + ":" + entry.getValue());
		// }

		System.out.println("===================================");
		// System.out.println(tree.firstKey());
		// System.out.println(tree.lastEntry());
		// System.out.println(tree.navigableKeySet());
		// System.out.println(tree.descendingKeySet());

		Integer tmp = tree.firstKey();
		System.out.println("REMOVE:" + tmp + "," + tree.get(tmp));
		tree.remove(tmp);
		tree.put(4, "ggg");
		for (Entry<Integer, String> entry : tree.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		tree.put(5, "fff");

		System.out.println("===================================");

		tmp = tree.firstKey();
		System.out.println("REMOVE:" + tmp + "," + tree.get(tmp));
		tree.remove(tree.firstKey());

		tree.put(12, "hhh");
		for (Entry<Integer, String> entry : tree.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
