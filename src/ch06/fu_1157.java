package ch06;

import java.util.Scanner;

public class fu_1157 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[26]; //알파벳 개수만큼  array만듬 
		String s= sc.next();
		for (int i = 0; i < s.length(); i++) {
			if(65<=s.charAt(i)&& s.charAt(i)<=99) {
				arr[s.charAt(i)-65]++;
			}
			else {
				arr[s.charAt(i)-97]++;
			}	
		} //문자열을 하나씩 잘라서 하나씩 어떤 알파벳인지 조회하고 cnt를 더하기 
		int max=-1;
		char ch='?';
		for (int i = 0; i < 26; i++) {
			if(arr[i]>max) {
				max=arr[i];
				ch=(char)(i+65);
			}
			else if(arr[i]==max) {
				ch='?';
			}
		} //26개를 하나씩 조회하여 max 를 찾아서 char형으로 만들어서 출력 
		System.out.println(ch);
	}
}
