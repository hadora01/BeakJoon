package ch07;

public class Q01 {
	public static void main(String[] args)throws Exception {
		System.out.println("숫자 입력");
		int a = System.in.read();
		System.out.println(a);
		//scanner 로 해도 되지만 성능을 위해서 byte 단위로 읽는 system.in을 사용 
	}
	
}
