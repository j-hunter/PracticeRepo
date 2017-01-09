package org.usfirst.frc.team342.jhunter.javatests;

import org.usfirst.frc.team342.jhunter.javatests.widgit;
import java.util.*;

public class widgitsim
{
	private Map widgits;
	private long lastID;

	widgitsim()
	{
		widgits = Collections.synchronizedMap(new LinkedHashMap<String, widgit>());
		lastID = 0;
	}

	public String addWid()	
	{
		lastID = lastID + 1;
		widgits.put(String.valueOf(lastID), new widgit());
		return String.valueOf(lastID);
	}

}
