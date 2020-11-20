package Lesson.L03.EX09;

import Lesson.ContentOfEx;
import Lesson.L03.EX07.Person;
import Lesson.L03.EX08.Exercise08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise09 {
    private List<String> people;

    public List<String> getPeople() {
        return people;
    }

    public List<String> personToString(List<Person> list) {
        people = new ArrayList<>();
        Exercise08 exercise08 = new Exercise08();
        for (Person person : list) {
            people.add(exercise08.stringOfChars(person));
        }
        return people;
    }

    public void solve() {
        System.out.println(ContentOfEx.L03_EX09);
        System.out.println();
        List<Person> examplePeople = Arrays.asList(
                new Person("Józek", "Buzek", "02110290456"),
                new Person("Grzegorz", "Pietrzyk", "92110212473"),
                new Person("Travis", "Pastrana", "86121200234"),
                new Person("Zinedine", "Zidane", "78030244857")
        );

        System.out.println("Example person list: ");
        examplePeople.stream()
                .forEach(System.out::println);
        System.out.println();
        System.out.println("Converted person list to string: ");
        personToString(examplePeople).stream()
                .forEach(System.out::println);

    }
}
