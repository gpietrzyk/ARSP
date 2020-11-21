package Lesson.L04.EX01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonReaderTest {
    private PersonReader personReader1;
    private PersonReader personReader2;
    private PersonHelper personHelper;
    private Person person1;
    private Person person2;
    private String path;

    private static final String PERSON1 = "adam                kowalski                      Konstantynów                  12   /1H  20-708        Lublin                    KUL                                   wykladowca informatyki";
    private static final String PERSON2 = "Jozek               Wojtowicz                     Bychawska                     10   /9   24-200        Bełżyce                   KUL                                   wykladowca informatyki";

    @BeforeEach
    void setUp() {
        personReader1 = new PersonReader();
        personReader2 = new PersonReader();
        personHelper = new PersonHelper();
        path = this.getClass().getResource("/dane.txt").getPath();
        personReader1.loadFromFile(path);

        person1 = personHelper.generatePerson(PERSON1);
        person2 = personHelper.generatePerson(PERSON2);
        personReader2.getPeople().add(person1);
        personReader2.getPeople().add(person2);
    }

    @Test
    void loadFromFile() {
        for (int i = 0; i < personReader2.getPeople().size(); i++) {
            assertEquals(personReader1.getPeople().get(i), personReader2.getPeople().get(i));
        }
    }
}