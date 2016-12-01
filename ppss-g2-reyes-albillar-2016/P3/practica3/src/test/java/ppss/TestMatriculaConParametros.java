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
import java.util.Arrays;
import java.util.Collection;
import org.junit.experimental.categories.Category;

/**
 *
 * @author Alejandro
 */
@Category(ConParametros.class)
@RunWith(Parameterized.class)
public class TestMatriculaConParametros {
    int edad;
    boolean familiaNumerosa, repetidor;
    float expected;
    Matricula pr3= new Matricula();
    
 @Parameterized.Parameters(name="Caso C{index}: Matricula({0},{1},{2})= {3}")
 public static Collection<Object[]> data(){
     return Arrays.asList(new Object[][]{
        {20,false,true,2000.00f},//c1
        {70,false,true,250.00f},//c2
        {20,true,true,250.00f},//c3
        {20,false,false,500.00f},//c4
        {60,false,true,400.00f} //c5
     });
 }         
         
    public TestMatriculaConParametros(int edad, boolean familiaNumerosa, boolean repetidor, float expected){
        this.edad=edad;
        this.familiaNumerosa=familiaNumerosa;
        this.repetidor=repetidor;
        this.expected=expected;
    }
 
    @Test
    public void testParametrizado(){
        assertEquals(expected, pr3.calculaTasaMatricula(edad, familiaNumerosa, repetidor), 0.002f);
    }
}
