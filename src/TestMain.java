import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {
	
	@Test
    public void exampleTests() {
        assertEquals(1120, Main.main(1000, 10, 127, 14));
        assertEquals(1000, Main.main(100, 10, 0, 10));
        assertEquals(1000, Main.main(100, 10, 0, 10));
        assertEquals(450, Main.main(25, 50, 120, 18));
    }
}