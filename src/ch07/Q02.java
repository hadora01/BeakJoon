package ch07;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 몇개 입력?");
		int n= sc.nextInt();
		String numbers = sc.next();
		sc.close();
		int result =0;
		for(int i=0; i<n; i++) {
			result = result+ numbers.charAt(i)-'0';
		}
		System.out.println(result);
	}

}
