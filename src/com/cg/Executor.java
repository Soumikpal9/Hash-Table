package com.cg;

public class Executor {
	public static void main(String[] args) {
		String sentence = "To be or not to be";
		HashMap<String, Integer> hashMap = new HashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = hashMap.get(word);
			if(value == null)	value = 1;
			else 	value++;
			hashMap.add(word, value);
		}
		Integer frequency = hashMap.get("to");
		System.out.println(frequency);
		System.out.println(hashMap);
	}
}
