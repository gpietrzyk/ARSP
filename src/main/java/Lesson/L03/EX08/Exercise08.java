package Lesson.L03.EX08;

import Lesson.ContentOfEx;
import Lesson.L03.EX07.Person;

public class Exercise08 {
    private static final Person PERSON = new Person("Jurek", "Dudek", "80050435873");

    public String stringOfChars(Person person) {
        return new StringBuilder().append(person.getName()).append(" ")
                .append(person.getSurname()).append(" ")
                .append(person.getPesel()).append(" ")
                .append(person.getAge()).append(" ")
                .append(person.getBornDate()).append(" ")
                .append(person.getSex())
                .toString();
        //nie do końca zrozumiałem polecenie i zrobiłem tak.
    }

    public void solve() {
        System.out.println(ContentOfEx.L03_EX08);
        System.out.println();
        System.out.println(stringOfChars(PERSON));
    }
}
