package reflect.demo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/*
 * public Method getMethods() 获取类类型的方法对象Method
 * public Method getDeclaredMethods() 获取类类型的方法对象Method
 * public Class[] getParameterTypes() 获取方法参数的类类型
 * public Field[] getDeclaredFields() 获取成员变量
 * public Constructor[] getDeclaredConstructors() 获取构造函数
 */
public class ClassUtil {
	
	public static void printClassMessage(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getName());
		//getMethods()方法获取的是所有的public的函数，包括从父类继承的方法
		//getDeclaredMethods()获取的是所有该类自己声明的方法，
		Method[] ms = c.getMethods();//c.getDeclaredMethods()
		for(int i = 0;i<ms.length;i++) {
			//得到方法的返回值类型的类类型
			Class returnType = ms[i].getReturnType();
			System.out.print(returnType.getName()+" ");
			//得到方法的名称
			System.out.print(ms[i].getName()+"(");
			//获取参数类型
			Class[] paramTypes = ms[i].getParameterTypes();
			for (Class class1 : paramTypes) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
			
		}
		
		
	}

	public static void printFieldMessage(Object obj) {
		/*
		 * 成员变量也是对象
		 * java.lang.reflect.Field
		 * Field类封装了关于成员变量的操作
		 * getFields() 获取所有public的成员变量的信息
		 * getDeclaredFields() 获取该类自己声明的成员变量的信息，包括private和public
		 */
		Class c = obj.getClass();
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			//得到成员变量的类类型
			Class fieldType = field.getType();
			String typeName = fieldType.getName();
			//得到成员变量的名称
			String fieldName = field.getName();
			System.out.println(typeName+" "+fieldName);
			
		}
	}
	
	/**
	 * 打印对象的构造函数的信息
	 * @param obj
	 */
	public static void printConMessage(Object obj) {
		Class c = obj.getClass();
		Constructor[] con =c.getDeclaredConstructors();
		
	}
}
