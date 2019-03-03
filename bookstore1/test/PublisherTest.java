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
 * @author temp
 */
public class PublisherTest {
    
    public PublisherTest() {
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
        System.out.println("Test for Publisher");
        Date newDate = new Date();
        String Pname = "ABC";
        String expectedResult = "19-03-O-AC";
        String realResult = bookstore1.Publisher.createId(newDate,Pname);
        assertEquals(expectedResult, realResult);
    }
}
