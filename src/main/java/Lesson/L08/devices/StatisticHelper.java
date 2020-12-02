package Lesson.L08.devices;


import Lesson.L08.person.Person;
import Lesson.L08.person.PersonHelper;
import Lesson.L08.person.Sex;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StatisticHelper {
    private List<Person> people;
    private FileHelper fileHelper = new FileHelper();
    private DataGenerator dataGenerator = new DataGenerator();
    private PersonHelper personHelper = new PersonHelper();
    private Scanner scanner = new Scanner(System.in);

    public StatisticHelper() {
        fileHelper.readFromFile();
        personHelper.convertListOfStringsToListOfPeople(fileHelper.getPeople());
        people = personHelper.getPeople();
    }


    public void printPeopleWhichWorkToOldestCompany() {
        Comparator<Person> comparator = Comparator.comparing(Person::getCompany);
        Person max = people.stream()
                .max(comparator)
                .orElse(null);

        people.stream()
                .filter(person -> person.getCompany().getYear() == max.getCompany().getYear())
                .forEach(System.out::println);

    }

    public int howMuchFemale() {
        return (int) people.stream()
                .filter(person -> person.getSex().equals(Sex.F))
                .count();
    }

    public int howMuchMale() {
        return (int) people.stream()
                .filter(person -> person.getSex().equals(Sex.M))
                .count();
    }

    public double calcAverageAge() {
        return Math.round(people.stream()
                .mapToInt(Person::getBornYear)
                .average()
                .getAsDouble());
    }

    public double calcAverageSalary() {
        return Math.round(people.stream()
                .mapToDouble(Person::getSalary)
                .average()
                .getAsDouble());
    }

    public double calcAverageSalaryOrderByMale(Sex sex) {
        return Math.round(people.stream()
                .filter(person -> person.getSex().equals(sex))
                .mapToDouble(Person::getSalary)
                .average()
                .getAsDouble());
    }

    public double earningsSpread(){
        double max =  people.stream()
                .mapToDouble(Person::getSalary)
                .max()
                .getAsDouble();
        double min = people.stream()
                .mapToDouble(Person::getSalary)
                .min()
                .getAsDouble();
        return max - min;
    }
}
