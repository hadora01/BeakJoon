package ch06;

import java.util.Scanner;

public class fu_1157 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[26]; //���ĺ� ������ŭ  array���� 
		String s= sc.next();
		for (int i = 0; i < s.length(); i++) {
			if(65<=s.charAt(i)&& s.charAt(i)<=99) {
				arr[s.charAt(i)-65]++;
			}
			else {
				arr[s.charAt(i)-97]++;
			}	
		} //���ڿ��� �ϳ��� �߶� �ϳ��� � ���ĺ����� ��ȸ�ϰ� cnt�� ���ϱ� 
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
		} //26���� �ϳ��� ��ȸ�Ͽ� max �� ã�Ƽ� char������ ���� ��� 
		System.out.println(ch);
	}
}
