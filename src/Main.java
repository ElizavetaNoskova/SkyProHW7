import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] numbers2 = new double[3];
        numbers2[0] = 1.57;
        numbers2[1] = 7.654;
        numbers2[2] = 9.986;
        System.out.println(numbers2[2]);
        int[] numbers3 = new int[3];
        numbers3[0] = 6;
        numbers3[1] = 8;
        numbers3[2] = 14;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.println(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }

        }
        double[] numbers2 = new double[3];
        numbers2[0] = 1.57;
        numbers2[1] = 7.654;
        numbers2[2] = 9.986;
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.println(numbers2[i]);
            } else {
                System.out.print(numbers2[i] + ", ");
            }
        }
        int[] numbers3 = new int[3];
        numbers3[0] = 6;
        numbers3[1] = 8;
        numbers3[2] = 14;
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.println(numbers3[i]);
            } else {
                System.out.print(numbers3[i] + ", ");
            }

        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 2; i > 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(numbers[0]);
        double[] numbers2 = new double[3];
        numbers2[0] = 1.57;
        numbers2[1] = 7.654;
        numbers2[2] = 9.986;
        for (int i = 2; i > 0; i--) {
            System.out.print(numbers2[i] + ", ");
        }
        System.out.println(numbers2[0]);
        int[] numbers3 = new int[3];
        numbers3[0] = 6;
        numbers3[1] = 8;
        numbers3[2] = 14;
        for (int i = 2; i > 0; i--) {
            System.out.print(numbers3[i] + ", ");
        }
        System.out.println(numbers3[0]);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            } else {
                System.out.println(numbers[i] + 1);
            }
        }
    }
}