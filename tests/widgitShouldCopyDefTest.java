
import org.junit.Test;
import org.junit.Assert;
import org.usfirst.frc.team342.jhunter.javatests.widgit;

public class widgitShouldCopyDefTest
{
	@Test
	public void testCreate()
	{
		widgit testing = new widgit(2.0, 2.0, 2.0);
		double testNum;

		testNum = testing.getLocX();
		testNum = 5.0;

		Assert.assertEquals(testing.getLocX(), 2.0, 0.00001);
	}


}
