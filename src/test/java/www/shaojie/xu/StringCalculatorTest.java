package www.shaojie.xu;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringTddTrainingProjectApplication.class)
public class StringCalculatorTest {

	
    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("1,2");
        assertTrue(true);
    }
    
    @Test(expected = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        StringCalculator.add("1,X");
    }
    
    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() {
        assertEquals(0, StringCalculator.add(""));
    }
    
    @Test
    public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
        assertEquals(3, StringCalculator.add("3"));
    }
     
    @Test
    public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
        assertEquals(3+6, StringCalculator.add("3,6"));
    }
    
    @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
        assertEquals(3+6+15+18+46+33, StringCalculator.add("3,6,15,18,46,33"));
    }

}
