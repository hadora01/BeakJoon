package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class minmax {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("n을입력");
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int index = 0;
		int [] arr = new int[n];
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[n-1]);
		//scanner, bufferredReader인지 
		//scanner로 받으면 형변환은 필요없으나, 오래걸림 
		//둘다 array로 저장하여, Arrays.sort(arr)이 메소드를 사용하면 오름차순 정렬가능 
	}
}
