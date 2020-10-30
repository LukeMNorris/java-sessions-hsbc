
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1,num2;
		float result;
		
		num1="56";
		num2="0";
		
		try {
			result= Integer.parseInt(num1)/Integer.parseInt(num2);
			System.out.println("result is" + result);
		}
		
		catch(NumberFormatException ref1) {
			System.out.println(" only digits can be used in operations");
			
		}
		catch(ArithmeticException ref2) {
			System.out.println("Cant divide anything by zero");
		}
		catch(Exception ref) {
			System.out.println("something went wrong");
		}
	}

}
