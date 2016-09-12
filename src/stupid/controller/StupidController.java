package stupid.controller;

import java.util.Scanner;

public class StupidController

{
	private String myName;
	private Scanner inputReader;

	public StupidController()
	{
		myName = "Kyle the Cool";
		inputReader = new Scanner(System.in);
	}

	public void start()
	{
		System.out.println("this program is less stupid");
		System.out.println(myName);
		askQuestions();
	}

	private void askQuestions()
	{
		System.out.println("How was your day?");
		String input = inputReader.nextLine();
		System.out.println("Wow, you said: " + input + " Oh wait, I don't care");
		
		System.out.println("Sorry, that was very rude of me.  I want to get to know you a little better.  What is your favorite type of food?");
		String foodInput = inputReader.nextLine();
		System.out.println("You said you enjoy " + foodInput + ", I guess that's pretty good");
		
		System.out.println("So now that we are friends and everything, mind telling me your credit card number for absolutely no reason at all?");
		inputReader.nextDouble();
		System.out.println("MWHAHAHAHA *cough* I meant, uh, thanks!");
		
		System.out.println("You know what, while we are on that tangent, who is your credit card provider?");
		String providerInput = inputReader.next();
		System.out.println(providerInput + ", good to know.  And before you even ask, of course this isn't a scam!");
		
		System.out.println("To round up this nice little chat, how about hooking papa up with the last 4 of your social?");
		inputReader.nextInt();
		System.out.println("Remember, any calls from the bank reporting suspicious activity are probably fake!  Just ignore them!");
		
		System.out.println()
		
		
	
		
	}
}