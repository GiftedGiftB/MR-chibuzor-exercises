import Subtraction.Subtraction;
import org.junit.jupiter.api.Test;
import Subtraction.Subtraction;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPracice {

    @Test
    public void testThatThereIsParameterInTheFunction(){
        Subtraction practice = new Subtraction();
        assertEquals(practice.mysubtraction(16,12), 4);
    }
    @Test
    public void testThattheresultcannotbenegativefollowingthesequece(){
       Subtraction practice = new Subtraction();
        assertEquals(practice.mysubtraction(5,10), 5);
    }
//    @Test
//    public void testthatthefunctioncollectsctsintegersalone(){
//        Subtraction practice = new Subtraction();
//        assertTrue(practice.mysubtraction(12 , 3),true);
//    }
}
