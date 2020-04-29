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
	public void test() {
		Farmer myFarmer = new Farmer();
		NormalFarm normalFarm = new NormalFarm("Normal Test Farm", myFarmer);
		assertEquals("Normal Farm", normalFarm.getType());
		
		assertEquals(1, normalFarm.getMaintenanceLevel());
		normalFarm.setMaintenanceLevel(3);
		assertEquals(3, normalFarm.getMaintenanceLevel());
	}

}
