package com.cg;

public class MapNode<K, V> implements INode<K> {
	private K key;
	private V value;
	MapNode<K, V> next;
	
	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public INode<K> getNext() {
		return next;
	}
	
	public void setNext(INode<K> next) {
		this.next = (MapNode<K, V>)next;
	}
	
}
