import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class TestSection {

    Set s1 = new Set();
    Set s2 = new Set();

    @Before
    public void setup() {
        s1.insert(1);
        s1.insert(3);
        s1.insert(4);

        s2.insert(1);
        s2.insert(2);
        s2.insert(3);
        s2.insert(5);
    }

    @After
    public void tearDown() {

    }

    @Test
    public void sectionTest1() {
        s1.section(s2);
        assertEquals("[4]", Arrays.toString(s1.toArray()));
    }

}
