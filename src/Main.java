public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int apples = 3;
        System.out.println("Значение переменной apples с типом int равно "+apples+"");
        byte oranges = 5;
        System.out.println("Значение переменной bananas с типом byte равно "+oranges+"");
        short dogsWeight = 10;
        System.out.println("Значение переменной dogsWeight с типом short равно "+dogsWeight+" кг");
        long peoplesCount = 15000000L;
        System.out.println("Значение переменной cucumbers с типом long равно "+peoplesCount+"");
        float f = 3.5f;
        System.out.println("Значение переменной f с типом float равно "+f+"");
        double d = 5.66666666;
        System.out.println("Значение переменной d с типом double равно "+d+"");

        // Задание 2
        System.out.println("Задание 2");
        float v1 = 27.12f;
        long v2 = 987_678_965_549L;
        double v3 = 2.786;
        boolean v4 = false;
        char v5 = 569;
        short v6 = -159;
        int v7 = 27897;
        byte v8 = 67;

        // Задание 3
        System.out.println("Задание 3");
        int studentsInFirstClass = 23;
        int studentsInSecondClass = 27;
        int studentsInThirdClass = 30;
        int papersCount = 480;
        int papersPerStudent = papersCount / (studentsInFirstClass + studentsInSecondClass + studentsInThirdClass);
        System.out.println("На каждого ученика рассчитано "+papersPerStudent+" листов бумаги");

        // Задание 4
        System.out.println("Задание 4");
        int bottles = 10;
        int minutes = 2;
        int efficiencyPerMinutes = bottles/minutes;
        int twentyMinutes = 20;
        System.out.println("За "+twentyMinutes+" минут машина произвела бутылок "+efficiencyPerMinutes*twentyMinutes+" штук");
        int minutesInDay = 24*60;
        System.out.println("За "+minutesInDay+" минут машина поизвела бутылок "+efficiencyPerMinutes*minutesInDay+" штук");
        int minutesInThreeDays = 60*(24+24+24);
        System.out.println("За "+minutesInThreeDays+" минут машина поизвела бутылок "+efficiencyPerMinutes*minutesInThreeDays+" штук");
        int minutesInMonths = 10*minutesInThreeDays;
        System.out.println("За "+minutesInMonths+" минут машина произвела бутылок "+efficiencyPerMinutes*minutesInMonths+" штук");

        // Задание 5
        System.out.println("Задание 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans/(whiteCansPerClass+brownCansPerClass);
        int totalWhiteCans = totalClasses*whiteCansPerClass;
        int totalBrownCans = totalClasses*brownCansPerClass;
        System.out.println("В школе, где "+totalClasses+"  классов, нужно "+totalWhiteCans+" банок белой краски и "+totalBrownCans+" банок коричневой краски");

        // Задание 6
        System.out.println("Задание 6");
        float bananas = 5*80f;
        float milk = 105*2f;
        float eggs = 4*70f;
        float iceCreamSundae = 2*100f;
        float totalGrams = bananas+milk+eggs+iceCreamSundae;
        float totalKg = totalGrams/1000;
        System.out.println("Общий вес завтрака "+totalKg+" кг");

        // Задание 7
        System.out.println("Задание 7");
        int throwOffKg = 7;
        int throwOffGrams = throwOffKg*1000;
        int firstWeightGrams = 250;
        int secondWeightGrams = 500;
        int daysWithFirstCondition = throwOffGrams/firstWeightGrams;
        System.out.println(""+daysWithFirstCondition+" дней понадобится, если спортсмен будет терять в день по "+firstWeightGrams+" грамм");
        int daysWithSecondCondition = throwOffGrams/secondWeightGrams;
        System.out.println(""+daysWithSecondCondition+" дней понадобится, если спортсмен будет терять в день по "+secondWeightGrams+" грамм");
        int daysOnAverage = (daysWithFirstCondition+daysWithSecondCondition)/2;
        System.out.println("В среднем понадобится "+daysOnAverage+" день, чтобы добиться результата похудения");

        // Задание 8
        System.out.println("Задание 8");
        int salaryPerMonthMasha = 67760;
        int salaryPerMonthDenis = 83690;
        int salaryPerMonthChristina = 76230;
        int newSalaryPerMonthMasha = (salaryPerMonthMasha / 10) + salaryPerMonthMasha;
        int newSalaryPerMonthDenis = (salaryPerMonthDenis / 10) + salaryPerMonthDenis;
        int newSalaryPerMonthChristina = (salaryPerMonthChristina / 10) + salaryPerMonthChristina;
        int monthsInYear = 12;
        int salaryInYearMasha = (newSalaryPerMonthMasha*monthsInYear)-(salaryPerMonthMasha*monthsInYear);
        int salaryInYearDenis = (newSalaryPerMonthDenis*monthsInYear)-(salaryPerMonthDenis*monthsInYear);
        int salaryInYearChristina = (newSalaryPerMonthChristina*monthsInYear)-(salaryPerMonthChristina*monthsInYear);
        System.out.println("Маша теперь получает "+newSalaryPerMonthMasha+" рублей. Годовой доход вырос на "+salaryInYearMasha+" рублей");
        System.out.println("Денис теперь получает "+newSalaryPerMonthDenis+" рублей. Годовой доход вырос на "+salaryInYearDenis+" рублей");
        System.out.println("Кристина теперь получает "+newSalaryPerMonthChristina+" рублей. Годовой доход вырос на "+salaryInYearChristina+" рублей");

    }
}