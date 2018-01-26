package reflect.demo1;

public class ReflectDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Foo foo1 = new Foo();
		//Foo�����࣬Ҳ��һ��ʵ��������Class���ʵ������
		//�κ�һ���඼��Class��ʵ���������ʵ�����������ֱ�ʾ����
		Class c1 = Foo.class;
		Class c2 = foo1.getClass();
		Class c3 = Class.forName("reflect.Foo");
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		
		//���ǿ���ͨ��c1\c2\c3����Foo�Ķ���;������Ҫ�� �޲��� �Ĺ��췽��
		
		Foo foo = (Foo) c1.newInstance();
		foo.print();
	}
}
	
class Foo{
	void print() {
		System.out.println("foo");
	}
}