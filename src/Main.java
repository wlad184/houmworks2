public class Main {
    public static void main(String[] args) {

        //task 1
        byte byte_ = -128;
        short short_ = 32767;
        int int_ = -2147483648;
        long long_ = 9223372036854775807L;
        float float_ = -3.4E+38f;
        double double_ = 1.7E+308;
        char char_ = 65535;
        boolean boolean_ = true;

        System.out.println("Значение переменной byte_ с типом byte равно " + byte_);
        System.out.println("Значение переменной short_ с типом short равно " + short_);
        System.out.println("Значение переменной int_ с типом int равно " + int_);
        System.out.println("Значение переменной long_ с типом long равно " + long_);
        System.out.println("Значение переменной float_ с типом float равно " + float_);
        System.out.println("Значение переменной double_ с типом double равно " + double_);
        System.out.println("Значение переменной char_ с типом char равно " + char_);
        System.out.println("Значение переменной boolean_ с типом boolean равно " + boolean_);
        System.out.println();

        //task 2
         float a = 27.12f;
         long b = 987678965549L;
         byte c = 2;
         int d = 786;
         boolean e = false;
         short f = 569;
         double g = -159;
         var h = 27897;
         char i = 67;
         System.out.println("" + a + b + c + d + e + f + g + h + i);

         //task 3
        int students1 = 23;
        int students2 = 27;
        int students3 = 30;
        int totalSheets = 480;
        int totalStudents = students1 + students2 + students3;
        int sheetsStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsStudent + " листов бумаги");
        System.out.println();

        //task 4
        int bottles = 16;
        int time = 2;
        int performBottles = bottles / time;
        int perform20minutes = performBottles * 20;
        int perform1day = performBottles * 60 * 24;
        int perform3day = perform1day * 3;
        int perform30day = perform3day * 10;
        System.out.println("За 20 минут машины произвела бутылок " + perform20minutes +" штук" );
        System.out.println("За сутки машина произвела бутылок " + perform1day +" штук" );
        System.out.println("За 3 дня машина произвела бутылок " + perform3day +" штук" );
        System.out.println("За месяц машина произвела бутылок " + perform30day +" штук" );
        System.out.println();

        //task 5
        int totalCans = 120;
        int oneClassWhiteCans = 2;
        int oneClassBrownCans = 4;
        int oneClassCans = oneClassWhiteCans + oneClassBrownCans;
        int totalClass = totalCans / oneClassCans;
        int totalOneClassWhiteCans = oneClassWhiteCans * totalClass;
        int totalOneClassBrownCans = oneClassBrownCans * totalClass;
        System.out.println("В школе, где " + totalClass +" классов, нужно " + totalOneClassWhiteCans + " банок белой краски и " + totalOneClassBrownCans +" банок коричневой краски");
        System.out.println();

        //task 6
         int bananas = 5;
          int weightOneBananas = 80;
         int milk = 200;
          int weight100mlMilk = 105;
          int weight1mlMilk = weight100mlMilk / 100;
         int plumber = 2;
          int wightOneBriquette = 100;
         int eggs = 4;
          int wightOneEggs = 70;
         float totalWightProductsGr = (float)(bananas * weightOneBananas + milk * weight1mlMilk + plumber * wightOneBriquette + eggs * wightOneEggs);
         float totalWightProductsKg = totalWightProductsGr / 1000;
         System.out.println("Общий вес спорт-завтрака " + totalWightProductsKg + " кг");
         System.out.println();

          //task 7
        int weightLossKg = 7;
        int weightLossGr = weightLossKg * 1000;
        int weightLossOneDay250 = 250;
        int weightLossOneDay500 = 500;
        int daysWeightLossAt250 = weightLossGr / weightLossOneDay250;
        int daysWeightLossAt500 = weightLossGr / weightLossOneDay500;
        int averageDaysWeightLoss = (daysWeightLossAt250 + daysWeightLossAt500) / 2;
        System.out.println("При похудении в день на 250 гр уйдёт " + daysWeightLossAt250 + " дней");
        System.out.println("При похудении в день на 500 гр уйдёт " + daysWeightLossAt500 + " дней");
        System.out.println("В средем на похудение уйдёт  " + averageDaysWeightLoss + " дней");
        System.out.println();

        //task 8
        int salariesMasha = 67760;
        int salariesDenis = 83690;
        int salariesKristina =76230;
        double salariesMashaIndex = salariesMasha * 1.1;
        double salariesDenisIndex = salariesDenis * 1.1;
        double salariesKristinaIndex = salariesKristina * 1.1;
        int salariesMashaYear = salariesMasha * 12;
        int salariesDenisYear = salariesDenis * 12;
        int salariesKristinaYear = salariesKristina * 12;
        double salariesMashaIndexYear = salariesMashaIndex * 12;
        double salariesDenisIndexYear = salariesDenisIndex * 12;
        double salariesKristinaIndexYear = salariesKristinaIndex * 12;
        double difSalariesMashaYear = salariesMashaIndexYear - salariesMashaYear;
        double difSalariesDenisYear = salariesDenisIndexYear - salariesDenisYear;
        double difSalariesKristinaYear = salariesKristinaIndexYear - salariesKristinaYear;
        System.out.println("Маша теперь получает " + salariesMashaIndex + " рублей. Годовой доход вырос на " + difSalariesMashaYear + " рублей");
        System.out.println("Денис теперь получает " + salariesDenisIndex + " рублей. Годовой доход вырос на " + difSalariesDenisYear + " рублей");
        System.out.println("Кристина теперь получает " + salariesKristinaIndex + " рублей. Годовой доход вырос на " + difSalariesKristinaYear + " рублей");



    }
}