package com.rmuti.priorityqueue;

import java.util.Scanner;


public class Show {
	public static class ClassTest {

		private static Scanner sc;

		public static void main(String[] args) {
				BinaryHeap bh = new BinaryHeap();
				sc = new Scanner(System.in);
				while (true) {
					System.out.print("Your input : ");
					Object a = sc.nextLine();
					if(a.equals("-")){
						bh.deQueue();
					}else{
						bh.enQueue(Integer.parseInt((String) a));
					}
					System.out.println(bh);

				}			
		}
	}
}