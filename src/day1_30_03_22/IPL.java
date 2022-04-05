package day1_30_03_22;
import java.util.Scanner;

class Show
{
	String name = "Dhruv";
	String team = "RCB";
	
	void show()
	{
		System.out.println("Name: " + name + "	Team: " + team);
	}
}

public class IPL {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Show show = new Show();
//		String[] team = new String[10];
		int wickets;
		int score;
		
		System.out.print("Enter the wickets : ");
		wickets = sc.nextInt();
		
		System.out.print("Enter the score: ");
		score = sc.nextInt();
		
		if(wickets == 3 && score >= 50)
		{
			System.out.println("Man of the match");
			show.show();
		}
		
		sc.close();
		
	}

}
