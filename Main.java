package org.practice1;

import Linecomparion.point;

public class Main {
		 Node head;

	public static void main(String[] args) {
		Service list = new Service();
		
		list.add(56);
		list.add(30);
		list.add(70);
		list.printlist();
		
		list.deleteNode(40); 
		list.size();
		
	}

}
