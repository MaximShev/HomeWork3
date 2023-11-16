public class Main {
    public static void main(String[] args) {
    ///Задача 1
        byte a = 12;
        short b = 3245;
        int c = 548378;
        long d = 5873485L;
        float e = 452.5458f;
        double f = 5483.484322862;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

    ///Задача 2
        float g = 27.12f;
        long h = 987678965549L;
        double i = 2.786;
        short j = 569;
        short k = -159;
        int l = 27897;
        byte m = 67;
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

    ///Задача 3
        byte classroomChildren1 = 23;
        byte classroomChildren2 = 27;
        byte classroomChildren3 = 30;
        short paper = 480;
        int paperToChildren = paper / (classroomChildren1 + classroomChildren2 + classroomChildren3);
        System.out.println("На каждого ученика рассчитано " + paperToChildren + " листов бумаги");

    ///Задача 4
        byte productivityIn2Minutes = 16;
        int productivityIn20Minutes = productivityIn2Minutes * 10;
        System.out.println("За 20 минут машина произвела " + productivityIn20Minutes + " штук бутылок");
        byte hoursOfDay = 24;
        int  minutesOfDay = hoursOfDay * 60;
        int productivityIn1Day = minutesOfDay / 2 * productivityIn2Minutes;
        System.out.println("За 1 день машина произвела " + productivityIn1Day + " штук бутылок");
        int productivityIn3Day = minutesOfDay * 3 / 2 * productivityIn2Minutes;
        System.out.println("За 3 дня машина произвела " + productivityIn3Day + " штук бутылок");
        short dayOfMonth = 30;
        int productivityIn1Month = dayOfMonth * minutesOfDay / 2 * productivityIn2Minutes;
        System.out.println("За 1 месяц машина произвела " + productivityIn1Month + " штук бутылок");

    ///Задача 5
        short whitePaintOnClassroom = 2;
        short brownPaintOnClassroom = 4;
        short allPaint = 120;
        int classroom = allPaint / (whitePaintOnClassroom + brownPaintOnClassroom);
        int whitePaint = whitePaintOnClassroom * classroom;
        int brownPaint = brownPaintOnClassroom * classroom;
        System.out.println("В школе, где " + classroom + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

    ///Задача 6
        short bananas = 5;
        short milk = 200;
        short iceCream = 2;
        short eggs = 4;
    ///Вес указан в граммах
        short weight1Bananas = 80;
        short weightMilkIn100Ml = 105;
        short weight1IceCream = 100;
        short weightEggs = 70;
        int allWeightInGrams = bananas * weight1Bananas + (milk / 100) * weightMilkIn100Ml + iceCream * weight1IceCream + eggs * weightEggs;
        System.out.println("Вес завтрака спортсмена " + allWeightInGrams + " грамм");
        short gramsOfKilogram = 1000;
        float allWeightInKilogram = (float) allWeightInGrams / gramsOfKilogram;
        System.out.println("Вес завтрака спортсмена " + allWeightInKilogram + " килограмм");

    ///Задача 7
        short KilogramInGrams = 1000;
        short weightLoss1 = 250;
        short weightLoss2 = 500;
        int resultWeightLoss = KilogramInGrams * 7;
        int dayForWeightLoss1 = resultWeightLoss / weightLoss1;
        System.out.println("Если каждый день сбрасывать " + weightLoss1 + " грамм веса, потребуется " + dayForWeightLoss1 + " дней");
        int dayForWeightLoss2 = resultWeightLoss / weightLoss2;
        System.out.println("Если каждый день сбрасывать " + weightLoss2 + " грамм веса, потребуется " + dayForWeightLoss2 + " дней");
        int meanDayOfWeightLoss = (dayForWeightLoss1 + dayForWeightLoss2) / 2;
        System.out.println("В среднем для похудения на " + resultWeightLoss + " грамм веса, потребуется " + meanDayOfWeightLoss + " день");

    ///Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int salaryIncreaseInPercent = 10;
        float newSalaryMasha = (float) salaryMasha * ((float) salaryIncreaseInPercent /100) + salaryMasha;
        float newSalaryDenis = (float) salaryDenis * ((float) salaryIncreaseInPercent/100) + salaryDenis;
        float newSalaryKristina = (float) salaryKristina * ((float) salaryIncreaseInPercent/100) + salaryKristina;
        byte monthOfYear = 12;
        long salaryMashaInYear = (long) salaryMasha * monthOfYear;
        long salaryDenisInYear = (long) salaryDenis * monthOfYear;
        long salaryKristinaInYear = (long) salaryKristina * monthOfYear;
        long newSalaryMashaInYear = (long) newSalaryMasha * monthOfYear;
        long newSalaryDenisInYear = (long) newSalaryDenis * monthOfYear;
        long newSalaryKristinaInYear = (long) newSalaryKristina * monthOfYear;
        long salaryIncreaseMashaInYear = newSalaryMashaInYear - salaryMashaInYear;
        long salaryIncreaseDenisInYear = newSalaryDenisInYear - salaryDenisInYear;
        long salaryIncreaseKristinaInYear = newSalaryKristinaInYear - salaryKristinaInYear;
        System.out.println("Зарплата Маши после повышения составит " + newSalaryMasha + " рублей. Годовой доход увеличится на " + salaryIncreaseMashaInYear + " рублей");
        System.out.println("Зарплата Дениса после повышения составит " + newSalaryDenis + " рублей. Годовой доход увеличится на " + salaryIncreaseDenisInYear + " рублей");
        System.out.println("Зарплата Кристины после повышения составит " + newSalaryMasha + " рублей. Годовой доход увеличится на " + salaryIncreaseKristinaInYear + " рублей");


    }
}