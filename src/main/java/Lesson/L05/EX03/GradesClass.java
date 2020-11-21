package Lesson.L05.EX03;

import java.util.Arrays;
import java.util.Comparator;

public class GradesClass extends AbstractGradesClass {

    private void loadGrades() {
        grades = Constants.GRADES.replace(',', '.').split(" ");
    }

    private String minGrades() {
        Comparator mini = Comparator.comparing(Double::parseDouble);
        return Arrays.stream(grades)
                .min(mini)
                .orElse("empty")
                .toString();
    }

    private String maxGrades() {
        Comparator maxi = Comparator.comparing(Double::parseDouble);
        return Arrays.stream(grades)
                .max(maxi)
                .orElse("empty")
                .toString();
    }

    private void printGrades() {
        System.out.println("Grades: ");
        Arrays.stream(grades).forEach(grade -> System.out.print(grade + ", "));
        System.out.println();
        System.out.println();
        System.out.println("Min grades: " + minGrades());
        System.out.println("Max grades: " + maxGrades());

    }

    private void howMuchMinAndMax(){
        int min = (int) Arrays.stream(grades)
                .filter(grade -> grade.equals(minGrades()))
                .count();
        int max = (int) Arrays.stream(grades)
                .filter(grade -> grade.equals(maxGrades()))
                .count();

        System.out.println("Min grades occurs " + min + " times");
        System.out.println("Max grades occurs " + max + " times");
    }

    public void callGradesMethods(){
        loadGrades();
        printGrades();
        howMuchMinAndMax();
    }

}
