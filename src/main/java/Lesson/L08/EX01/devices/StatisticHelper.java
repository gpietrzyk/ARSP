package Lesson.L08.EX01.devices;


import Lesson.L08.EX01.person.Person;
import Lesson.L08.EX01.person.Sex;

import java.util.*;
import java.util.stream.Collectors;

public class StatisticHelper {
    private List<Person> people;

    public StatisticHelper(List<Person> people) {
        this.people = people;
    }

    public List<Person> peopleWhichWorkToOldestCompany() {
        Comparator<Person> comparator = Comparator.comparing(Person::getCompany);
        Person max = people.stream()
                .max(comparator)
                .orElse(null);

        return people.stream()
                .filter(person -> person.getCompany().getYear() == max.getCompany().getYear())
                .collect(Collectors.toList());
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

    public double earningsSpread() {
        double max = people.stream()
                .mapToDouble(Person::getSalary)
                .max()
                .getAsDouble();
        double min = people.stream()
                .mapToDouble(Person::getSalary)
                .min()
                .getAsDouble();
        return max - min;
    }

    public Map<String, Double> averageSalaryByCities() {
        Map<String, List<Double>> avgSalaryByCities = people.stream()
                .collect(Collectors.toMap(p -> p.getAddress().getCity(), p -> Collections.singletonList(p.getSalary()),
                        (a, b) -> {
                            List<Double> union = new ArrayList<>(a);
                            union.addAll(b);
                            return union;
                        })
                );

        return avgSalaryByCities.entrySet()
                .stream()
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()
                        .stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .getAsDouble())
                );
    }

    public void callStatisticHelperMethod() {
        System.out.println("Employees working in Oldest Company:");
        peopleWhichWorkToOldestCompany().stream().forEach(System.out::println);
        System.out.println();
        System.out.println("How much female: " + howMuchFemale());
        System.out.println("How much male: " + howMuchMale());
        System.out.println("Average age: " + calcAverageAge());
        System.out.println("Earnings spread: " + earningsSpread());
        System.out.println("Average salary: " + calcAverageSalary());
        System.out.println("Average salary by male: " + calcAverageSalaryOrderByMale(Sex.M));
        System.out.println("Average salary by female: " + calcAverageSalaryOrderByMale(Sex.F));
        System.out.println();
        System.out.println("Average salary by cities:");
        averageSalaryByCities().forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println();
    }
}
