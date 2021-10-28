package ch05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr=new int[9];
		System.out.println("아홉개 수를 입력해주세요");
		for(int i=0; i<9; i++) {
			arr[i]=sc.nextInt();
		} //배열에 9개수 입력 
	    int max = arr[0]; //임의로 저장
	    int max_number=0;
	    for(int i=1; i<9; i++) {
			if(max<arr[i]) { 
				max = arr[i];
				max_number =i;
			}
		} //최대값 저장됨 
	    
	    System.out.println(max);
	    System.out.println(max_number+1);
	}

}
//배열의 저장된 값중에 최댓값을 찾으면 된다.  Arrays.sort메소드를 사용하고싶으나, 몇번쨰인지 출력하기 위해 사용안했다. 
//그래서 인덱스 0번부터 하나하나 비교를 하였다. 