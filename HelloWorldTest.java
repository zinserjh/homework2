import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testLowerHello() {
	// is hello world, all lower case
		assertTrue("Lower case hello test: ", HelloWorld.isHelloWorld(
				"hello world"));
	}
	
	@Test
	public void testUpperHello() {
	// is hello world, all upper case
		assertTrue("Lower case hello test: ", HelloWorld.isHelloWorld(
				"HELLO WORLD"));
	}

	@Test
	public void testNotHello()   {
	// is not hello world
		assertFalse("Lower case hello test: ", HelloWorld.isHelloWorld(
				"I'm annoying, huh?"));
	}

}