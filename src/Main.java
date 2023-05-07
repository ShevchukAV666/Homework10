public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {

        System.out.println("Задача 1");

        String firstName = "Ivan"; //для хранения имени
                String middleName =  "Ivanovich"; //для хранения отчества
                String lastName = "Ivanov";   //для хранения фамилии
            String fullName =  lastName + ' ' + firstName + ' ' + middleName; // полное имя
        System.out.println(fullName);

        System.out.println();

    }
    public static void task2() {

        System.out.println("Задача 2");

        String fullName = "ivanov ivan ivanovich";

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " +fullName.toUpperCase());

        System.out.println();
    }
    public static void task3() {

        System.out.println("Задача 3");

        String fullName = "Иванов Семён Семёнович";

        fullName = fullName.replace('ё', 'e');

        System.out.println("Данные ФИО сотрудника — "+fullName);

        System.out.println();

    }
}

