import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayCaculatorTest {

    @Test
    @DisplayName("case 1/1/2018")
    void testDay1Month1Year2018(){
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2018;
        String result = NextDayCaculator.nextDayCalculator(dayTest, monthTest, yearTest);
        String expected = "2-1-2018";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 31/1/2018")
    void testDay31Month1Year2018(){
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2018;
        String result = NextDayCaculator.nextDayCalculator(dayTest, monthTest, yearTest);
        String expected = "1-2-2018";
        assertEquals(expected, result);
    }

}