package com.cg;

public class LinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(INode<K> newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(INode<K> newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void addMiddle(INode<K> newNode) {
		int size = sizeOfLinkedList();
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			int count = 0;
			INode<K> tempNode = head;
			while(count < (size+1)/2 - 1) {
				tempNode = tempNode.getNext();
				count++;
			}
			newNode.setNext(tempNode.getNext());
			tempNode.setNext(newNode);
		}
	}
	
	public void popFirst() {
		head = head.getNext();
	}
	
	public void popLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		else {
			if(head != tail) {
				INode<K> current = head;
				while(current.getNext() != tail) {
					current = current.getNext();
				}
				tail = current;
				tail.setNext(null);
			}
			else {
				head = tail = null;
			}
		}
	}
	
	//public void popValue(K key) {
		//INode<K> index = searchValue(key);
		//int count = 0;
		//INode current = head;
		//while(count < index - 1) {
			//current = current.getNext();
			//count++;
		//}
		//current.setNext(current.getNext().getNext());
	//}
	
	public INode<K> searchValue(K key) {
		INode<K> tempNode = head;
		while(tempNode != null && tempNode.getNext() != null) {
			if(tempNode.getKey() == key) {
				System.out.println("Element found!");
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	public int sizeOfLinkedList() {
		INode<K> tempNode = head;
		int size = 0;
		while(tempNode != null) {
			size++;
			tempNode = tempNode.getNext();
		}
		return size;
	}
	
	public void sortList() {
		INode<K> prev = head,  current = null;
		K temp;
		if(head == null)	return;
		else {
			while(prev != null) {
				current = prev.getNext();
				while(current != null) {
					if((int)prev.getKey() > (int)current.getKey()) {
						temp = (K) prev.getKey();
						prev.setKey(current.getKey());
						current.setKey(temp);
					}
					current = current.getNext();
				}
				prev = prev.getNext();
			}
		}
	}
	
	public void printLinkedList() {
		INode<K> tempNode = head;
		while(tempNode != null) {
			System.out.print(tempNode.getKey() + " -> ");
			tempNode = tempNode.getNext(); 
		}
		System.out.println();
	}
}

