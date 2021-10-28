package ch05;


import java.util.Arrays;
import java.util.Scanner;


public class array01 {
	    public static void main(String[] args) {
	    	
	     Scanner sc = new Scanner(System.in);
	     int N = sc.nextInt();
	     int [] arr = new int[N];
	     
	     for(int i=0; i<N; i++) {
	    	 arr[i] = sc.nextInt();
	     }
	     sc.close();
	     Arrays.sort(arr); //배열에 저장된  원소의 값을 오름차순으로 정렬해주는 메소드 
	     //최솟값은 index0, 최댓값은 index마지막에 저장 
	     System.out.println(arr[0]+ " "+arr[N-1]);
	     
	    }
}
