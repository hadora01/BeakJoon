package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class minmax {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("n���Է�");
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
		//scanner, bufferredReader���� 
		//scanner�� ������ ����ȯ�� �ʿ������, �����ɸ� 
		//�Ѵ� array�� �����Ͽ�, Arrays.sort(arr)�� �޼ҵ带 ����ϸ� �������� ���İ��� 
	}
}
