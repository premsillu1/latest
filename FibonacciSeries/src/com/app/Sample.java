package com.app;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {
	static String[] arr = {"at","","","","ball","","","car","",""};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word whose location you want");
		String word = sc.nextLine();
//		showLocation(word);
		System.out.println(Arrays.asList(arr).contains(word));
	}

//public static void showLocation(String s){
//	for (int i = 0 ; i< arr.length;i++) {
//		if (arr[i].equals(s))
//			System.out.println("the position is "+i);
//	}
//}

}
