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
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Collection;
import java.util.Arrays;
import org.junit.experimental.categories.Category;
/**
 *
 * @author Alejandro
 */
@Category(ConParametros.class)
@RunWith(Parameterized.class)
public class TestAlumnoConParametros {
    String nif;
    boolean expected;
    Alumno alu= new Alumno();
    
    @Parameterized.Parameters(name="Caso C{index}: validaNIF({0})={1}")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {"123",false},
            {"1234567AA",false},
            {"-12345678",false},
            {"00000000X",false},
            {"00000000T",true}
        });
    }
    
    public TestAlumnoConParametros(String nif, boolean expected) {
        this.nif=nif;
        this.expected=expected;
    }
    
    @Test
    public void testParametrizado(){
        assertEquals(expected, alu.validaNif(nif));
    }

}
