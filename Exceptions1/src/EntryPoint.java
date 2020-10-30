
public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1,num2;
		num1 =10;
		num2 =0;
		
		try {
			
			int result= num1/num2;
			System.out.println("the result is " + result);
			System.out.println("hello my friends");
			
		}
		catch(NumberFormatException ref1) {
			System.out.println(" can do the conversion");
		}
		
		catch(ArithmeticException ref2) {
			System.out.println("You are not allowed to divide anything by Zero ");
		}
	}

}
