//This is an improperly made java file! Woot!

package org.usfirst.frc.team342.jhunter.javatests;

import org.usfirst.frc.team342.jhunter.javatests.widgitsim;

public class javatests {
	
	private widgitsim mysim;


	javatests()
	{
		mysim = new widgitsim();
	}


	public static void main(String[] args)
	{
		System.out.println("Hello!");
		if (args.length > 1)
		{
			System.out.println("You typed: " + args[1]);
		}
		else
		{
			System.out.println("No args?");
		}
	}
}
