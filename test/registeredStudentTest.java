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
import View.registeredStudent;

/**
 *
 * @author A S M Hasibul Alam
 */
public class registeredStudentTest {
    
    public registeredStudentTest() {
    }
    
    registeredStudent RS;
    
    @Before
    public void setUp() {
        RS = new registeredStudent();
    }
    
    @Test
    public void checkNameTest() {
        assertSame("valid", RS.checkName("sas"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
