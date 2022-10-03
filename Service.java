package org.practice1;

public class Service {
		Node head;
		
		public void add(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				return;
			}
			Node currNode = head;
			  while (currNode.next != null) {
				  currNode = currNode.next;
				  
			  } currNode.next = newNode;
		}
		
		public void addFirst(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				return;
			} newNode.next = head;
			  head = newNode;
		}
		public void push (int data) {
			Node node = new Node(data);
			node.next = head;
			head = node;
		}
		public void append (int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				return;
			}
			Node currNode = head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}   currNode.next = newNode;
		}
		
		public void insert(int before, int data) {
			Node currNode = head;
			Node newNode = new Node(data);
			
			while (currNode.data != before) {
				currNode = currNode.next;
				currNode.next = currNode.next;
				currNode.next = newNode;
				System.out.println("value" + data + "After" + before);
			}
		}
		
		public void delete() {
			if (head == null) {
				System.out.println("Empty");
				return;
			} System.out.println("Delete first data :" + head.data);
			head = head.next;
		}
		
		public void printlist() {
			Node currNode = head;
			while (currNode != null) {
				System.out.println(currNode.data);
				currNode = currNode.next;
			}	
			System.out.println("Null");
		}
}
