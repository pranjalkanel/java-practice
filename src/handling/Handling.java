package handling;

import java.util.HashMap;
import java.util.Map;

public class Handling {
	
	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException  e) {
			System.out.println("Calculation is incorrect");
		}catch(Exception e){
			// catching generic expection
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
		}finally {
			/**this block executes regardless of the error in try and catch
			 * only use finally with a try catch block
			 */
			System.out.println("hi, you can see this message anyways");
			
		}
		
		// declaring string literals greeting and anotherGreeting
		String greeting = "hi";
		String anotherGreeting = "hi";
		// declaring string object
		String greeting1 = new String("hi");
		
		System.out.println(greeting.equals(greeting1));
		
		if (greeting == greeting1) {
			System.out.println("Both point to the same location");
		}else {
			System.out.println("Both do not point to the same location");
		}
	
		if(greeting == anotherGreeting) {
			System.out.println("Greeting and anotherGreeting are pointing to the same location");
		}
		
		Integer ex = 1;
		@SuppressWarnings("removal")
		Integer px = new Integer(1);
		
		if(ex == px) {
			System.out.println("integers are equal using operator");
		}
		if(px.equals(ex)) {
			System.out.println("integers are equal using method");
		}
		
		/* == used to compare the pointer at memory
		 * where as .equals() compares the value of the object
		 * object and primitive will not return true if compared using == operator
		 * */
		
		//Character bc = Character.valueOf('n');
		
		Map<Integer,Integer> eg = new HashMap<Integer,Integer>();
		eg.put(3, 0);
		
		System.out.println(eg.get(3)); // returns null if value does not exist
	}
}
