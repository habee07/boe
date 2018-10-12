package com.example;

import junit.framework.TestCase;
import org.junit.Test;

public class StudentHistoryTest extends TestCase {
    public final StudentHistory SH_Test = new StudentHistory(2017, "3rd","SB000","Pass", "Graduate",75,144,144);
    public void testGetYear() {
        assertEquals(SH_Test.getYear(),2017);
    }

    public void testGetYos() {
        assertEquals(SH_Test.getYos(),"3rd");
    }

    public void testGetEnrolledCredits() {
        assertNotNull("Object not null",SH_Test);
        assertEquals(SH_Test.getEnrolledCredits(),144);
    }

    public void testGetAchievedCredits() {
        assertEquals(SH_Test.getAchievedCredits(),144);
    }

    @Test
    public void testGetYear1() throws Exception {

    }

    @Test
    public void testSetYear() throws Exception {

    }

    @Test
    public void testGetYos1() throws Exception {

    }

    @Test
    public void testSetYos() throws Exception {

    }

    @Test
    public void testGetProgramCode() throws Exception {

    }

    @Test
    public void testSetProgramCode() throws Exception {

    }

    @Test
    public void testGetYearOutcome() throws Exception {

    }

    @Test
    public void testSetYearOutcome() throws Exception {

    }

    @Test
    public void testGetOutcomeDescription() throws Exception {

    }

    @Test
    public void testSetOutcomeDescription() throws Exception {

    }

    @Test
    public void testGetAverageMarks() throws Exception {

    }

    @Test
    public void testSetAverageMarks() throws Exception {

    }

    @Test
    public void testGetEnrolledCredits1() throws Exception {

    }

    @Test
    public void testSetEnrolledCredits() throws Exception {

    }

    @Test
    public void testGetAchievedCredits1() throws Exception {

    }

    @Test
    public void testSetAchievedCredits() throws Exception {

    }
}
