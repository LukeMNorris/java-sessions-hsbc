package newproject1;

public class Luke2 {

	public static void main(String[] args) {

		First ref;
		ref=new First();
		ref.A=89;
		ref.B=100;
		ref.C= ref.A + ref.B;
		System.out.println("the result is:"+ ref.C);
		
	}

}
