
package Lesson.L08.EX01.devices;

import Lesson.L08.EX01.person.Person;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileHelper {

    private static final String FILENAME = "peopleWithBuilder.txt";
    private LinkedList<String> people = new LinkedList<>();

    public LinkedList<String> getPeople() { return people; }

    public void saveListToFile(List<Person> people) throws IOException {
        File file = new File(FILENAME);
        if (!file.exists()) {
            file.createNewFile();
        }
        try {
            PrintWriter out = new PrintWriter(FILENAME);
            for (Person person : people) {
                savePersonToFile(out, person);
            }
            out.close();
            System.out.println("Data was saved!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void savePersonToFile(PrintWriter out, Person person) {
        out.print(person.getName());
        out.print(";");
        out.print(person.getSurname());
        out.print(";");
        out.print(person.getBornYear());
        out.print(";");
        out.print(person.getSex());
        out.print(";");
        out.print(person.getCompany().getName());
        out.print(";");
        out.print(person.getCompany().getYear());
        out.print(";");
        out.print(person.getJob());
        out.print(";");
        out.print(person.getSalary());
        out.print(";");
        out.print(person.getAddress().getStreet());
        out.print(";");
        out.print(person.getAddress().getFlatNo());
        out.print(";");
        out.print(person.getAddress().getHouseNo());
        out.print(";");
        out.print(person.getAddress().getPostalCode());
        out.print(";");
        out.print(person.getAddress().getCity());
        out.print(";");
        out.print(person.getAddress().getCountry());
        out.println();
    }

    public void readFromFile() {
        try {
            File file = new File(FILENAME);
            if(!file.exists())return;

            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILENAME));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                people.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

