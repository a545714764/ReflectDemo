package reflect.demo4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
 * ���÷�������ƹ����͵�����
 * public Method getMethod(String MethodName,class c1,class c2)
 * Method.invoke(Object o,...)
 */
public class MethodDemo1 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		A a1 = new A();
		Class c = a1.getClass();
//		c.getMethod("print", new Class[] {int.class,int.class});
		Method m =c.getMethod("print", int.class,int.class);
		//�����ķ������
		//��Method���������е���
		Object o =m.invoke(a1,10,20);
	}
}
class A{
	public void print(int a,int b) {
		System.out.println(a+b);
	}
	public void print(String a,String b) {
		System.out.println(a.toUpperCase()+","+b.toLowerCase());
	}
}