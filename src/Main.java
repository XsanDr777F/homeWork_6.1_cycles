public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_3_1();
        task_4();
        task_5();
        task_5_1();
        task_6();
        task_6_1();
        task_7();
        tak_8();
        tak_9();
        task_10();
        task_10_1();

    }

    public static void task_1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task_2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task_3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task_3_1() {
        System.out.println("Задача 3 (альтернатива)");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task_4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task_5() {
        System.out.println("задача 5");
        for (int y = 1904; y <= 2096; y++) {
            if (y % 4 == 0) {
                System.out.println(y + " год является высокостным");
            }
        }
    }

    public static void task_5_1() {
        System.out.println("задача 5 (доработка)");
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + " год является высокостным");
        }
    }

    public static void task_6() {
        System.out.println("Задача 6");
        for (int i = 1; i <= 98; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task_6_1() {
        System.out.println("Задача 6 (альтернатива)");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task_7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void tak_8() {
        System.out.println("Задача 8");

        int salary = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + salary; // не понтно как взаимодействует цикл (i) и сумма (total) спросить

            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void tak_9() {
        System.out.println("Задача 9");

        int salary = 29000;
        double total = 0;
        double percent = 0.012;

        for (int i = 1; i <= 12; i++) {
            total = (int) (total + (total * percent));
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task_10() {
        System.out.println("Задача 10");

        int a = 2;
        int s = 0;
        for (int i = 1; i < 11; i++) {
            s = s + 2;
            System.out.println("2*" + i + "=" + s);
        }
    }

    private static void task_10_1() {
        System.out.println("Задача 10 (Альтернатива 1)");

        for (int i = 1; i < 11; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }// не понятно как использовать умножение в цикле и две переменные, спросить
    }
}