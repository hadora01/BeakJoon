package ch05;

import java.util.Scanner;

public class array04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		for(int i =0; i<10; i++) {
			arr[i] = (sc.nextInt()%42); //나머지가 배열에 저장됌 
		}
		int [] remain = new int[42];
		for(int k =0; k<10; k++) {
			//System.out.println(arr[k]);
			remain[arr[k]]=remain[arr[k]]+1;
			
		}
		int count =0;
		for(int j=0; j<42; j++) {
			//System.out.println(j+":"+remain[j]);
			if(remain[j]!=0) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
		
		
	}

}
