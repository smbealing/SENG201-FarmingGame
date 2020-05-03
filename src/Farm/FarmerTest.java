package Farm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FarmerTest {

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
	public final void testReduceActionCount() {
		Farmer testFarmer = new Farmer();
		assertEquals(2, testFarmer.getActionCount());
		testFarmer.reduceActionCount();
		testFarmer.reduceActionCount();
		testFarmer.reduceActionCount();
		assertEquals(0, testFarmer.getActionCount());
		
		
	}

}
