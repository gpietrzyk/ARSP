package Homework.Ex0801withBuilder.person;

public enum Sex {
    M("Male"),
    F("Female");

    private String description;

    Sex(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
