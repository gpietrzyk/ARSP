package Homework.Ex0801withBuilder.devices;

import Lesson.L08.EX01.devices.StatisticHelper;
import Lesson.L08.EX01.person.Person;
import Lesson.L08.EX01.person.PersonHelper;
import Lesson.L08.EX01.person.Sex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StatisticHelperTest {
    private List<Person> people;
    private Lesson.L08.EX01.devices.StatisticHelper statisticHelper;
    private PersonHelper personHelper;

    private static final String PERSON1 = "Joanna;Surma;1995;F;Samsung;2008;Teacher;7000.0;Konstantynów;251;29;11-321;Warszawa;Polska";
    private static final String PERSON2 = "Małgorzata;Jakas;1977;F;Apple;1961;Farmer;7203.0;Orkana;157;43;22-343;Warszawa;Polska";
    private static final String PERSON3 = "Małgorzata;Nowak;1977;F;Apple;1961;Farmer;7203.0;Orkana;157;43;22-343;Wrocław;Polska";
    private static final String PERSON4 = "Maria;Wójcik;1979;F;KUL;1989;Youtuber;11496.0;Wigilijna;197;11;20-000;Wrocław;Polska";
    private static final String PERSON5 = "Paweł;Surma;1983;M;Apple;1961;Manager;8488.0;Jaczewskiego;216;32;21-032;Bełżyce;Polska";

    @BeforeEach
    void setUp() {
        personHelper = new PersonHelper();
        personHelper.convertListOfStringsToListOfPeople(Arrays.asList(PERSON1, PERSON2, PERSON3, PERSON4, PERSON5));
        people = personHelper.getPeople();
        statisticHelper = new StatisticHelper(people);
    }

    @Test
    void peopleWhichWorkToOldestCompany() {
        assertEquals(Arrays.asList(people.get(1), people.get(2), people.get(4))
                , statisticHelper.peopleWhichWorkToOldestCompany());
    }

    @Test
    void howMuchFemale() {
        assertEquals(4, statisticHelper.howMuchFemale());
    }

    @Test
    void howMuchMale() {
        assertEquals(1, statisticHelper.howMuchMale());
    }

    @Test
    void calcAverageAge() {
        assertEquals(1982, statisticHelper.calcAverageAge());
    }

    @Test
    void calcAverageSalary() {
        assertEquals(8278, statisticHelper.calcAverageSalary());
    }

    @Test
    void calcAverageSalaryOrderByMale() {
        assertEquals(8488,statisticHelper.calcAverageSalaryOrderByMale(Sex.M));
        assertEquals(8226,statisticHelper.calcAverageSalaryOrderByMale(Sex.F));
    }

    @Test
    void earningsSpread() {
        assertEquals(4496,statisticHelper.earningsSpread());
    }

    @Test
    void averageSalaryByCities() {
        assertEquals(8488, statisticHelper.averageSalaryByCities().get("Bełżyce").doubleValue());
        assertEquals(9349.5, statisticHelper.averageSalaryByCities().get("Wrocław").doubleValue());
        assertEquals(7101.5, statisticHelper.averageSalaryByCities().get("Warszawa").doubleValue());
    }
}