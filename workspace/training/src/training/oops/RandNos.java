/**
 * 
 */
package training.oops;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * @author PandeyTK
 *
 */
public class RandNos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee or Visitor?");
		String mode = sc.next();
		System.out.println("How many random numbers?");
		int nOfRands = sc.nextInt();
		for(int i =0; i< nOfRands; i++){
			int randInt = r.nextInt(100000);
			System.out.println(randInt);
		
		}
		sc.close();
	}

}
