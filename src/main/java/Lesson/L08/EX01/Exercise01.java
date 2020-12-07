
package Lesson.L08.EX01;


import Lesson.L08.EX01.devices.DataGenerator;
import Lesson.L08.EX01.devices.FileHelper;
import Lesson.L08.EX01.devices.StatisticHelper;
import Lesson.L08.EX01.person.Person;
import Lesson.L08.EX01.person.PersonHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercise01 {
    private FileHelper fileHelper = new FileHelper();
    private DataGenerator dataGenerator = new DataGenerator();
    private PersonHelper personHelper = new PersonHelper();
    private Scanner scanner = new Scanner(System.in);


    public void solve() throws IOException {
        fileHelper.readFromFile();
        personHelper.convertListOfStringsToListOfPeople(fileHelper.getPeople());
        List<Person> people = personHelper.getPeople();
        List<Person> generate = new ArrayList<>();
        int option;
        boolean exit = false;
        StatisticHelper statisticHelper = new StatisticHelper(people);


        System.out.println("Hello, application has connected to the database!");

        while (!exit) {
            System.out.println("Please select task: ");
            System.out.println();
            System.out.println("1. Print data from the database: ");
            System.out.println("2. Print generated data: ");
            System.out.println("3. Generate data.");
            System.out.println("4. Delete generated data.");
            System.out.println("5. Delete data from the database.");
            System.out.println("6. Run StatisticHelper");
            System.out.println("7. Save the generated data to the database.");
            System.out.println("0. Exit.");

            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    if (people.isEmpty()) System.out.println("Database is empty!");
                    else {
                        people.stream()
                                .forEach(System.out::println);
                    }
                    System.out.println();
                    System.out.println("--------------------------------------------");
                    break;

                case 2:
                    if(generate.isEmpty()) System.out.println("No data generated!");
                    else {
                        generate.stream().forEach(System.out::println);
                    }
                    System.out.println();
                    System.out.println("--------------------------------------------");
                    break;

                case 3:
                    System.out.println("Enter the number of people:");
                    generate = dataGenerator.generatePeopleList(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println();
                    System.out.println("--------------------------------------------");
                    break;

                case 4:
                    if (generate.isEmpty()) System.out.println("No data generated!");
                    else {
                        generate.removeAll(generate);
                        System.out.println("Deleted data.");
                    }
                    System.out.println();
                    System.out.println("--------------------------------------------");
                    break;

                case 5:
                    if (people.isEmpty()) System.out.println("Database is empty.");
                    else {
                        people.removeAll(people);
                        System.out.println("Deleted data.");
                    }
                    fileHelper.saveListToFile(people);
                    System.out.println();
                    System.out.println("--------------------------------------------");
                    break;

                case 6:
                    statisticHelper.callStatisticHelperMethod();
                    System.out.println("--------------------------------------------");
                    break;

                case 7:
                    people.addAll(generate);
                    fileHelper.saveListToFile(people);
                    System.out.println("--------------------------------------------");
                    break;
                case 0:
                    exit = true;
                    System.out.println("Good Bye!");
            }
        }
    }
}

