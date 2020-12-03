package Lesson.L08.EX01.person;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private Sex sex;
    private int bornYear;
    private String job;
    private Company company;
    private double salary;
    private Address address;

    public Person() {
    }

    public Person(String name, String surname, int bornYear, Sex sex, Company company, String job, double salary, Address address) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.bornYear = bornYear;
        this.job = job;
        this.company = company;
        this.salary = salary;
        this.address = address;
    }

    public void printPerson() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Sex: " + sex.getDescription());
        System.out.println("Born year: " + bornYear);
        System.out.println("Job: " + job);
        System.out.println("Company: " + company.getName());
        System.out.println("Salary: " + salary);
        address.printAddress();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getBornYear() == person.getBornYear() &&
                Double.compare(person.getSalary(), getSalary()) == 0 &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getSurname(), person.getSurname()) &&
                getSex() == person.getSex() &&
                Objects.equals(getJob(), person.getJob()) &&
                Objects.equals(getCompany(), person.getCompany()) &&
                Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getSex(), getBornYear(), getJob(), getCompany(), getSalary(), getAddress());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                ", bornYear=" + bornYear +
                ", job='" + job + '\'' +
                ", company=" + company +
                ", salary=" + salary +
                ", address=" + address +
                '}';
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
