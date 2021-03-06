import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws IOException {
      String data = "";
        final int range[] = {9, 12, 1, 3};

        do {
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println("Available exercises:");
            System.out.println("02 : 9 exercises  |  03 : 12 exercises   |   04 : 1 exercises   |   05 : 3 exercises");
            System.out.println();
            System.out.println("Enter the exercises number in the example format: '0201' or 'end' to quit. \n");
            Scanner scanner = new Scanner(System.in);
            data = scanner.nextLine();

            try {
                Integer.parseInt(data.substring(2, 4));
                Integer.parseInt(data.substring(0, 2));
            } catch (Exception e) {
                if(!data.equals("end")) {
                    System.out.println("Entered data is wrong");
                    System.out.println("Enter available exercise data!\n");
                    continue;
                }
            }

            invokeMethod(data);
            System.out.println();
        } while (!data.equalsIgnoreCase("end"));
    }

    private static void invokeMethod(String className) {
        if (className.equalsIgnoreCase("end")) {
            System.out.println("Good Bye!");
            return;
        }

        String exercise = new StringBuilder().append("Lesson ")
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
                .append(className.substring(2, 4))
                .append(".")
                .append("Exercise")
                .append(className.substring(2, 4))
                .toString();

        try {
            Class<?> ex = Class.forName(result);
            Constructor<?> cons = ex.getDeclaredConstructor();
            Object obj = cons.newInstance(null);
            Method m = ex.getDeclaredMethod("solve");
            System.out.println("\n" + exercise);
            System.out.println("-----------------------------");
            m.invoke(obj);
        } catch (Exception e) {
            System.out.println("Entered data is wrong");
            System.out.println("Enter available exercise data!");
            System.out.println();
        }
    }
}

