package Homework.Ex0801withBuilder.person;

public class CompanyBuilder {
    private String name;
    private int year;

    public CompanyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CompanyBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public Company build() {
        return new Company(name, year);
    }
}
