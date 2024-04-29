import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit5.Shapes;

class TestTrial {

	@Test
	void test() {
		assertEquals(6,6);
	}
	@Test
	void testcomputeSquareArea()
	{
		Shapes shape=new Shapes();
		assertEquals(576,shape.computeSquareArea(24));
	}
}
