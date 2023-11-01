package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteCalc {

    @Test
    void media() {
        Calc c = new Calc();
        double[] valores = {6,4,2,6,1};
        assertEquals(3.8, c.Media(valores));
    }

    @Test
    void moda() {
        Calc c = new Calc();
        double[] valores = {6,4,2,6,1};
        assertEquals(6, c.Moda(valores));
    }

    @Test
    void mediana() {
        Calc c = new Calc();
        double[] valores = {6,4,2,6,1};
        assertEquals(4, c.Mediana(valores));
    }

    @Test
    void variancia() {
        Calc c = new Calc();
        double[] valores = {6,4,2,6,2};
        assertEquals(4, c.Variancia(valores));
    }

    @Test
    void desvio() {
        Calc c = new Calc();
        double[] valores = {6,4,2,6,2};
        assertEquals(2, c.DesvioPadrao(valores));
    }

}
