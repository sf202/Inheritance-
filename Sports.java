//Santiago Fleiderman
//CSc 2310, Principles of Computer Science
//Fall 2015
//Assignment 5
/* Uses inheritance to call from the mother class and child classes
to the driver class and prints out attributes of sports*/
//10-29-2015
// This is the Super Class mother class
public class Sports {
	String firstName;
	String lastName;
	int playerNumber;
	double salary;

	public Sports (String f,String Ln,int pN,double sa) {
		firstName = f;
		lastName = Ln;
		playerNumber = pN;
		salary = sa;
	}
	//This is used by Driver class to Print player details.
	public void method1(){
		System.out.println("Name: "+firstName+ "  "+  "Last Name: "+ " "+lastName +" " + "Player Number: "+ ""+playerNumber+ " "+"Salary:"+ " " +salary);
	}
}
