package Farm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FarmTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}



	@Test
	public final void testIncreaseMaintenanceLevel() {
		Farmer myFarmer = new Farmer();
		NormalFarm normalFarm = new NormalFarm("Normal Test Farm", myFarmer);
		
		assertEquals(0, normalFarm.getMaintenanceLevel());
		normalFarm.increaseMaintenanceLevel();
		normalFarm.increaseMaintenanceLevel();
		normalFarm.increaseMaintenanceLevel();
		normalFarm.increaseMaintenanceLevel();
		assertEquals(3, normalFarm.getMaintenanceLevel());
	}


}
