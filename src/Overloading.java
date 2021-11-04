class OverloadingTest{
	void cat() {
		System.out.println("매개변수 없음");
	}
	void cat(int a, int b) {
		System.out.println("매개변수 :"+a+","+b+"두개 있음");
	}
	void cat(String c) {
		System.out.println("매개변수 :"+c+"가 String형이다. ");
	}
}


public class Overloading {
	public static void main(String[] args) {
		OverloadingTest ot=new OverloadingTest();
		
		ot.cat();
		ot.cat(1,4);
		ot.cat("오버로딩예제");
	}
	

}
