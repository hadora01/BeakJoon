package ch07;

import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		
		for(int i=0; i<T; i++) {
			int num=sc.nextInt();
			String s=sc.next();
			for(int k=0; k<s.length(); k++) {
				for(int j=0; j<num; j++) {
					System.out.print(s.charAt(k));
				}
			}
			System.out.println();
		}
		
		
	}

}
