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
	}
}