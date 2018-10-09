/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author bt479917
 */
public class PanierTest {
    Panier pvide,p1,p2,pplein;
    Orange o1,o2;
    public PanierTest() {
    }

    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before 
    public void setUp() /*throws PanierPleinException*/{
        pvide = new Panier(4);
        p1 = new Panier(4);
        p2 = new Panier(4);
        pplein = new Panier(4);
        o1 = new Orange();
        o2 = new Orange("Espagne",0.50);
        p1.ajoute(o1);
        p2.ajoute(o1);
        p2.ajoute(o2);
        pplein.ajoute(o1);
        pplein.ajoute(o2);
        pplein.ajoute(o1);
        pplein.ajoute(o2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    @Test
    public void testEstPlein() {
        System.out.println("estPlein");
        boolean expResult = true;
        boolean result = pplein.estPlein();
        assertTrue(expResult == result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of estVide method, of class Panier.
     */
    @Test
    public void testEstVide() {
        System.out.println("estVide");
        boolean expResult = true;
        boolean result = pvide.estVide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of ajoute method, of class Panier.
     */
    @Test
    public void testAjoute() {
        System.out.println("ajoute");
        int expResult = 0;
        int result = p1.ajoute(o1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of retire method, of class Panier.
     */
    @Test
    public void testRetire() {
        System.out.println("retire");
        int expResult = 0;
        int result = p2.retire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrix method, of class Panier.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        double expResult = 0.0;
        double result = p1.getPrix();
        assert(expResult==result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of boycotteOrigine method, of class Panier.
     */
    @Test
    public void testBoycotteOrigine() {
        System.out.println("boycotteOrigine");
        String s = "";
        Panier instance = new Panier();
        int expResult = 0;
        int result = instance.boycotteOrigine(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Panier.
     */
    @Ignore
    @Test
    public void testToString() {
        System.out.println("toString");
        Panier instance = new Panier();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Panier.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Panier p = null;
        Panier instance = new Panier();
        boolean expResult = false;
        boolean result = instance.equals(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
