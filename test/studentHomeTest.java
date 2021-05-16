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
import View.studentHome;

/**
 *
 * @author A S M Hasibul Alam
 */
public class studentHomeTest {
    
    public studentHomeTest() {
    }
    
    studentHome SH;
    
    @Before
    public void setUp() {
        SH = new studentHome();
    }
    
    @Test
    public void TestStudentHome() {
        assertEquals(450, SH.SumOfMarks(90,90,90,90,90));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
