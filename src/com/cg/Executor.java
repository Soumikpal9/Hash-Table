package com.cg;

public class Executor {
	public static void main(String[] args) {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = linkedHashMap.get(word);
			if(value == null)	value = 1;
			else 	value++;
			linkedHashMap.add(word, value);
		}
		MapNode<String, Integer> myNode = (MapNode<String, Integer>)linkedHashMap.remove("avoidable");
		System.out.println(linkedHashMap);
		if(myNode.getNext().getKey() == null) {
			System.out.println("Assertion True");
		}
		else {
			System.out.println("Assertion False");
		}
	}
} 
