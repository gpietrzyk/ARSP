package Lesson.L04.EX01;

import Lesson.ContentOfEx;

public class Exercise01 {
    private String PATH = this.getClass().getResource("/dane.txt").getPath();
    public void solve() {
        System.out.println(ContentOfEx.L04_EX01);
        System.out.println();
        PersonReader personReader = new PersonReader();
        personReader.loadFromFile(PATH);
        personReader.getPeople().forEach(person -> person.printPerson());
    }
}
