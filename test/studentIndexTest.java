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
import Controller.studentIndex;

/**
 *
 * @author A S M Hasibul Alam
 */
public class studentIndexTest {
    
    public studentIndexTest() {
    }
    
    studentIndex SI;
    
    @Before
    public void setUp() throws Exception {
        SI = new studentIndex();
    }
    
    @Test
    public void checkIDTest() {
        assertSame(true, SI.checkID("1011"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
