package org.usfirst.frc.team342.jhunter.javatests;


public class widgit
{
	private double location[];

	public 	widgit()
	{
		location = new double[3];
		location[0] = 0.0;
		location[1] = 0.0;
		location[2] = 0.0;
	}

	public widgit(double x, double y, double z)
	{
		location = new double [3];
		location[0] = x;
		location[1] = y;
		location[2] = z;
	}

	public double getLocX()
	{
		return location[0];
	}
}
