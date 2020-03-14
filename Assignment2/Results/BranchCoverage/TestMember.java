import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class TestMember {

    Set s = new Set();

    @Before
    public void setup() {
       s.insert(1);
       s.insert(3);
       s.insert(4);
    }

    @After
    public void tearDown() {

    }

    @Test
    public void memberTest1() {
        assertEquals(false,s.member(2));
    }

    @Test
    public void memberTest2() {
        assertEquals(true,s.member(4));
    }

    @Test
    public void memberTest3() {
        assertEquals(false,s.member(5));
    }

}
