import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class TestTriple {

    Set s = new Set();
    @Before
    public void setup() {

    }
    @After
    public void tearDown() {

    }

    @Test
    public void tripleTest1() {
        s.insert(1);
        s.insert(3);
        s.insert(5);
        assertEquals(true, s.containsArithTriple());
    }

    @Test
    public void tripleTest2() {
        s.insert(1);
        s.insert(3);
        s.insert(4);
        assertEquals(false, s.containsArithTriple());
    }

}
