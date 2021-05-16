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
import Controller.adminIndex;

/**
 *
 * @author A S M Hasibul Alam
 */
public class adminIndexTest {
    
    public adminIndexTest() {
    }
    
    adminIndex AI;
    
    @Before
    public void setUp() {
        AI = new adminIndex();
    }
    
    @Test
    public void checkUserNameTest() {
        assertSame("correct", AI.checkUserName("Admin"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
