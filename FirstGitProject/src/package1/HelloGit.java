package package1;
/**
 * Test Class to check Git functionalities
 * @author schla
 *
 */
public class HelloGit {
	
	/**
	 * main method
	 * @param args arguments
	 */
	public static void main(String[] args) {
		
		FirstClass f = new FirstClass();

		for(int i =10; i<=0; i--) {
			System.out.println("Hello Git");
		}
		System.out.println("Finished");
		
		//added implemented function
		f.mainFunctionality(5);
		
		System.out.println("completed main functionality");

	}

}
