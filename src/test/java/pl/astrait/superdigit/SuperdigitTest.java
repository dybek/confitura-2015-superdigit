package pl.astrait.superdigit;
import org.junit.Test;

import pl.astrait.superdigit.Superdigit;

import static org.junit.Assert.*;

public class SuperdigitTest {
	
    @Test
    public void testCalculateSuperdigit() {
        assertEquals(2, Superdigit.calculateSuperdigit(98741L));
    }
}
