package ab.soft.SquareEquation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareEquationTest {

    @Test
    public void testNullSolution() {
        SquareEquation squareEquation = new SquareEquation(3, -4, 2);
        Assert.assertNull(squareEquation.findSolution(), "Solution is not null");
    }

    @Test
    public void testDifferentRoots() {
        SquareEquation squareEquation = new SquareEquation(1, -4, -5);
        Assert.assertNotEquals(squareEquation.findSolution().x1, squareEquation.findSolution().x2, "x1 == x2");
    }

    @Test
    public void testEqualRoots() {
        SquareEquation squareEquation = new SquareEquation(1, 12, 36);
        Assert.assertEquals(squareEquation.findSolution().x1, squareEquation.findSolution().x2, "x1 != x2");
    }
}
