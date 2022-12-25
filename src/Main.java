import java.util.Arrays;
import java.util.List;

public class Main {
    enum Colors {
        RED,
        BLUE,
        YELLOW,
        GREEN
    }

    public static void main(String[] args) {
        {
            List<String> list = Arrays.asList("C", "C++", "Java");

            // 1. Print list using for-loop
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

            // 2. Print list using enhanced for-loop
            for (String s : list) {
                System.out.println(s);
                int nums[] = {2, 4, 6, 8, 10, 12, 14};// инициализируем одномерный массив nums

                for (int i = 0; i < nums.length; i++) {
                    String strToPrint = "nums[" + i + "]=" + nums[i];
                    System.out.println(strToPrint);
                }
                for (int d : nums) {// расширенный цикл for
                    System.out.println(d);
                }
                Colors red = Colors.RED;

                System.out.println(red);
            }

        }
    }
}