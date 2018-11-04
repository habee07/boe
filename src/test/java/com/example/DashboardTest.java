/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.vaadin.navigator.ViewChangeListener;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Craig
 */
public class DashboardTest {
    
    public DashboardTest() {
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

    /**
     * Test of addProfilePage method, of class Dashboard.
     */
    @Test
    public void testAddProfilePage() {
        System.out.println("addProfilePage");
        Dashboard instance = new Dashboard();
        instance.addProfilePage();
    }

    /**
     * Test of addDataView method, of class Dashboard.
     */
    
    /**@Test
    public void testAddDataView() {
        System.out.println("addDataView");
        Dashboard instance = new Dashboard();
        instance.addDataView();
    }
    */ 

    /**
     * Test of enter method, of class Dashboard.
     */
    /**@Test
    public void testEnter() {
        System.out.println("enter");
        ViewChangeListener.ViewChangeEvent event = null;
        Dashboard instance = new Dashboard();
        instance.enter(event);
    }
    */
    
}
