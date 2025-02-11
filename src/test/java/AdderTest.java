import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AdderTest {

    @DataProvider(name = "NumberTests")
    public static Object[][] NumberTests() {
        return new Object[][] {
                {0.0, 0.0, 0.0},
                {0.0, 1.0, 1.0},
                {100.5, 0.5, 101.0}
        };
    }

    @Test(dataProvider = "NumberTests")
    public void testAddNumber(double initialSum, double number, double expectedResult) {
        //Arrange
        Adder a = new Adder(initialSum);

        //Act
        a.addNumber(number);

        //Assert
        assertEquals(a.getSum(), expectedResult, 0.00001);
    }

    /**
     * This method will test that the constructor properly initalizes itself.
     */
    @Test
    public void testInitialConstructor() {
        //Arrange
        Adder a = new Adder();

        //Act
        //No actions to take.

        //Assert
        assertEquals(a.getSum(), 0, 0.000001);
    }
}