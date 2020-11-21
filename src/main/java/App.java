
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Available exercises:");
        System.out.println("02 : 9 exercises  |  03 : 12 exercises   |   04 : 1 exercises   |   05 : 3 exercises");
        System.out.println();
        System.out.println("Enter the exercises number in the example format: '0201' \n");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        invokeMethod(data);
    }

    private static void invokeMethod(String className) throws Exception {

        String zadanie = new StringBuilder().append("Lesson ")
                .append(className.substring(0, 2))
                .append(": Exercise ")
                .append(className.substring(2, 4))
                .toString();

        String result = new StringBuilder().append("Lesson")
                .append(".")
                .append("L")
                .append(className.substring(0, 2))
                .append(".")
                .append("EX")
                .append(className.substring(2,4))
                .append(".")
                .append("Exercise")
                .append(className.substring(2,4))
                .toString();

        System.out.println();
        System.out.println(zadanie);

        Class<?> zad = Class.forName(result);
        Constructor<?> cons = zad.getDeclaredConstructor();
        Object obj = cons.newInstance(null);
        Method m = zad.getDeclaredMethod("solve");
        m.invoke(obj);
    }
}

