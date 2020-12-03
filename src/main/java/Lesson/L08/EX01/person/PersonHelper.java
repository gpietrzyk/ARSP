package Lesson.L08.EX01.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonHelper {
    private List<Person> people;

    public PersonHelper() {
        this.people = new ArrayList<>();
    }

    public List<Person> getPeople() {
        return people;
    }

    public void convertListOfStringsToListOfPeople(List<String> list) {
        for (String data : list) {
            people.add(convertStringToPerson(data));
        }
    }

    private Person convertStringToPerson(String data) {
        String result[] = data.split(";");
        return new Person(result[0],
                result[1],
                Integer.parseInt(result[2]),
                createSex(result[3]),
                createCompany(result[4], Integer.parseInt(result[5])),
                result[6],
                Double.parseDouble(result[7]),
                createAddress(result[8], result[9], result[10], result[11], result[12], result[13])
        );
    }


    private Sex createSex(String sexName) {
        Sex sex = null;
        List<Sex> sexes = Arrays.asList(Sex.values());
        for (Sex s : sexes) {
            if (s.toString().equals(sexName)) sex = s;
        }
        return sex;
    }

    private Address createAddress(String street, String flatNo, String houseNo, String postalCode, String city, String country) {
        return new Address(street, flatNo, houseNo, postalCode, city, country);
    }

    private Company createCompany(String name, int year) {
        return new Company(name, year);
    }
}
