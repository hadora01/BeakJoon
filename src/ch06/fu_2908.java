package ch06;

import java.util.Scanner;

public class fu_2908 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b =sc.nextInt();
		a=exchange(a);
		b=exchange(b);
		if (a>b) {
			System.out.print(a);
		} else {
			System.out.println(b);
		}
	}

	public static int exchange(int number) {
		int hun=number/100;
		int ten=(number/10)%10;
		int one=number%10;
		return one*100+ten*10+hun;
	}

}
