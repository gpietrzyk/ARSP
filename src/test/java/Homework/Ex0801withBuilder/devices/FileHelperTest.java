package Homework.Ex0801withBuilder.devices;

import Homework.Ex0801withBuilder.person.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileHelperTest {
    private FileHelper fileHelper;

    private static final String PERSON1 = "Andrzej;Pałka;1992;M;Kasjer;Biedronka;2000;3000;Wilczynskiego;78;4;24-200;Bełżyce;Polska";
    private static final String PERSON2 = "Patrycja;Zalewska;2000;F;Producent;Netflix;2010;9000;Lubelska;3;11;24-200;Bełżyce;Polska";

    @BeforeEach
    void setUp() {
        fileHelper = new FileHelper();
        fileHelper.add(createPerson(PERSON1));
        fileHelper.add(createPerson(PERSON2));
    }

    @Test
    void saveListToFile() throws IOException {
        String directoryPath = "src/test/resources/";
        fileHelper.saveListToFile(directoryPath + "savedPeople.txt");
        File testFile = new File(directoryPath + "testPeople.txt");
        File savedFile = new File(directoryPath + "savedPeople.txt");
        assertTrue(FileUtils.contentEquals(testFile, savedFile));
    }

    @Test
    void readFromFile() {
        FileHelper loadFromFile = new FileHelper();
        loadFromFile.readFromFile("src/test/resources/testPeople.txt");
        assertArrayEquals(fileHelper.getPeople().toArray(), loadFromFile.getPeople().toArray());
    }

    private Person createPerson(String personDescription) {
        String[] elements = personDescription.split(";");
        return new PersonBuilder()
                .setName(elements[0])
                .setSurname(elements[1])
                .setBornYear(Integer.parseInt(elements[2]))
                .setSex(createSex(elements[3]))
                .setJob(elements[4])
                .setCompany(new CompanyBuilder()
                        .setName(elements[5])
                        .setYear(Integer.parseInt(elements[6]))
                        .build())
                .setSalary(Double.parseDouble(elements[7]))
                .setAddress(new AddressBuilder()
                        .setStreet(elements[8])
                        .setFlatNo(elements[9])
                        .setHouseNo(elements[10])
                        .setPostalCode(elements[11])
                        .setCity(elements[12])
                        .setCountry(elements[13])
                        .build())
                .build();
    }

    private Sex createSex(String sexName) {
        Sex sex = null;
        List<Sex> sexes = Arrays.asList(Sex.values());
        for (Sex s : sexes) {
            if (s.toString().equals(sexName)) sex = s;
        }
        return sex;
    }
}