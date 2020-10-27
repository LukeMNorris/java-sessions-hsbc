
public class Entrypoint {

	public static void main(String[] args) {

		First ref;
		ref=new First();
		ref.x=90;
		ref.y=89;
		ref.z=ref.x+ref.y;
		System.out.println("the result is "+ ref.z);
				
	}

}
