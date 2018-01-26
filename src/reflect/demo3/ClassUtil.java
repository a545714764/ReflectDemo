package reflect.demo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/*
 * public Method getMethods() ��ȡ�����͵ķ�������Method
 * public Method getDeclaredMethods() ��ȡ�����͵ķ�������Method
 * public Class[] getParameterTypes() ��ȡ����������������
 * public Field[] getDeclaredFields() ��ȡ��Ա����
 * public Constructor[] getDeclaredConstructors() ��ȡ���캯��
 */
public class ClassUtil {
	
	public static void printClassMessage(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getName());
		//getMethods()������ȡ�������е�public�ĺ����������Ӹ���̳еķ���
		//getDeclaredMethods()��ȡ�������и����Լ������ķ�����
		Method[] ms = c.getMethods();//c.getDeclaredMethods()
		for(int i = 0;i<ms.length;i++) {
			//�õ������ķ���ֵ���͵�������
			Class returnType = ms[i].getReturnType();
			System.out.print(returnType.getName()+" ");
			//�õ�����������
			System.out.print(ms[i].getName()+"(");
			//��ȡ��������
			Class[] paramTypes = ms[i].getParameterTypes();
			for (Class class1 : paramTypes) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
			
		}
		
		
	}

	public static void printFieldMessage(Object obj) {
		/*
		 * ��Ա����Ҳ�Ƕ���
		 * java.lang.reflect.Field
		 * Field���װ�˹��ڳ�Ա�����Ĳ���
		 * getFields() ��ȡ����public�ĳ�Ա��������Ϣ
		 * getDeclaredFields() ��ȡ�����Լ������ĳ�Ա��������Ϣ������private��public
		 */
		Class c = obj.getClass();
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			//�õ���Ա������������
			Class fieldType = field.getType();
			String typeName = fieldType.getName();
			//�õ���Ա����������
			String fieldName = field.getName();
			System.out.println(typeName+" "+fieldName);
			
		}
	}
	
	/**
	 * ��ӡ����Ĺ��캯������Ϣ
	 * @param obj
	 */
	public static void printConMessage(Object obj) {
		Class c = obj.getClass();
		Constructor[] con =c.getDeclaredConstructors();
		
	}
}
