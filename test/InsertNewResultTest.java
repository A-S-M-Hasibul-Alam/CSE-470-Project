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
import Model.InsertNewResult;

/**
 *
 * @author A S M Hasibul Alam
 */
public class InsertNewResultTest {
    
    public InsertNewResultTest() {
    }
    
    InsertNewResult IR;
    
    @Before
    public void setUp() {
        IR = new InsertNewResult();
    }
    
    @Test
    public void CheckNumberTest() {
        assertSame("valid", IR.CheckNumber(0));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
