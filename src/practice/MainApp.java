package practice;

public class MainApp {
	
	static Basic objBasic = new Basic();
	public static void main(String[] args) {
		
//		boolean [][] twoDimensionalArray = {{true, false,false},{true,true,true}};
//		objBasic.conditionalChecker(twoDimensionalArray);
		
//		objBasic.checkNumbers(0,1);
		
		objBasic.arrangeArrayRecursion(new int[] {3, 6, 12, 1, 5, 8},0,1);
	}

}
