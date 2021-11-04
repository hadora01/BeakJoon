class Parent{
	public String name;
	public int age;
	public void info() {
		System.out.println("부모이름은:"+name+"이고, 나이는 : "+age+"입니다.");
	}
}
class children extends Parent{
	String children_name;
	
	@Override
	public void info() {
		// 부모클래스에 있는 메소드를 재정의 오버라이드 
		super.info(); //자식클래스에서 부모클래스의 메소드를 사용하고자 할때 super 사용 
		System.out.println("아이의 이름은 :"+children_name+"입니다.");
	}
}

public class Overriding {
	public static void main(String[] args) {
		children child=new children();
		child.name="부모클래스 변수 사용가능";
		child.age=30;
		child.children_name="상속받은 child 클래스 변수도 사용가능";
		
		child.info(); 
		//오버라이드의 단점은 자식클래스에서 메소드를 재정의하기때문에 부모의 메소드를 사용하지 못한다는 점이다.
		//이 점을 보완하기위해 super라는 키워드를 사용한다. 이 키워드는 부모를 지칭하는것이라 봐도 된다. 
	}
		
}
