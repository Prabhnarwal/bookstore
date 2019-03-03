/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1894828
 */
public class authorTest {
    
    public authorTest() {
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

    @Test
    public void createIDTest() {
        System.out.println("Test for author");
        Date newDate = new Date();
        String bookName = "Madame Bovary";
        String expectedResult = "19-03-O-MY";
        String realResult = bookstore1.customer.createId(newDate,bookName);
        assertEquals(expectedResult, realResult);}
}
