package Crop;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CropTest {

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
	public final void testIncreaseThirstLevel() {
		Wheat testWheat = new Wheat();
		assertEquals(7,  testWheat.getThirstLevel());
		testWheat.increaseThirstLevel();
		testWheat.increaseThirstLevel();
		testWheat.increaseThirstLevel();
		testWheat.increaseThirstLevel();
		testWheat.increaseThirstLevel();
		assertEquals(10,  testWheat.getThirstLevel());
	}

	@Test
	public final void testIncreaseGrowthLevel() {
		Potato testPotato = new Potato();
		assertEquals(4,  testPotato.getDaysUntilHarvest());
		testPotato.increaseGrowthLevel(10);
		assertEquals(4,  testPotato.getCurrentGrowthLevel());
	}

}
