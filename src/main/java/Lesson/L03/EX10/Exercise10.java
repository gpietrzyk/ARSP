package Lesson.L03.EX10;

import Lesson.ContentOfEx;

public class Exercise10 {
    public void charToAscii(String text) {
        char tab[] = text.toCharArray();
        for (char token:tab) {
            System.out.println(token + " : " + (int)token);
        }
    }
    public void solve(){
        System.out.println(ContentOfEx.L03_EX10);
        System.out.println();
        String exampleString = "Komputer";
        System.out.println("Example string : " + exampleString);
        charToAscii(exampleString);
    }
}
