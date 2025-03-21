package day1programs;

import java.util.*;

public class Userinput {

	public static void main(String[]args) {

		try (Scanner s1 = new Scanner(System.in)) {

			System.out.println("Enter a name");

			String name = s1.nextLine();

			System.out.println("My name is"+name);

			System.out.println("Enter a mark");

			int marks =s1.nextInt();

			System.out.print("Mark is"+marks);

		}

	}



	

}


		    

