package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor bob;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        bob = new Visitor(16, 1.8, 60.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void hasAgeRestriction(){
        assertEquals(false, playground.isAllowed(bob));
    }
}
