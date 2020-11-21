package Lesson.L03.EX12;

import Lesson.ContentOfEx;

public class Exercise12 {

    public boolean validator(String pass, String enteredPass) {
        if (pass.equals(enteredPass)) {
            print(pass, enteredPass, pass.length());
            System.out.println();
            System.out.println("Correct Password!");
            return true;
        } else {
            if (pass.length() == enteredPass.length()) {
                print(pass, enteredPass, pass.length());
                System.out.println();
                System.out.println("Wrong password!");
            } else {
                if (enteredPass.length() < pass.length()) {
                    print(pass, enteredPass, enteredPass.length());
                    for (int i = 0; i < pass.length(); i++) {
                        if (enteredPass.length() <= i) {
                            System.out.println("Position " + (i + 1)
                                    + " expected " + pass.charAt(i)
                                    + " received " + " no data");
                        }
                    }
                    System.out.println();
                    System.out.println("Password is too short\nPassword length expected " + pass.length() + " character");
                } else {
                    print(pass, enteredPass, pass.length());
                    for (int i = 0; i < enteredPass.length(); i++) {
                        if (pass.length() <= i) {
                            System.out.println("Position " + (i + 1)
                                    + " expected " + " no data "
                                    + " received " + enteredPass.length());
                        }
                    }
                    System.out.println();
                    System.out.println("Password is too long\nPassword length expected " + pass.length() + " character");
                }
            }
            return false;
        }
    }

    private void print(String pass, String enteredPass, int length) {
        for (int i = 0; i < length; i++) {
            System.out.println("Position " + (i + 1)
                    + " expected " + pass.charAt(i)
                    + " received " + enteredPass.charAt(i));
        }
    }

    public void solve() {
        System.out.println(ContentOfEx.L03_EX12);
        System.out.println();
        System.out.println("Password: qwerty123");
        System.out.println("Entered password: qwerty");
        System.out.println();
        System.out.println(validator("qwerty123", "qwerty"));
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
        System.out.println("Password: asdasd1");
        System.out.println("Entered password: asdasd1");
        System.out.println(validator("asdasd1", "asdasd1"));
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
        System.out.println("Password: coCacola");
        System.out.println("Entered password: cocacola");
        System.out.println();
        System.out.println(validator("coCacola", "cocacola"));
    }
}
