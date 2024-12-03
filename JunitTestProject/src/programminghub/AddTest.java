package programminghub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void testAdd() {
		JunitClass junit = new JunitClass();
		int result= junit.add(300, 200);
		assertEquals(500,result);
//		fail("Not yet implemented");
	}

	@Test
	void testMul() {
		JunitClass junit = new JunitClass();
		int result = junit.mul(10, 20);
		assertEquals(200,result);
		
//		fail("Not yet implemented");
	}

}
