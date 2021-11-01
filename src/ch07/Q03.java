package ch07;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word=sc.next();
		int arr[]=new int[26];
		
		for(int k=0; k<arr.length; k++) {
			arr[k]=-1; //배열 -1로 모두 초기화 
		}
		for(int i=0; i<word.length(); i++) {
			char ch=word.charAt(i);
			
			if(arr[ch-'a']== -1) {
				arr[ch-'a']=i;
			}
		}
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
		
	}
}
