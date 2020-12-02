package Lesson.L08.devices;

import Lesson.L08.person.*;

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
        Person result = new Person();

        result.setName(sex == 1 ? SET_OF_MALE_NAMES[random.nextInt(SET_OF_MALE_NAMES.length)] : SET_OF_FEMALE_NAMES[random.nextInt(SET_OF_FEMALE_NAMES.length)]);
        result.setSex(sex == 1 ? Sex.M : Sex.F);
        result.setJob(SET_OF_JOBS[random.nextInt(SET_OF_JOBS.length)]);
        result.setSurname(SET_OF_SURNAMES[random.nextInt(SET_OF_SURNAMES.length)]);
        result.setBornYear(random.nextInt(41) + 1960);
        result.setSalary(random.nextInt(10000) + 2000.0);
        result.setCompany(generateCompany());
        result.setAddress(generateAddress());

        return result;
    }

    private Address generateAddress() {
        return new Address(SET_OF_STREETS[random.nextInt(SET_OF_STREETS.length)],
                String.valueOf(random.nextInt(300)),
                String.valueOf(random.nextInt(50)),
                SET_OF_POSTAL_CODES[random.nextInt(SET_OF_POSTAL_CODES.length)],
                SET_OF_CITIES[random.nextInt(SET_OF_CITIES.length)],
                SET_OF_COUNTRIES[random.nextInt(SET_OF_COUNTRIES.length)]);
    }

    private Company generateCompany() {
        return new Company(SET_OF_COMPANIES[random.nextInt(SET_OF_COMPANIES.length)],
                random.nextInt(70) + 1950);
    }
}
