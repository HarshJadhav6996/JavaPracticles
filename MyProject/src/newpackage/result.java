package newpackage;

public class result {

	public static void main(String[] args) {
		
		String sname = "Harsh";
		int rno = 100;
		float m1 = 80;
		float m2 = 90;
		float m3 = 70;
		float average;
		
		average = ((m1+m2+m3)/300)*100;
		
		System.out.println(sname);
		System.out.println(rno);
		
		if(average >= 50)
		{
			System.out.println("You have Passed " + average + "%");
		}
		else
		{
			System.out.println("You have not Passed " + average + "%");
		}

	}

}
