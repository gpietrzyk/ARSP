package Homework.Ex0801withBuilder.devices;

import Homework.Ex0801withBuilder.person.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {
    private Random random;

    private static final String SET_OF_MALE_NAMES[] = {"Andrzej", "Grzegorz", "Izydor", "Paweł", "Robert", "Kamil", "Damian"};
    private static final String SET_OF_FEMALE_NAMES[] = {"Anna", "Joanna", "Małgorzata", "Sara", "Maria", "Ewa"};
    private static final String SET_OF_SURNAMES[] = {"Nowak", "Wójcik", "Kowal", "Surma", "Styżej", "Wójtwowicz", "Kliczka"};
    private static final String SET_OF_JOBS[] = {"Programmer", "Desinger", "Footballer", "Manager", "Farmer", "Driver", "Youtuber", "Mechanic", "Teacher"};
    private static final String SET_OF_COMPANIES[] = {"Samsung", "Apple", "Dell", "Coca-cola", "Youtube", "KUL", "ATEST", "Agata Meble"};
    private static final String SET_OF_STREETS[] = {"Bychawska", "Jaczewskiego", "Konstantynów", "Aleja Krasnicka", "Orkana", "Armii Krajowej", "Wigilijna", "Kryształowa"};
    private static final String SET_OF_CITIES[] = {"Lublin", "Warszawa", "Wrocław", "Poznań", "Kraków", "Bełżyce"};
    private static final String SET_OF_POSTAL_CODES[] = {"24-200", "20-000", "21-032", "22-000", "22-343", "54-321", "11-321", "02-222"};
    private static final String SET_OF_COUNTRIES[] = {"Polska"};

    public DataGenerator() {
        this.random = new Random();
    }

    public List<Person> generatePeopleList(int n) {
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(generatePerson());
        }
        return result;
    }

    private Person generatePerson() {
        int sex = random.nextInt(2);
        return new PersonBuilder()
                .setName(sex == 1 ? SET_OF_MALE_NAMES[random.nextInt(SET_OF_MALE_NAMES.length)] : SET_OF_FEMALE_NAMES[random.nextInt(SET_OF_FEMALE_NAMES.length)])
                .setSex(sex == 1 ? Sex.M : Sex.F)
                .setJob(SET_OF_JOBS[random.nextInt(SET_OF_JOBS.length)])
                .setSurname(SET_OF_SURNAMES[random.nextInt(SET_OF_SURNAMES.length)])
                .setBornYear(random.nextInt(41) + 1960)
                .setSalary(random.nextInt(10000) + 2000.0)
                .setCompany(generateCompany())
                .setAddress(generateAddress())
                .build();
    }

    private Address generateAddress() {
        return new AddressBuilder()
                .setStreet(SET_OF_STREETS[random.nextInt(SET_OF_STREETS.length)])
                .setFlatNo(String.valueOf(random.nextInt(300)))
                .setHouseNo(String.valueOf(random.nextInt(50)))
                .setPostalCode(SET_OF_POSTAL_CODES[random.nextInt(SET_OF_POSTAL_CODES.length)])
                .setCity(SET_OF_CITIES[random.nextInt(SET_OF_CITIES.length)])
                .setCountry(SET_OF_COUNTRIES[random.nextInt(SET_OF_COUNTRIES.length)])
                .build();
    }

    private Company generateCompany() {
        return new CompanyBuilder()
                .setName(SET_OF_COMPANIES[random.nextInt(SET_OF_COMPANIES.length)])
                .setYear(random.nextInt(70) + 1950)
                .build();
    }
}