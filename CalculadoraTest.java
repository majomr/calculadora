import org.junit.Test;

import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

public class CalculadoraTest {
    private Calculadora calc = new Calculadora();
    @Test
    public void sumar() {
        assertEquals(2, calc.sumar(1,1));
    }

    @Test
    public void testRestar() {
        assertEquals(0, calc.restar(1,1));
    }

    @Test
    public void testDividir() {
        assertEquals(4, calc.dividir(8,2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(16, calc.multiplicar(8,2));
    }

    @Test
    public void testSumarFail() {
        assertEquals(1, calc.sumar(1,1));
    }

    @Test
    public void testRestarFail() {
        assertEquals(1, calc.restar(1,1));
    }

    @Test
    public void testDividirFail() {
        assertEquals(5, calc.dividir(8,2));
    }

    @Test
    public void testMultiplicarFail() {
        assertEquals(3, calc.multiplicar(8,2));
    }
}