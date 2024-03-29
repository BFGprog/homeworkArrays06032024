public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");

        int[] arr1 = {20_000, 60_000, 18_000, 35_000, 110_000};
        double sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        sum = sum / 5.0 * 22; // 5 - средняя рабочая неделя; 22 - средний рабочий месяц
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        // Task 2
        System.out.println("Task 2");
        int arr1Min = arr1[0];
        int arr1Max = arr1[0];


        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < arr1Min) {
                arr1Min = arr1[i];
            }
            if (arr1[i] > arr1Max) {
                arr1Max = arr1[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + arr1Min + " рублей. " +
                "Максимальная сумма трат за неделю составила " + arr1Max + " рублей");


        // Task 2 (В месяц)
        System.out.println("Task 2 (Per month)");
        double arr1MinDouble = (double) arr1Min / 5.0 * 22;
        double arr1MaxDouble = (double) arr1Max / 5.0 * 22;

        System.out.println("Минимальная сумма трат за месяц составила " + arr1MinDouble + " рублей. " +
                "Максимальная сумма трат за месяц составила " + arr1MaxDouble + " рублей");


        // Task 3
        System.out.println("Task 3");
        double arr1Average = 0;

        arr1Average = (double) sum / arr1.length;

        System.out.println("Средняя сумма трат за месяц составила " + arr1Average + " рублей");


        // Task 4
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//        char temp;
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

//        for (int i = 0; i < reverseFullName.length / 2; i++) {
//            temp = reverseFullName[i];
//            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
//            reverseFullName[reverseFullName.length - i - 1] = temp;
//        }
//        for (int i = 0; i <reverseFullName.length; i++) {
//            System.out.print(reverseFullName[i]);
//        }



    }
}