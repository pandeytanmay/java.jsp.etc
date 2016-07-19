/**
 * 
 */
package training.oops;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author PandeyTK
 *
 */
class TopLevel{
	int x;
	TopLevel(){
		this.x=10;
	}
	void testMethod(){
		System.out.println("Top");
	} 
	static void staticMethod(){
		System.out.println("Top static");
	} 
}
class MiddleLevel extends TopLevel {
	int x;
	MiddleLevel(){
		this.x=15;
	}
	void testMethod(){
		System.out.println("Middle");
	} 
	static void staticMethod(){
		System.out.println("Middle static");
	} 
}
public class ExcepHand {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//
		int ind =0;
		int[] iarr = new int[]{6,4,7,4545,23,4534};
		try {
			//filenotfoundDemo
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter file name to read from:");
			String fileName = sc.next();
			Scanner scFi = new Scanner(new FileReader(fileName));
			String s = scFi.nextLine();
			System.out.println(s);
						
			
			//indexOutOfBounds
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Enter array index to display:");
			ind = sc1.nextInt();
			System.out.println(iarr[ind]);
			
			//casting
			TopLevel t = new TopLevel();
			((MiddleLevel)t).testMethod();
			scFi.close();
			sc.close();
			sc1.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		 catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			
				System.out.println("NegativeIndexException:");
		}
		catch (ClassCastException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

}
