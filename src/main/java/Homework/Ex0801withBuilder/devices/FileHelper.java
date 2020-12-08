package Homework.Ex0801withBuilder.devices;

import Homework.Ex0801withBuilder.person.*;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FileHelper {

    private LinkedList<Person> people = new LinkedList<>();

    public LinkedList<Person> getPeople() {
        return people;
    }

    public void add(Person person) {
        people.add(person);
    }

    public void saveListToFile(String filename) {
        try {
            File file = new File(filename);
            if (!file.exists()) {
                file.createNewFile();
            }

            PrintWriter out = new PrintWriter(file);
            out.println(people.size());
            for (Person person : people) {
                savePersonToFile(out, person);
            }
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void savePersonToFile(PrintWriter out, Person person) {
        out.println(person.getName());
        out.println(person.getSurname());
        out.println(person.getBornYear());
        out.println(person.getSex());
        out.println(person.getCompany().getName());
        out.println(person.getCompany().getYear());
        out.println(person.getJob());
        out.println(person.getSalary());
        out.println(person.getAddress().getStreet());
        out.println(person.getAddress().getFlatNo());
        out.println(person.getAddress().getHouseNo());
        out.println(person.getAddress().getPostalCode());
        out.println(person.getAddress().getCity());
        out.println(person.getAddress().getCountry());
    }

    public void readFromFile(String filename) {
        try {
            File file = new File(filename);
            if (!file.exists()) {
                System.out.println("Plik nie istnieje, operacja nieudana");
                people = null;
                return;
            }
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(file));

            String line = bufferedReader.readLine();
            int count = Integer.parseInt(line);

            for (int i = 0; i < count; i++) {
                readPersonFromFile(bufferedReader);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readPersonFromFile(BufferedReader bufferedReader) throws IOException {
        Person person = new PersonBuilder()
                .setName(bufferedReader.readLine())
                .setSurname(bufferedReader.readLine())
                .setBornYear(Integer.parseInt(bufferedReader.readLine()))
                .setSex(createSex(bufferedReader.readLine()))
                .setCompany(readCompanyFromFile(bufferedReader))
                .setJob(bufferedReader.readLine())
                .setSalary(Double.parseDouble(bufferedReader.readLine()))
                .setAddress(readAddressFromFile(bufferedReader))
                .build();
        people.add(person);
    }


    private Address readAddressFromFile(BufferedReader bufferedReader) throws IOException {
        return new AddressBuilder()
                .setStreet(bufferedReader.readLine())
                .setFlatNo(bufferedReader.readLine())
                .setHouseNo(bufferedReader.readLine())
                .setPostalCode(bufferedReader.readLine())
                .setCity(bufferedReader.readLine())
                .setCountry(bufferedReader.readLine())
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

    private Company readCompanyFromFile(BufferedReader bufferedReader) throws IOException {
        return new CompanyBuilder()
                .setName(bufferedReader.readLine())
                .setYear(Integer.parseInt(bufferedReader.readLine()))
                .build();
    }
}
