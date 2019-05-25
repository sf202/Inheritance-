import java.util.Scanner;


public class Driver {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);


		String TheFs;
		String TheLs;
		int ThepN;
		double saly;
		int choice;

		System.out.println("What sport you looking for? (Choose 1 for soccer, 2 for tennis, 3 for hockey and 4 to cancel)" );
		choice = keyboard.nextInt();

		if (choice == 1)
		{

			//		Prompts user to input code 
			keyboard.nextLine();
			System.out.println("What is the first name of your favorite soccer player?");
			TheFs = keyboard.nextLine();
			System.out.println("What is the last name of your favorite soccer player?");
			TheLs = keyboard.nextLine();
			System.out.println("What is your favorate player number?");
			ThepN = keyboard.nextInt();
			System.out.println("What is the salary of your favorite soccer player?");
			saly = keyboard.nextDouble();

			soccer World = new soccer(TheFs,TheLs,ThepN,saly);
			World.method1();
			for(int i=0; i<3;i ++){
				System.out.println(World.behavior[i]); 
			}
		}

		if (choice == 2)
		{
			keyboard.nextLine();
			System.out.println("What is the first name of your favorite Tennis player?");
			TheFs = keyboard.nextLine();
			System.out.println("What is the last name of your favorite Tennis player?");
			TheLs = keyboard.nextLine();
			System.out.println("What is your favorate player number?");
			ThepN = keyboard.nextInt();
			System.out.println("What is the salary of your favorite Tennis player?");
			saly = keyboard.nextDouble();

			tennis Wii = new tennis(TheFs,TheLs,ThepN,saly);
			Wii.method1();
			for(int k=0; k<3;k ++){
				System.out.println(Wii.behavior[k]);
			}
		}

		if(choice == 3)
		{
			keyboard.nextLine();
			System.out.println("What is the first name of your favorite hockey player?");
			TheFs = keyboard.nextLine();
			System.out.println("What is the last name of your favorite hockey player?");
			TheLs = keyboard.nextLine();
			System.out.println("What is your favorate player number?");
			ThepN = keyboard.nextInt();
			System.out.println("What is the salary of your favorite hockey player?");
			saly = keyboard.nextDouble();

			hockey Canada = new hockey(TheFs,TheLs,ThepN,saly);
			Canada.method1();
			for(int s = 0;s<3;s++) {
				System.out.println(Canada.behavior[s]);
			}
		}

		if (choice == 4) {
			System.out.println("Have  Fantastic day");
		}
		else
			System.out.println("Have  good day");

	}
}


