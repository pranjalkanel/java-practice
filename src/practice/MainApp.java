package practice;

public class MainApp {
	
	static DataStructure objDS = new DataStructure();
	static Basic objBasic = new Basic();
	public static void main(String[] args) {
		
//		boolean [][] twoDimensionalArray = {{true, false,false},{true,true,true}};
//		objBasic.conditionalChecker(twoDimensionalArray);
		
//		objBasic.checkNumbers(0,1);
		
		objBasic.changeRows(new int[][] {{1,2,3},{4,5,6}});
	}

}
