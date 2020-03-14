import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class TestInsert {

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
    public void insertTest1() {
        s.insert(2);
        assertEquals("[1, 2, 3, 4]", Arrays.toString(s.toArray()));
    }

    @Test
    public void insertTest2() {
        s.insert(4);
        assertEquals("[1, 3, 4]", Arrays.toString(s.toArray()));
    }

    @Test
    public void insertTest3() {
        s.insert(5);
        assertEquals("[1, 3, 4, 5]", Arrays.toString(s.toArray()));
    }

}
