package reflect.demo1;

public class ReflectDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Foo foo1 = new Foo();
		//Foo既是类，也是一个实例对象，是Class类的实例对象
		//任何一个类都是Class的实例对象，这个实例对象有三种表示方法
		Class c1 = Foo.class;
		Class c2 = foo1.getClass();
		Class c3 = Class.forName("reflect.Foo");
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		
		//我们可以通过c1\c2\c3创建Foo的对象;但是需要有 无参数 的构造方法
		
		Foo foo = (Foo) c1.newInstance();
		foo.print();
	}
}
	
class Foo{
	void print() {
		System.out.println("foo");
	}
}