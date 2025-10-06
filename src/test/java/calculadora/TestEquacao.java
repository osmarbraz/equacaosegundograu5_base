package calculadora;

import equacao.Equacao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestEquacao {

    /**
     * 2x^2 + x - 3 = 0
     * delta=25
     * x1=1
     * x2=-3/2
     */
    @Test
    void testGetDeltaMaiorQueZero() {
        Equacao equacao = new Equacao(2.0, 1.0, -3.);
        double retornoEsperado = 25.0;
        double retornoFeito = equacao.getDelta();
        assertEquals(retornoEsperado, retornoFeito, 0.0001);
    }
    
    /**
     * 2x^2 + x - 3 = 0
     * delta=25
     * x1=1
     * x2=-3/2
     */
    @Test
    void testGetRaiz1() {
        Equacao equacao = new Equacao(2.0, 1.0, -3);
        double retornoEsperado1 = 1.0;
        double retornoFeito1 = equacao.getRaiz1();
        assertEquals(retornoEsperado1, retornoFeito1, 0.00010);
    }
    
     /**
     * 2x^2 + x - 3 = 0
     * delta=25
     * x1=1
     * x2=-3/2
     */
    @Test
    void testGetRaiz2() {
        Equacao equacao = new Equacao(2.0, 1.0, -3);
        double retornoEsperado2 = -1.5;
        double retornoFeito2 = equacao.getRaiz2();
        assertEquals(retornoEsperado2, retornoFeito2, 0.0001);
    }
    
    /**
     * 2x^2 + x - 3 = 0
     * delta=25
     * x1=1
     * x2=-3/2
     */
    @Test
    void testGetRaizes1e2MaiorQueZero() {
        Equacao equacao = new Equacao(2.0, 1.0, -3);
        double retornoEsperado1 = 1.0;
        double retornoFeito1 = equacao.getRaiz1();
        double retornoEsperado2 = -1.5;
        double retornoFeito2 = equacao.getRaiz2();
        assertEquals(retornoEsperado1, retornoFeito1, 0.0001);
        assertEquals(retornoEsperado2, retornoFeito2, 0.0001);
    }
        
    /**
     * x^2 + 14x + 49 = 0
     * delta=0
     * x1=-7
     * x2=-7
     */
    @Test
    void testGetDeltaIgualZero() {
        Equacao equacao = new Equacao(1.0, 14.0, 49.0);
        double retornoEsperado = 0.0;
        double retornoFeito = equacao.getDelta();
        assertEquals(retornoEsperado, retornoFeito, 0.0001);
    }
    
    /**
     * x^2 + 14x + 49 = 0
     * delta=0
     * x1=-7
     * x2=-7
     */
    @Test
    void testGetRaizesIguais() {
        Equacao equacao = new Equacao(1.0, 14.0, 49.0);
        double retornoEsperado = -7.0;
        double retornoFeito1 = equacao.getRaiz1();
        double retornoFeito2 = equacao.getRaiz2();
        assertEquals(retornoEsperado, retornoFeito1, 0.0001);
        assertEquals(retornoEsperado, retornoFeito2, 0.0001);
    }
    
    /**
     * x^2 + x + 1 = 0
     * delta=-3
     * x1=NaN
     * x2=NaN
     */
    @Test
    void testGetDeltaMenorQueZero() {
        Equacao equacao = new Equacao(1.0, 1.0, 1.0);
        double retornoEsperado = -3.0;
        double retornoFeito = equacao.getDelta();
        assertEquals(retornoEsperado, retornoFeito, 0.0001);
    }
        
    /**
     * x^2 + x + 1 = 0
     * delta=-3
     * x1=NaN
     * x2=NaN
     */
    @Test
    void testGetRaizes1e2NaN() {
        Equacao equacao = new Equacao(1.0, 1.0, 1.0);
        double retornoEsperado = Double.NaN;
        double retornoFeito1 = equacao.getRaiz1();
        double retornoFeito2 = equacao.getRaiz2();
        assertEquals(retornoEsperado, retornoFeito1, 0.0001);
        assertEquals(retornoEsperado, retornoFeito2, 0.0001);
    }
}