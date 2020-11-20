package Lesson.L03.EX08;

import Lesson.L03.EX07.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise08Test {
    private Exercise08 exercise08;
    private Person person;
    private String expected;

    @BeforeEach
    void setUp() {
        exercise08 = new Exercise08();
        person = new Person("Robert", "Lewandowski", "90050147338");
        expected = "Robert Lewandowski 90050147338 30 01.05.1990 male";

    }

    @Test
    void stringOfChars() {
        assertEquals(exercise08.stringOfChars(person), expected);
    }
}