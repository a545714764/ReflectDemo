package reflect.demo2;

public class OfficeBetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c = Class.forName(args[0]);
			OfficeAble oa = (OfficeAble) c.newInstance();
			oa.start();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
