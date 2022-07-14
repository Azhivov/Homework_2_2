public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4122231L;

        float e = 5.1f;
        double f = 6.2;

        boolean bool = false;
        char g = 'g';
    }
    public static void task2(){
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;

        double total = firstBoxer + secondBoxer;
        double difference = Math.abs(firstBoxer - secondBoxer);

        System.out.println("Task2");
        System.out.println(" Общий вес " + total);
        System.out.println(" Разница в весе " + difference);
    }
    public static void task3(){
        int banana = 5;
        int bananWeght = 80;

        int milk = 200/100;
        int milkWeight = 105;

        int plombir = 2;
        int plombirWeight = 100;

        int egg = 4;
        int eggWeight = 70;

        int total = (banana * bananWeght) + (milk * milkWeight) + (plombir * plombirWeight) + (egg * eggWeight);
        int gransInKgs = 1000;
        double totalKgs = total/(gransInKgs*1.0);

        System.out.println("Task3");
        System.out.println(" Вес коктейля " + totalKgs);
    }
    public static void task4(){
        int weight = 7;
        int gransInKg = 1000;
        int weightInGrans = weight * gransInKg;

        int minGransPerDay = 250;
        int maxGranPerDay = 500;

        int minDay = weightInGrans / maxGranPerDay;
        int maxDay = weightInGrans / minGransPerDay;

        double avgDays = (minDay + maxDay) / (2*1.0);

        System.out.println("Task4");
        System.out.println(" Min" + minDay);
        System.out.println(" Max" + maxDay);
        System.out.println(" Avg" + avgDays);

    }
    public static void task5(){
        int percent = 10;
        double multiplier = percent/(100 * 0.1);

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int mashaNewSalary = (int) (mashaSalary + (mashaSalary * multiplier));
        int denisNewSalary = (int) (denisSalary + (denisSalary * multiplier));
        int karinaNewSalary = (int) (kristinaSalary + (kristinaSalary * multiplier));

        int  mashaDifference = (mashaNewSalary - mashaSalary) * 12;
        int denisDifference = (denisNewSalary - denisSalary) * 12;
        int kristinaDifference =  (karinaNewSalary - kristinaSalary) * 12;

        System.out.println("Task5");
        System.out.println(" Маша теперь поолучает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println(" Денис теперь поолучает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println(" Кристина теперь поолучает " + karinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");
    }
}
