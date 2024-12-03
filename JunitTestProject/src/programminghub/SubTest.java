package programminghub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubTest {

	@Test
	void testSub() {
		JunitClass junit = new JunitClass();
		int result = junit.sub(20,10);
		assertEquals(10,result);
//		fail("Not yet implemented");
	}

}
