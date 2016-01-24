/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.core.business.Peso;
import com.core.enums.Sexo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gonza
 */
public class PesoIdealTest {
    
    private Double altura = 178.0;
    private Double peso = 90.0;
    
    public PesoIdealTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void firstTest() throws InstantiationException, IllegalAccessException {
         System.out.println("Hamwi: " + Peso.hamwi(altura, Sexo.MASCULINO) + " Kg.");
         System.out.println("Brocca: " + Peso.brocca(altura) + " Kg.");
         System.out.println("Lorentz: " + Peso.lorentz(altura, Sexo.MASCULINO) + " Kg.");
         System.out.println("IMC: " + Peso.IMC(altura, peso));
         System.out.println("IMC resultado: " + Peso.IMCResult(altura, peso));
     }
}
