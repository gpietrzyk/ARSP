package Lesson.L03.EX09;

import Lesson.L03.EX07.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise09Test {
    private Exercise09 exercise09;
    private List<Person> personList;
    private List<String> stringList;

    @BeforeEach
    void setUp() {
        exercise09 = new Exercise09();
        personList = new ArrayList<>();
        personList.add(new Person("Grażyna","Torbicka","64070900011"));
        personList.add(new Person("Tomasz", "Kamel", "73041134567"));
        personList.add(new Person("Adam", "Małysz", "80020200000"));
        personList.add(new Person("LeBron","James","84082512345"));
        exercise09.personToString(personList);
        stringList = new ArrayList<>();
        stringList.add("Grażyna Torbicka 64070900011 56 09.07.1964 female");
        stringList.add("Tomasz Kamel 73041134567 47 11.04.1973 male");
        stringList.add("Adam Małysz 80020200000 40 02.02.1980 male");
        stringList.add("LeBron James 84082512345 36 25.08.1984 male");
    }

    @Test
    void personToString() {
        assertEquals(exercise09.getPeople().getClass(), stringList.getClass());
        for (int i = 0; i < stringList.size(); i++) {
            assertEquals(stringList.get(i),exercise09.getPeople().get(i));
        }
    }
}