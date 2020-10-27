package newproject1;

public class results {

	public static void main(String[] args) {



		int physics, chemistry, maths, total;
		float percentage;
		physics=90;
		chemistry=42;
		maths=91;
		total=physics+chemistry+maths;
		percentage=(float)total*100/300;
		System.out.println("Total marks: " + total);
		System.out.println("Total marks: " +percentage);
		
		if(percentage>=90) {
			System.out.println("Grade A");
		}
		else {
			if (percentage>=80) {
				System.out.println("grade b");
			}
			else {
				if (percentage>=70) {
					System.out.println("grade c");
				}
				else {
					System.out.println("fail");
				}
			}
		}
		
	}

}


