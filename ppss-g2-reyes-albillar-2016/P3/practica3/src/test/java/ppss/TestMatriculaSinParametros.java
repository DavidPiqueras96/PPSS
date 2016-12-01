/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppss;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;

/**
 *
 * @author Alejandro
 */
@Category(SinParametros.class)
public class TestMatriculaSinParametros {
    int edad;
    boolean familiaNumerosa;
    boolean repetidor;
    float tested, expected;
    Matricula pr3= new Matricula();
    
    @Test
    public void testC1(){
        edad=20;
        familiaNumerosa=false;
        repetidor=true;
        expected=2000.00f;
        tested=pr3.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expected, tested, 0.002f);
    }
    @Test
    public void testC2(){
        edad=70;
        familiaNumerosa=false;
        repetidor=true;
        expected=250.00f;
        tested=pr3.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expected, tested, 0.002f);
    }
    @Test
    public void testC3(){
        edad=20;
        familiaNumerosa=true;
        repetidor=true;
        expected=250.00f;
        tested=pr3.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expected, tested, 0.002f);
    }
    @Test
    public void testC4(){
        edad=20;
        familiaNumerosa=false;
        repetidor=false;
        expected=500.00f;
        tested=pr3.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expected, tested, 0.002f);    
    }
    @Test
    public void testC5(){
        edad=60;
        familiaNumerosa=false;
        repetidor=true;
        expected=400.00f;
        tested=pr3.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expected, tested, 0.002f);        
    }
}
