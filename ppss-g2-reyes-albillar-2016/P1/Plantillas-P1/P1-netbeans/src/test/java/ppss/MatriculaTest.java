package ppss;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatriculaTest {
    int edad;
    boolean familiaNumerosa;
    boolean repetidor;
    float resultadoReal, resultadoEsperado;
    Matricula mat= new Matricula();

    @Test
    public void testCalculaTasaMatricula() {
        edad = 23;
        familiaNumerosa = true;
        repetidor = true;
        resultadoEsperado = 250.00f;
        resultadoReal = mat.calculaTasaMatricula(edad,familiaNumerosa,repetidor);
        //el tercer parámetro del método Assert.assertEquals es necesario si estamos comparando "floats"
        //en este caso el método devuelve cierto si:
        //resultadoEsperado = resultadoReal +/- 0.002
        assertEquals(resultadoEsperado, resultadoReal,0.002f);
    }
    
    @Test
    public void test1(){
        edad = 23;
        familiaNumerosa = false;
        repetidor=true;
        resultadoEsperado= 2000.00f;
        resultadoReal= mat.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(resultadoEsperado, resultadoReal,0.002f);
    }
    
    @Test
    public void test2(){
        edad = 40;
        familiaNumerosa = true;
        repetidor=false;
        resultadoEsperado= 250.00f;
        resultadoReal= mat.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(resultadoEsperado, resultadoReal,0.002f);
    }
    
    @Test
    public void test3(){
        edad = 40;
        familiaNumerosa = false;
        repetidor=false;
        resultadoEsperado= 500.00f;
        resultadoReal= mat.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(resultadoEsperado, resultadoReal,0.002f);
    }
    
    @Test
    public void test4(){
        edad = 60;
        familiaNumerosa = true;
        repetidor=false;
        resultadoEsperado= 400.00f;
        resultadoReal= mat.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(resultadoEsperado, resultadoReal,0.002f);
    }
    
    @Test
    public void test5(){
        edad = 66;
        familiaNumerosa = false;
        repetidor=false;
        resultadoEsperado= 250.00f;
        resultadoReal= mat.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(resultadoEsperado, resultadoReal,0.002f);
    }
}