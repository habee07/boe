package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Laila on 11/10/2018.
 */
public class NoteInfoTest {

    private final NoteInfo TestNote = new NoteInfo("private","fail student","Lailaa");

    @Test
    public void testGetPriv() throws Exception {

        assertEquals(TestNote.getNotePriv(),"private");

    }

    @Test
    public void testGetNote() throws Exception {

        assertEquals(TestNote.getNotePub(),"fail student"); //test must fail

    }

}