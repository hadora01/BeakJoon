package ch05;

import java.util.Scanner;

public class array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ют╥б");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int Total = A*B*C;
		String number = Integer.toString(Total);
		char[] arr=new char[10];
		int[] count = new int[10];
		sc.close();
		 
		for(int i=0; i<number.length();i++) {
			arr[i]=number.charAt(i);
		
				int a = Character.getNumericValue(arr[i]);
				count[a]=count[a]+1;	
			
		}
		for(int j=0; j<count.length;j++) {
			System.out.println(count[j]);
		}
	 
		
		
		
		
		
	}

}
