class OverloadingTest{
	void cat() {
		System.out.println("�Ű����� ����");
	}
	void cat(int a, int b) {
		System.out.println("�Ű����� :"+a+","+b+"�ΰ� ����");
	}
	void cat(String c) {
		System.out.println("�Ű����� :"+c+"�� String���̴�. ");
	}
}


public class Overloading {
	public static void main(String[] args) {
		OverloadingTest ot=new OverloadingTest();
		
		ot.cat();
		ot.cat(1,4);
		ot.cat("�����ε�����");
	}
	

}
