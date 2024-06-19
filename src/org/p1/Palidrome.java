package org.p1;

import java.util.Scanner;

public class Palidrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value......");
		String input = scan.next();
			if(isPalidrome(input))
				System.out.println(input+"..is palidrome ");
			else 
				System.out.println(input+" ..is not palidrome ...");
		}

		private static boolean isPalidrome(String input1) {
			String str = new StringBuilder(input1).reverse().toString();
			return input1.equals(str);
		}



	}


