package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class array05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double arr[]=new double[sc.nextInt()];
		for(int i=0;i<arr.length; i++) {
			arr[i]=sc.nextDouble();
		}
		Arrays.sort(arr);
		double sum=0;
		for(int k=0; k<arr.length-1; k++) {
			sum=sum+((arr[k]/arr[arr.length-1])*100);
		}
		sum+=arr[arr.length-1];
		System.out.println(sum/arr.length);
	
	
	
	}

}
