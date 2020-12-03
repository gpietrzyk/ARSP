
package Lesson.L08.EX01;


import Lesson.L08.EX01.devices.DataGenerator;
import Lesson.L08.EX01.devices.FileHelper;
import Lesson.L08.EX01.devices.StatisticHelper;
import Lesson.L08.EX01.person.Person;
import Lesson.L08.EX01.person.PersonHelper;

import java.io.IOException;
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
        List<Person> generate;
        String enter;
        boolean exit = false;
        StatisticHelper statisticHelper = new StatisticHelper();


        System.out.println("Witam, program połączył się z bazą danych i wczytał listę ludzi");

        do {

            System.out.println("Proszę wybrać odpowiedni zadania: ");
            System.out.println("1. Wydrukuj pobrane dane: ");
            System.out.println("2. Podając liczbe wygeneruj podaną ilość osób.");
            System.out.println("3. Usuń wygerenwane dane.");
            System.out.println("4. Usuń dane z bazy danych.");
            System.out.println("5. StatisticHelper");
            System.out.println("6. Zapisz wygenerowane dane do bazy danych oraz.");

            enter = scanner.nextLine();

            switch (enter) {
                case "1":
                    people.stream()
                            .forEach(System.out::println);
                    break;

                case "2":
                    System.out.println("poodaj liczbe os:");
                    generate = dataGenerator.generatePeopleList(scanner.nextInt());
                    generate.stream().forEach(System.out::println);
                    break;

                case "5":
                    statisticHelper.printPeopleWhichWorkToOldestCompany();
                    System.out.println(statisticHelper.howMuchFemale());
                    System.out.println(statisticHelper.calcAverageAge());
                    System.out.println(statisticHelper.earningsSpread());
                    statisticHelper.averageSalaryByCities();

                    break;
            }

        } while (exit);
    }
}
