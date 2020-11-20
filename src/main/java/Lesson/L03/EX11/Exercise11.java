package Lesson.L03.EX11;

import Lesson.ContentOfEx;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise11 {

    public void speeches(String text) {
        char tab[] = text.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char token : tab) {
            if (map.containsKey(token)) map.put(token, (map.get(token).intValue() + 1));
            else map.put(token, 1);
        }

        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    public void solve () {
        System.out.println(ContentOfEx.L03_EX11);
        System.out.println();
        String exampleText = "Jurek Króciak, chodzi na siłownie";
        speeches(exampleText);
    }
}
