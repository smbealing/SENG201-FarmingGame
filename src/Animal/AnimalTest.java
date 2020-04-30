package Animal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnimalTest {

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
		Cow testCow = new Cow();
		assertEquals(100, testCow.getHappiness());
		testCow.decreaseHappiness();
		assertEquals(80, testCow.getHappiness());
		
		Horse testHorse = new Horse();
		assertEquals(50, testCow.getHappiness());
		testHorse.decreaseHappiness();
		testHorse.decreaseHappiness();
		testHorse.increaseHappiness(50);
		assertEquals(50, testCow.getHappiness());
		
		Sheep testSheep = new Sheep();
		assertEquals(30, testCow.getHappiness());
		testSheep.decreaseHeath();
		assertEquals(10, testCow.getHappiness());
		
	}

}
