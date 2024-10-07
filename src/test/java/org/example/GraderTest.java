package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineShouldReturnF(){
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void negativeOneShouldReturnIllegalArgumentException(){
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                ()-> {
                    grader.determineLetterGrade(-1);
                });
    }
}