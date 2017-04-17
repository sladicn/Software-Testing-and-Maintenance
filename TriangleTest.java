package test;

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
import triangle.NegativeTriangleSideException;
import triangle.TriangleClass;

public class TriangleTest 
{
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    // TODO add test methods here.
//    // The methods must be annotated with annotation @Test. For example:
//    //
//    // @Test
//    // public void hello() {}
    
    @Test
    public void TestIfItIsATriangle( ) throws NegativeTriangleSideException 
    {
        TriangleClass triangle = new TriangleClass(2, 2, 5); 
        boolean expected = false;
        boolean actual = triangle.isTrianglePossibleToConstruct( ); 
        assertEquals(expected, actual);
    }
    
    @Test
    public void testIsosceles( )throws NegativeTriangleSideException
    { 
        TriangleClass triangle = new TriangleClass(3, 3, 5);
        String expected = "Isosceles Triangle"; 
        String actual = triangle.getTriangleSides();
        assertEquals(expected, actual); 
    }
    
    @Test
    public void testScalene() throws NegativeTriangleSideException
    {
        TriangleClass triangle = new TriangleClass(3, 4, 5);
        String expected = "Scalene Triangle"; 
        String actual = triangle.getTriangleSides( );
        assertEquals(expected, actual); 
    }
	
    @Test	
    public void testEquilateral( ) throws NegativeTriangleSideException
    { 	
        TriangleClass triangle = new TriangleClass(2, 2, 2); 
        String expected = "Equilateral Triangle"; 
        String actual = triangle.getTriangleSides( ); 
        assertEquals(expected, actual);	
    }
    
    @Test
    public void testTriangleAngle( ) throws NegativeTriangleSideException
    { 
        TriangleClass triangle = new TriangleClass(30, 90, 60);
        String expected = "Scalene Triangle"; 
        String actual = triangle.getTriangleSides( );
	assertEquals(expected, actual);
    }
}