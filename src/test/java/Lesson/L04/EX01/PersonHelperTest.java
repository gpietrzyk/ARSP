package Lesson.L04.EX01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonHelperTest {
    private PersonHelper personHelper;
    private Person testPerson;

    @BeforeEach
    void setUp() {
        personHelper = new PersonHelper();
        testPerson = personHelper.generatePerson(Constants.DATA);
    }

    @Test
    void testGeneratePerson() {
        assertEquals(testPerson.getName(),"adam");
        assertEquals(testPerson.getSurname(),"kowalski");
        assertEquals(testPerson.getCompany(),"KUL");
        assertEquals(testPerson.getJob(),"wykladowca informatyki");
        assertEquals(testPerson.getAddress().getStreet(),"Konstantynów");
        assertEquals(testPerson.getAddress().getFlatNo(),"12");
        assertEquals(testPerson.getAddress().getCh(),"/");
        assertEquals(testPerson.getAddress().getHouseNo(),"1H");
        assertEquals(testPerson.getAddress().getPostalCode(), "20-708");
        assertEquals(testPerson.getAddress().getCity(), "Lublin");
    }
}