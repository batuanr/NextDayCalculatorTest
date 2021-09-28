import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("case 1/1/2021")
    void testDay1Month1Year2021() {
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2021;
        String expected = "2/1/2021";
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 31/1/2021")
    void testDay31Month1Year2021() {
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2021;
        String expected = "1/2/2021";
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 30/4/2021")
    void testDay30Month4Year2021() {
        int dayTest = 30;
        int monthTest = 4;
        int yearTest = 2021;
        String expected = "1/5/2021";
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 28/2/2018")
    void testDay28Month2Year2018() {
        int dayTest = 28;
        int monthTest = 2;
        int yearTest = 2018;
        String expected = "1/3/2018";
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 29/2/2018")
    void testDay29Month2Year2020() {
        int dayTest = 29;
        int monthTest = 2;
        int yearTest = 2018;
        String expected = "1/3/2020";
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }
}