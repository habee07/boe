package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Laila on 11/10/2018.
 */
public class CoursesTest {

    private final Courses C_Test = new Courses("Computer Science", 70.0, 0, "PAS", 2018, 36, "coms2000");

    //String coursename, double mainmark, double supplementaryMark, String result, int courseYear, int courseCredits, String codeOfCurse

    @Test
    public void testGetStrSupp() throws Exception {

        assertEquals(C_Test.getStrSupp(),"0.0");

    }


    @Test
    public void testGetCourseOutcome() throws Exception {

        assertEquals(C_Test.getCourseOutcome(),"PAS");

    }


    @Test
    public void testGetFinalMark() throws Exception {

        assertEquals(C_Test.getFinalMark(),70.00,2);

    }


    @Test
    public void testGetCourseName() throws Exception {

        assertEquals(C_Test.getCourseName(),"Computer Science");

    }

    @Test
    public void testGetYear() throws Exception {

        assertEquals(C_Test.getYear(),2018);

    }


    @Test
    public void testGetCourseCode() throws Exception {

        assertEquals(C_Test.getCourseCode(),"coms2000");

    }


    @Test
    public void testGetCredits() throws Exception {

        assertEquals(C_Test.getCredits(),36);

    }

    @Test
    public void testGetSuppMark() throws Exception {

        assertEquals(C_Test.getSuppMark(),0.0,2);

    }

}