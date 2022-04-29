import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {

    @Test
    public void square() {
        assertEquals("The square of 13", 169, SkillDemo.square(13));
    }
 
}
