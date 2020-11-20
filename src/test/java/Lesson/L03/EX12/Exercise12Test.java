package Lesson.L03.EX12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise12Test {
    private Exercise12 exercise12;
    private String password1;
    private String password2;
    private String password3;
    private String password4;
    private String ePassword1;
    private String ePassword2;
    private String ePassword3;
    private String ePassword4;

    @BeforeEach
    void setUp() {
        exercise12 = new Exercise12();
        password1 = "asdfg543";
        password2 = "malboroLight";
        password3 = "samsung!";
        password4 = "zegareK";
        ePassword1 = "asdfg543";
        ePassword2 = "lmLight";
        ePassword3 = "samsungsamsung";
        ePassword4 = "zegarek";
    }

    @Test
    void validator() {
        assertTrue(exercise12.validator(password1,ePassword1));
        System.out.println();
        System.out.println("---------------");
        System.out.println();
        assertFalse(exercise12.validator(password2,ePassword2));
        System.out.println();
        System.out.println("---------------");
        System.out.println();
        assertFalse(exercise12.validator(password3,ePassword3));
        System.out.println();
        System.out.println("---------------");
        System.out.println();
        assertFalse(exercise12.validator(password4,ePassword4));
    }
}