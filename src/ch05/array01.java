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
	     Arrays.sort(arr); //�迭�� �����  ������ ���� ������������ �������ִ� �޼ҵ� 
	     //�ּڰ��� index0, �ִ��� index�������� ���� 
	     System.out.println(arr[0]+ " "+arr[N-1]);
	     
	    }
}
