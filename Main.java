package org.practice1;

public class Main {
		 Node head;

	public static void main(String[] args) {
		Service list = new Service();
		
//		list.add(56);
//		list.add(30);
//		list.add(70);
		
//		list.push(70);
//		list.push(30);
//		list.push(56);
		
		list.append(70);
		list.append(30);
		list.append(56);
		
		list.printlist();

	}

}
