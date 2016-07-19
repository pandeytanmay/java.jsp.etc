package training.oops;
import java.lang.reflect.*;
import java.util.Scanner;

public class ClassHelper {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Class name to search in");
		String className = sc.next();
		//sc.close();
		try{
		Class c = Class.forName(className);
		Method[] m = c.getDeclaredMethods();
		for(Method n:m){
			System.out.println(n.toString());
		}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			Class c1 = Class.forName(className);
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Method name to search in above class");
			String methodName = sc.next();
			Method m = c1.getDeclaredMethod(methodName, null);
			System.out.println(m);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		sc.close();
		
	}

}
