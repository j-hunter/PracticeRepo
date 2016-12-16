
import org.junit.Test;
import org.junit.Assert;
import org.usfirst.frc.team342.jhunter.javatests.widgit;

public class widgitShouldCreateTest
{

	@Test
	public void testCreate()
	{
		widgit Testing = null;

		Assert.assertNull(Testing);

		Testing = new widgit();

		Assert.assertNotNull(Testing);		

	}


}
