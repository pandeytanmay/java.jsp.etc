/**
 * 
 */
package training.oops;

/**
 * @author PandeyTK
 *
 */
class Top{
	int x;
	Top(){
		this.x=10;
	}
	void testMethod(){
		System.out.println("Top");
	} 
	static void staticMethod(){
		System.out.println("Top static");
	} 
}
class Middle extends Top {
	int x;
	Middle(){
		this.x=15;
	}
	void testMethod(){
		System.out.println("Middle");
	} 
	static void staticMethod(){
		System.out.println("Middle static");
	} 
}
public class Casting extends Middle {

	/**
	 * @param args
	 */
	int x;
	Casting(){
		x=100;
	}
	void testMethod(){
		System.out.println("Casting");
	}
	static void staticMethod(){
		System.out.println("Casting static");
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casting c = new Casting();
		//Casting for normal methods
		c.testMethod();
		((Middle)c).testMethod();
		((Top)((Middle)c)).testMethod();
		//casting for static methods
		c.staticMethod();
		((Middle)c).staticMethod();
		((Top)((Middle)c)).staticMethod();
		//casting for member variables
		System.out.println(c.x);
		System.out.println(((Middle)c).x);
		System.out.println(((Top)((Middle)c)).x);
				
	}

}
