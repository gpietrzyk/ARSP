package Lesson.L04.EX01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonReader {
    private List<Person> people = new ArrayList<>();

    public PersonReader() {
    }

    public List<Person> getPeople() {
        return people;
    }

    public void loadFromFile(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            String line;
            Person person;

            while (scanner.hasNext()) {
                line = scanner.nextLine();
                person = new PersonHelper().generatePerson(line);
                people.add(person);
            }

            scanner.close();

        } catch (NumberFormatException e) {
            System.out.println("Baza jest pusta!");
        } catch (IOException e) {
            System.out.println("Dane nie zostaly wczytane");
        }
    }
}
