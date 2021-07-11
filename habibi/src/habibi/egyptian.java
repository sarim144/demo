package habibi;

import java.util.Scanner;

public class egyptian {

	public static void main(String[] args) {
		int cat;
		int dog;
		int other;
		
		System.out.println("How many cats do you have?");
		Scanner nam= new Scanner(System.in);
		cat=nam.nextInt();
		System.out.println("How many dogs do you have?");
		Scanner naam= new Scanner(System.in);
		dog=naam.nextInt();
		System.out.println("How many other pets do you have?");
		Scanner naaam= new Scanner(System.in);
		other=naaam.nextInt();
		
		 if((( dog==0 && other==0)) && cat!=0) {
			System.out.println("User has 0 dogs, 0 other pets and"+cat + "cats");
		}
		else if((( cat== 0 &&  other==0)) && dog!=0) {
			System.out.println("User has 0 cats, 0 other pets and"+dog+ "dogs");
		}
		else if((( cat == 0 &&  dog == 0)) && other!=0) {
			System.out.println("User has 0 cats, 0 dogs and"+ other + "dogs");
		}
			
		}
	}
