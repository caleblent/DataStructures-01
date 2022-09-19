package project01package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PantsTest {

	/**
	 *  (1) A valid constructor call for Pants
	 */
	@Test
	void testPantsConstructor() {
		Pants pants = new Pants("blue", 17.99, Condition.GOOD, 32, 32);
		
		assertEquals("blue", pants.getColor());
		assertEquals(17.99, pants.getPrice());
		assertEquals(Condition.GOOD, pants.getCondition());
		assertEquals(32, pants.getWaist());
		assertEquals(32, pants.getInseam());
	}
	
	/**
	 * (2) Attempted Pants constructor calls with illegal values
	 */
	@Test
	void testIllegalPantsValues() {
//		Pants pants = new Pants("blue", 17.99, Condition.GOOD, 32, 32);
		
		// empty string color
		assertThrows(IllegalArgumentException.class, () -> new Pants("", 17.99, Condition.GOOD, 32, 32), "Should not be able to set an empty color");
		
		// null color
		assertThrows(IllegalArgumentException.class, () -> new Pants(null, 17.99, Condition.GOOD, 32, 32), "Should not be able to set a null color");
		
		// negative price
		assertThrows(IllegalArgumentException.class, () -> new Pants("blue", -17.99, Condition.GOOD, 32, 32), "Should not be able to set a negative price");
		
		// null condition
		assertThrows(IllegalArgumentException.class, () -> new Pants("blue", 17.99, null, 32, 32), "Should not be able to set a null condition");
		
		// negative waist measurement
		assertThrows(IllegalArgumentException.class, () -> new Pants("blue", 17.99, Condition.GOOD, -3, 32), "Should not be able to set a negative waist measurement");
		
		// zero waist measurement
		assertThrows(IllegalArgumentException.class, () -> new Pants("blue", 17.99, Condition.GOOD, 0, 32), "Should not be able to set a zero waist measurement");
		
		// negative inseam measurement
		assertThrows(IllegalArgumentException.class, () -> new Pants("blue", 17.99, Condition.GOOD, 32, -3), "Should not be able to set a negative inseam measurement");
		
		// zero inseam measurement
		assertThrows(IllegalArgumentException.class, () -> new Pants("blue", 17.99, Condition.GOOD, 32, 0), "Should not be able to set a negative inseam measurement");
	}
	
	/**
	 * (3) A valid constructor call for Shirt
	 */
	@Test
	void testShirtConstructor() {
		Shirt shirt = new Shirt("red", 11.95, Condition.GOOD, Size.M, "Dog person");
		
		assertEquals("red", shirt.getColor());
		assertEquals(11.95, shirt.getPrice());
		assertEquals(Condition.GOOD, shirt.getCondition());
		assertEquals(Size.M, shirt.getSize());
		assertEquals("Dog person", shirt.getShirtText());
	}
	
	/**
	 * (4) Attempted Shirt constructor calls with illegal values
	 */
	@Test
	void testIllegalShirtValues() {
//		Shirt shirt = new Shirt("red", 11.95, Condition.GOOD, Size.M, "Dog person");
		
		// empty string color
		assertThrows(IllegalArgumentException.class, () -> new Shirt("", 11.95, Condition.GOOD, Size.M, "Dog person"), "Should not be able to set an empty color");
		
		// null color
		assertThrows(IllegalArgumentException.class, () -> new Shirt(null, 11.95, Condition.GOOD, Size.M, "Dog person"), "Should not be able to set a null color");
		
		// negative price
		assertThrows(IllegalArgumentException.class, () -> new Shirt("red", -11.95, Condition.GOOD, Size.M, "Dog person"), "Should not be able to set a negative price");
		
		// null condition
		assertThrows(IllegalArgumentException.class, () -> new Shirt("red", 11.95, null, Size.M, "Dog person"), "Should not be able to set a null condition");
		
		// null size
		assertThrows(IllegalArgumentException.class, () -> new Shirt("red", 11.95, Condition.GOOD, null, "Dog person"), "Should not be able to set a null size");
	}
	
	/**
	 * (5) Valid setter calls for Pants.
	 */
	@Test
	void testChangePantsValues() {
		Pants pants = new Pants("blue", 17.99, Condition.GOOD, 32, 32);
		
		pants.setColor("green");
		pants.setPrice(13.79);
		pants.setCondition(Condition.POOR);
		pants.setWaist(30);
		pants.setInseam(30);
		
		assertEquals("green", pants.getColor());
		assertEquals(13.79, pants.getPrice());
		assertEquals(Condition.POOR, pants.getCondition());
		assertEquals(30, pants.getWaist());
		assertEquals(30, pants.getInseam());
	}
	
	/**
	 * (6) Attempted Pants setter calls with illegal values
	 */
	@Test
	void testPantsSetters() {
		Pants pants = new Pants("blue", 17.99, Condition.GOOD, 32, 32);
		
		// empty string color
		assertThrows(IllegalArgumentException.class, () -> pants.setColor(""), "Should not be able to set an empty color");
		
		// null color
		assertThrows(IllegalArgumentException.class, () -> pants.setColor(null), "Should not be able to set a null color");
		
		// negative price
		assertThrows(IllegalArgumentException.class, () -> pants.setPrice(-4.23), "Should not be able to set a negative price");
		
		// null condition
		assertThrows(IllegalArgumentException.class, () -> pants.setCondition(null), "Should not be able to set a null condition");
		
		// negative waist measurement
		assertThrows(IllegalArgumentException.class, () -> pants.setWaist(-3), "Should not be able to set a negative waist measurement");
		
		// zero waist measurement
		assertThrows(IllegalArgumentException.class, () -> pants.setWaist(0), "Should not be able to set a zero waist measurement");
		
		// negative inseam measurement
		assertThrows(IllegalArgumentException.class, () -> pants.setInseam(-3), "Should not be able to set a negative inseam measurement");
		
		// zero inseam measurement
		assertThrows(IllegalArgumentException.class, () -> pants.setInseam(-3), "Should not be able to set a negative inseam measurement");
	}
	
	/**
	 * (7) Valid setter calls for Shirt
	 */
	@Test
	void testChangeShirtValues() {
		Shirt shirt = new Shirt("red", 11.95, Condition.GOOD, Size.M, "Dog person");
		
		shirt.setColor("pink");
		shirt.setPrice(3.75);
		shirt.setCondition(Condition.POOR);
		shirt.setSize(Size.L);
		shirt.setShirtText("Computer nerd");
		
		assertEquals("pink", shirt.getColor());
		assertEquals(3.75, shirt.getPrice());
		assertEquals(Condition.POOR, shirt.getCondition());
		assertEquals(Size.L, shirt.getSize());
		assertEquals("Computer nerd", shirt.getShirtText());
	}
	
	/**
	 * (8) Attempted Shirt setter calls with illegal values
	 */
	@Test
	void testShirtSetters() {
		Shirt shirt = new Shirt("red", 11.95, Condition.GOOD, Size.M, "Dog person");
		
		// empty string color
		assertThrows(IllegalArgumentException.class, () -> shirt.setColor(""), "Should not be able to set an empty color");
		
		// null color
		assertThrows(IllegalArgumentException.class, () -> shirt.setColor(null), "Should not be able to set a null color");
		
		// negative price
		assertThrows(IllegalArgumentException.class, () -> shirt.setPrice(-4.23), "Should not be able to set a negative price");
		
		// null condition
		assertThrows(IllegalArgumentException.class, () -> shirt.setCondition(null), "Should not be able to set a null condition");
		
		// null size
		assertThrows(IllegalArgumentException.class, () -> shirt.setSize(null), "Should not be able to set a null size");
	}
	
	
	

}
