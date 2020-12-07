package Lesson.L08.EX01.devices;

import Lesson.L08.EX01.person.Person;
import Lesson.L08.EX01.person.PersonHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileHelperTest {
    private FileHelper fileHelper;
    private FileHelper testFileHelper;
    private PersonHelper personHelper;
    private PersonHelper testPersonHelper;
    private List<Person> people;


    private static final String PERSON1 = "Grzegorz;Pietrzyk;1992;M;Samsung;1950;Programmer;10000.0;Dunikowskiego;8;10;24-200;Lublin;Polska";
    private static final String PERSON2 = "Andrzej;Pałka;1994;F;Coca-cola;1920;Driver;4000.0;Wierzchowiska;8;5;24-200;Wierzchowiska;Polska";
    private static final String PERSON3 = "Ferdek;Kiepski;1991;M;Samsung;1950;Nierób;10000.0;Żeromskiego;11;10;24-200;Bełżyce;Polska";

    @BeforeEach
    void setUp() {
        fileHelper = new FileHelper();
        testFileHelper = new FileHelper();
        personHelper = new PersonHelper();
        testPersonHelper = new PersonHelper();
        personHelper.convertListOfStringsToListOfPeople(Arrays.asList(PERSON1, PERSON2, PERSON3));
        people = personHelper.getPeople();
    }

    @Test
    void saveListToFileAndReadFromFile() throws IOException {
        fileHelper.saveListToFile(people);
        testFileHelper.readFromFile();
        testPersonHelper.convertListOfStringsToListOfPeople(testFileHelper.getPeople());
        assertArrayEquals(people.toArray(), testPersonHelper.getPeople().toArray());
    }
}