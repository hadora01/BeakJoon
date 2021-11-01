package ch05;

import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double arr[]=new double[sc.nextInt()]; //test 개수만큼 만들어짐
		double sum=0;
		for(int i=0; i<arr.length; i++) {
			//이중배열로 값 넣기 
			sum=0;
			double s_arr[]=new double[sc.nextInt()];
			for(int k=0; k<s_arr.length; k++) {
				s_arr[k]=sc.nextDouble();
				sum=sum+s_arr[k];
			}//입력하고, sum까지 
			System.out.println(sum/s_arr.length);
		}
		
	}
}
