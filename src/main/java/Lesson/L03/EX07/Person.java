package Lesson.L03.EX07;

import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private String pesel;
    private int age;
    private String bornDate;
    private String sex;

    public Person(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.bornDate = setBronAge();
        this.age = setAge();
        this.sex = setSex();
    }

    private String setBronAge() {

        if (Integer.parseInt(pesel.substring(0, 2)) >= 20)
            return new StringBuilder().append(pesel.substring(4,6))
                    .append(".")
                    .append(pesel.substring(2,4))
                    .append(".")
                    .append("19")
                    .append(pesel.substring(0,2))
                    .toString();
        else
            return new StringBuilder().append(pesel.substring(4,6))
                    .append(".")
                    .append(pesel.substring(2,4))
                    .append(".")
                    .append("20")
                    .append(pesel.substring(0,2))
                    .toString();

    }


    private int setAge() {
        String age [] =  setBronAge().split("\\.");
        int wynik = Math.abs(LocalDate.now().getYear() - Integer.parseInt(age[2]) - 1);
        if (Integer.parseInt(age[1]) < LocalDate.now().getMonthValue()) {
            wynik++;
        }
        else if(Integer.parseInt(age[1]) == LocalDate.now().getMonthValue()){
            if (Integer.parseInt(age[0]) <= LocalDate.now().getDayOfMonth()){
                wynik++;
            }
        }
        return wynik;
    }

    private String setSex() {
        if (name.endsWith("a")) return "female";
        else return "male";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                ", bornDate='" + bornDate + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public int getAge() {
        return age;
    }

    public String getBornDate() {
        return bornDate;
    }

    public String getSex() {
        return sex;
    }
}
