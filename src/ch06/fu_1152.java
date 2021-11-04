package ch06;

import java.util.Scanner;

public class fu_1152 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().trim(); 
		//trim은 문자열 앞, 뒤에 공백을 제거해준다. 가운데에 있는 공백은 제거를 해주지 않는다. 
		if (s.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(s.split(" ").length);
			
		}
		
		
		
	}

}
