/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Model.adminHome;

/**
 *
 * @author A S M Hasibul Alam
 */
public class adminHomeTest {
    
    public adminHomeTest() {
    }
    
    adminHome AH;
    
    @Before
    public void setUp() {
        AH = new adminHome();
    }
    
    @Test
    public void checkIDTest() {
        assertEquals(3, AH.checkIDLength("10"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
