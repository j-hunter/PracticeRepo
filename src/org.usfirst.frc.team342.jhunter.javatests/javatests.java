//This is an improperly made java file! Woot!

package org.usfirst.frc.team342.jhunter.javatests;

import org.usfirst.frc.team342.jhunter.javatests.widgitsim;
import org.usfirst.frc.team342.jhunter.javatests.widgit;

public class javatests {

	public static void main(String[] args)
	{
		widgitsim mysim = new widgitsim();
		String answer;
		widgit testwid = new widgit(2.0, 2.0, 2.0);
		System.out.println("Hello!");
		if (args.length > 1)
		{
			System.out.println("You typed: " + args[1]);
		}
		else
		{
			System.out.println("No args?");
		}

		answer = mysim.addWid();
		System.out.println("Also, widgit X is " + testwid.getLocX());
		System.out.println("Also made a widgit in the sim called " + answer);
	}
}
