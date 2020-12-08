package Lesson.L08.EX01.person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonHelperTest {
    private PersonHelper personHelper;
    private List<Person> people;

    private static final String DATA1 = "Joanna;Surma;1995;F;Samsung;2008;Teacher;7000.0;Konstantynów;251;29;11-321;Warszawa;Polska";
    private static final String DATA2 = "Małgorzata;Nowak;1977;F;Apple;1961;Farmer;7203.0;Orkana;157;43;22-343;Wrocław;Polska";
    private static final String DATA3 = "Paweł;Surma;1983;M;Apple;1961;Manager;8488.0;Jaczewskiego;216;32;21-032;Bełżyce;Polska";

    private Person person1;
    private Person person2;
    private Person person3;

    @BeforeEach
    void setUp() {
        person1 = new Person("Joanna", "Surma", 1995, Sex.F, new Company("Samsung", 2008), "Teacher",
                7000.0, new Address("Konstantynów", "251", "29", "11-321", "Warszawa", "Polska"));
        person2 = new Person("Małgorzata", "Nowak", 1977, Sex.F, new Company("Apple", 1961), "Farmer",
                7203.0, new Address("Orkana", "157", "43", "22-343", "Wrocław", "Polska"));
        person3 = new Person("Paweł", "Surma", 1983, Sex.M, new Company("Apple", 1961),  "Manager",
                8488.0, new Address("Jaczewskiego", "216", "32", "21-032", "Bełżyce", "Polska"));

        people = Arrays.asList(person1, person2, person3);

        personHelper = new PersonHelper();
        personHelper.convertListOfStringsToListOfPeople(Arrays.asList(DATA1, DATA2, DATA3));
    }

    @Test
    void convertListOfStringsToListOfPeople() {
        assertArrayEquals(people.toArray(), personHelper.getPeople().toArray());
        assertEquals(people.get(2), personHelper.getPeople().get(2));
        assertNotEquals(people.get(1), personHelper.getPeople().get(2));
    }

}