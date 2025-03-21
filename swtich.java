package day1programs;



import java.util.Scanner;



public class swtich {

	public static void main(String[] args) {

		try (Scanner s1 = new Scanner(System.in)) {

			int a=s1.nextInt();

			int b=s1.nextInt();

			char choice;

			System.out.println("+,-");

			choice =s1.next().charAt(0);

			switch(choice) {

			case '+':

				int c=a+b;

				System.out.println("ADD"+c);

				break;

			case '-':

				int d=a-b;

				System.out.println("SUB"+d);

				break;

			default:

				System.out.println("Invalid choice");

				break;

			}

		}

		

	}

		    

}