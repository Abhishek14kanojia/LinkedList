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
//		public void append (int data) { 
//			Node newNode = new Node(data);
//			if (head == null) {
//				head = newNode;
//				return;
//			}
//			Node currNode = head;
//			while (currNode.next != null) {
//				currNode = currNode.next;
//			}   currNode.next = newNode;
//		}
//		
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
		
		public void deleteFirst() {
			if (head == null) {
				System.out.println("Empty");
				return;
			} System.out.println("Delete first data :" + head.data);
			head = head.next;
		}
		
		public void deleteLast() {
			if (head == null) {
				System.out.println("Empty");
				return;
				
			} 
			if (head.next == null) {
				head = null;
				return;
				
			}
			Node secondLast = head;
			Node lastNode = head.next;
			while (lastNode.next != null ) {
				lastNode = lastNode.next;
				secondLast = secondLast.next;
			}
			System.out.println("last node : " + lastNode.data);
			secondLast.next = null;
		}
		public Node findNode(int data) {
			Node currNode = head;
			while (currNode != null) {
				if (currNode.data == data) {
					System.out.println(data);
					return currNode;
				}
				currNode = currNode.next;
				
			} System.out.println(data);
			return null;
		}
		 public void deleteNode(int data) {
		        Node currNode = head;
		        Node prevNode = head;

		        while (currNode != null) {
		            if (currNode.data == data) {
		                prevNode.next = currNode.next;
		                return;
		            }
		            prevNode = currNode;
		            currNode = currNode.next;
		        }
		        System.out.println(" Unable value " + data);
		    }
		 public void size() {
		        Node currNode = head;
		        int count = 0;

		        while(currNode != null) {
		            count++;
		            currNode = currNode.next;
		        }

		        System.out.println("The size is : "+ count);
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
