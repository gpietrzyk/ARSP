package Lesson.L04.EX01;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private Address address;
    private String company;
    private String job;

    public Person() {
        address = new Address();
    }


    public Person(String name, String surname, Address address, String company, String job) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.company = company;
        this.job = job;
    }

    public void printPerson() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Company : " + company);
        System.out.println("Job : " + job);
        address.printAddress();
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) &&
                Objects.equals(getSurname(), person.getSurname()) &&
                Objects.equals(getAddress(), person.getAddress()) &&
                Objects.equals(getCompany(), person.getCompany()) &&
                Objects.equals(getJob(), person.getJob());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getAddress(), getCompany(), getJob());
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
