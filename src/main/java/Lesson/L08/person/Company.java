package Lesson.L08.person;

import java.util.Objects;

public class Company implements Comparable<Company>{
    private String name;
    private int year;

    public Company() {
    }

    public Company(String name, int year) {
        this.name = name;
        this.year = year;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return getYear() == company.getYear() &&
                Objects.equals(getName(), company.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getYear());
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Company o) {
        return year < o.getYear()?1:-1;
    }
}
