package calculadoratest;

import calculadora.calculator;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class calculatortest {
    calculator calculator = new calculator();

    //Test Ordenados: OK - Fail
    @Test
    public void sumaTestOk() {
        assertEquals(calculator.suma(1, 2), 3);
    }

    @Test
    public void sumaTestFail() {
        assertNotEquals(calculator.suma(5, 2), 3);
    }


    @Test
    public void subtractionTest() {
        assertEquals(calculator.subtraction(5, 3), 2);
    }

    @Test
    public void subtractionTestFail() {
        assertNotEquals(calculator.subtraction(6, 1), 2);
    }


    @Test
    public void multiplyTest() {
        assertEquals(calculator.multiply(2, 2), 4);
    }

    @Test
    public void multiplyTestFail() {
        assertNotEquals(calculator.multiply(3, 7), 20);
    }


    @Test
    public void divisionTestOk() {
        assertEquals(calculator.division(6, 2), 3);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionTestFail() {
        calculator.division(1, 0);
    }

    //Division por cero
    @Test
    public void divisionTestFailCero() {
        assertThrows(
                ArithmeticException.class,
                () -> calculator.division(5, 0)
        );
    }

/*   @Test (expected = NullPointerException.class)
    public void divisionTestFail2() {

        calculator.division(1, 0);
    } */

    //Cuadratica
    @Test
    public void raizTestOk() {
        double[] result = calculator.raiz(4.0, 4.0, -3.0);
        double[] expectedResults = {0.5, -1.5};
        assertTrue(Arrays.equals(expectedResults, result));
    }

    @Test
    public void raizTestFail() {
        double[] result = calculator.raiz(4.0, 4.0, -3.0);
        double[] expectedResults = {-0.5, 1.5};
        assertFalse(Arrays.equals(expectedResults, result));
    }

    @Test
    public void raizTestFailCero() {
        assertThrows(
                ArithmeticException.class,
                () -> calculator.raiz(5, 0, 3)
            
    @Test 
    public void nombreTest() {
        assertEquals("pepe", calculator.miNombre);

        }
     
    }
    
}
            
    
        );
    }

}
