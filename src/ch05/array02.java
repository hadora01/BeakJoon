package ch05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr=new int[9];
		System.out.println("��ȩ�� ���� �Է����ּ���");
		for(int i=0; i<9; i++) {
			arr[i]=sc.nextInt();
		} //�迭�� 9���� �Է� 
	    int max = arr[0]; //���Ƿ� ����
	    int max_number=0;
	    for(int i=1; i<9; i++) {
			if(max<arr[i]) { 
				max = arr[i];
				max_number =i;
			}
		} //�ִ밪 ����� 
	    
	    System.out.println(max);
	    System.out.println(max_number+1);
	}

}
//�迭�� ����� ���߿� �ִ��� ã���� �ȴ�.  Arrays.sort�޼ҵ带 ����ϰ������, ��������� ����ϱ� ���� �����ߴ�. 
//�׷��� �ε��� 0������ �ϳ��ϳ� �񱳸� �Ͽ���. 