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
public class WelcomePageTest {
    
    public WelcomePageTest() {
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
     * Test of enter method, of class WelcomePage.
     */
    @Test
    public void testEnter() {
        System.out.println("enter");
        ViewChangeListener.ViewChangeEvent event = null;
        WelcomePage instance = new WelcomePage();
        instance.enter(event);

    }
    
}
