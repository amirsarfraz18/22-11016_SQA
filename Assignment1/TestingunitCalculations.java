package testing;
import static org.junit.Assert.*;
import org.junit.Test;

public class substractTest {
	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.substract(5,5);
		assertEquals(0, output);
	}
}

public class devideTest {
	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.devide(6,2);
		assertEquals(3, output);
	}
}

public class modulusTest {
	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.modulus(2,2);
		assertEquals(0, output);
	}
}

public class squareunit {
	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25, output);
	}
}


public class doublTest {
	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.doubl(5,5);
		assertEquals(10, output);
	}
}



package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ devideTest.class, doublTest.class, modulusTest.class, squareunit.class, substractTest.class })
public class AllTests {

}