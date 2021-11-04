package ch06;

public class SelfNumber {
public static void main(String[] args) {
		boolean check[]=new boolean[10001];
		for (int i = 1; i < check.length; i++) {
			int n=d(i);
			if(n<10001) {
				check[n]=true;
			}
		}
		StringBuilder sb=new StringBuilder();
		for (int i = 1; i < check.length; i++) {
			if (!check[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}



public static int d(int number) {
	int sum=number;
	while(number !=0) {
		sum=sum+number%10;
		number=number/10;
		}
	return sum;
	} //한자리씩 더하기할때 사용할것 
	
}

