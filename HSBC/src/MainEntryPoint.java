
public class MainEntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accounts salesdepartment=new Accounts();
		Accounts ITdepartment=new Accounts();
		
		try {
			salesdepartment.SalarySlip("Shafeeq", 1000, 15);
			
		}
		catch(AbsentiesException E) {
			System.out.println("please send me the report");
			
		}
		
		
		try {
			ITdepartment.SalarySlip("Ali",5000,12);
			
		}
		catch(AbsentiesException E) {
			System.out.println("no its fineeee");
		}
	}

}
