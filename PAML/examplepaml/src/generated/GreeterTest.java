package examplepaml;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class GreeterTest {

	
	@Test
	void greeterShouldReturnHelloWorld() {
		Greeter greeter = new Greeter();
       	assertTrue("Hello World".equalsIgnoreCase(greeter.helloWorld()));
    }
	
    @Test
	void greeterShouldReturnHelloMark() {
		Greeter greeter = new Greeter();
		String mark = "Mark";
       	assertTrue("Hello Mark".equalsIgnoreCase(greeter.helloPerson("Mark")));
    }
}
