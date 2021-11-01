package ch05;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[sc.nextInt()];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.next();
		}//입력완료
		
		String input="x";
		
		for(int i=0; i<arr.length; i++) { 
				int count=0;
				int total=0;
			for(int k=0;k<arr[i].length();k++) {
				if(arr[i].charAt(k) == 'O') {
					count++;
				}
				else {
					count=0;
				}
				total=total+count;
			}
			System.out.println(total);
		}
		
		
	}

}
