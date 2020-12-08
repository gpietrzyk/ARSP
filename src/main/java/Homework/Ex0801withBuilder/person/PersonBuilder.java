package Homework.Ex0801withBuilder.person;


public class PersonBuilder {
    private String name;
    private String surname;
    private Sex sex;
    private int bornYear;
    private String job;
    private Company company;
    private double salary;
    private Address address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setSex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public PersonBuilder setBornYear(int bornYear) {
        this.bornYear = bornYear;
        return this;
    }

    public PersonBuilder setJob(String job) {
        this.job = job;
        return this;
    }

    public PersonBuilder setCompany(Company company) {
        this.company = company;
        return this;
    }

    public PersonBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public PersonBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(name, surname, bornYear, sex, company, job, salary, address);
    }

}
