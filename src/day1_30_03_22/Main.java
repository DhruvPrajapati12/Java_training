package day1_30_03_22;

//import java.util;

class IPLTeam {
	
	String name;
	
	void setName(String n)
	{
		name = n;
	}
	
	void print()
	{
		System.out.println(name);
	}
	
	

}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IPLTeam team1 = new IPLTeam();
		team1.setName("RCB");
		
		IPLTeam team2 = new IPLTeam();
		team2.setName("CSK");
		
		IPLTeam team3 = new IPLTeam();
		team3.setName("KKR");

		
		team1.print();
		team2.print();
		team3.print();
	}

}
