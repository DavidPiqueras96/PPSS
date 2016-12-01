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
public class TestAlumnoSinParametros {
    String nif;
    boolean expected, test;
    Alumno alu= new Alumno();
    
    @Test
    public void testC1(){
        nif="123";
        expected=false;
        test= alu.validaNif(nif);
        assertEquals(expected, test);
    }
    @Test
    public void testC2(){
        nif="1234567AA";
        expected=false;
        test= alu.validaNif(nif);
        assertEquals(expected, test);    
    }
    @Test
    public void testC3(){
        nif="-12345678";
        expected=false;
        test= alu.validaNif(nif);
        assertEquals(expected, test);    
    }
    @Test
    public void testC4(){
        nif="00000000X";
        expected=false;
        test= alu.validaNif(nif);
        assertEquals(expected, test);
    }
    @Test
    public void testC5(){
        nif="00000000T";
        expected=true;
        test= alu.validaNif(nif);
        assertEquals(expected, test);    
    }
}
