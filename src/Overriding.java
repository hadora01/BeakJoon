class Parent{
	public String name;
	public int age;
	public void info() {
		System.out.println("�θ��̸���:"+name+"�̰�, ���̴� : "+age+"�Դϴ�.");
	}
}
class children extends Parent{
	String children_name;
	
	@Override
	public void info() {
		// �θ�Ŭ������ �ִ� �޼ҵ带 ������ �������̵� 
		super.info(); //�ڽ�Ŭ�������� �θ�Ŭ������ �޼ҵ带 ����ϰ��� �Ҷ� super ��� 
		System.out.println("������ �̸��� :"+children_name+"�Դϴ�.");
	}
}

public class Overriding {
	public static void main(String[] args) {
		children child=new children();
		child.name="�θ�Ŭ���� ���� ��밡��";
		child.age=30;
		child.children_name="��ӹ��� child Ŭ���� ������ ��밡��";
		
		child.info(); 
		//�������̵��� ������ �ڽ�Ŭ�������� �޼ҵ带 �������ϱ⶧���� �θ��� �޼ҵ带 ������� ���Ѵٴ� ���̴�.
		//�� ���� �����ϱ����� super��� Ű���带 ����Ѵ�. �� Ű����� �θ� ��Ī�ϴ°��̶� ���� �ȴ�. 
	}
		
}
