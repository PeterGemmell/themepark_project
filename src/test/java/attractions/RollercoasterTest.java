package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor peter;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40);
        peter = new Visitor(16, 1.8, 60.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasAgeRestriction(){
        assertEquals(true, rollerCoaster.isAllowed(peter));
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.priceFor(peter), 0.1);
    }
}
