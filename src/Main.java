public class Main
    {  public static void main(String[] args){
        System.out.println("Задача1");
        int cat= 130;
        System.out.println("Значение переменной cat с типом int равно"+cat );
        byte dog= 30;
        System.out.println("Значение переменной byte с типом int равно"+dog);
        short binanceEth= 1644;
        System.out.println("Значение переменной short с типом int равно"+binanceEth);
        long bybitBtc=860000000;
        System.out.println("Значение переменной long с типом int равно"+bybitBtc);
        float apple= 2.1f;
        System.out.println("Значение переменной float с типом int равно"+apple);
        double cucumber= 3.57676;
        System.out.println("Значение переменной double с типом int равно"+cucumber);
        System.out.println("Задача2");
        float a= (float)27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c= 2.786;
        System.out.println(c);
        short d= 569;
        System.out.println(d);
        int e = -159;
        System.out.println(e);
        long g= 27897L;
        System.out.println(g);
        byte h= 67;
        System.out.println(h);
        System.out.println("Задача3");
        byte classA= 23;
        short classB= 27;
        int classC=30;
        int allSt= classA+classB+classC;
        System.out.println("Всего учеников"+allSt);
        long allP= 480;
        long everySt = allP/ allSt;
        System.out.println("На каждого ученика рассчитано"+everySt+"бумаги");
        System.out.println("Задача4");
        byte minutes=2;
        System.out.println(minutes);
        short bottle= 16;
        System.out.println(bottle);
        byte extraTimeA=20;
        System.out.println(extraTimeA);
        int extraTimeB= 72 * extraTimeA;
        int extraTimeC= 3* extraTimeB;
        long extraTimeD= 10* extraTimeC;
        System.out.println(extraTimeB);
        System.out.println(extraTimeC);
        System.out.println(extraTimeD);
        int totallyA= bottle *10;
        int totallyB= totallyA * 72;
        int totallyC= totallyB *3;
        long totallyD= totallyC *10;
        System.out.println("За 20 минут машина произвела"+totallyA+"штук бутылок");
        System.out.println("За сутки машина произвела"+totallyB+"штук бутылок");
        System.out.println("За 3 дня машина произвела"+totallyC+"штук бутылок");
        System.out.println("За месяц машина произвела"+totallyD+"штук бутылок");
        System.out.println("Задача5");
        byte paint= 120;
        byte white= 2;
        byte brow= 4;
        System.out.println(paint);
        System.out.println(white);
        System.out.println(brow);
        int oneClass= white + brow;
        System.out.println(oneClass);
        int room= paint / oneClass;
        System.out.println(room);
        int whAllSchool= room * white;
        int brAllSchool= room * brow;
        System.out.println(whAllSchool);
        System.out.println(brAllSchool);
        System.out.println("В школе ,где 20 классов,нужно"+whAllSchool+"банок белой краски и"+brAllSchool+"банок коричневой краски");
        System.out.println("Задача6");
        byte bananas=5;
        byte oneBanana= 80;
        int milk= 200;
        int oneMilk= 105;
        byte ice= 2;
        int icePortion= 100;
        byte egg= 4;
        int oneEgg= 70;
        int allBananas= bananas * oneBanana;
        System.out.println(allBananas);
        int allMilk= oneMilk* 2;
        System.out.println(allMilk);
        int allIce= ice* icePortion;
        System.out.println(allIce);
        int allEgg= egg* oneEgg;
        System.out.println(allEgg);
        int oneCoc= allBananas+allMilk+allIce+allEgg;
        System.out.println(oneCoc);
        float forKg= (float)oneCoc / 1000;
        System.out.println(forKg);
        System.out.println("Задача7");
        int goalOne= 250;
        int goalTwo= 500;
        int must = 7;
        int totallyGramm= must * 1000;
        System.out.println(totallyGramm);
        int forGoalOne= totallyGramm / goalOne;
        System.out.println(forGoalOne);
        int fotGoalTwo= totallyGramm / goalTwo;
        System.out.println(fotGoalTwo);
        System.out.println("Задача8");
        int masha= 67760;
        int denis= 83690;
        int christina= 76230;
        int totally= 100;
        float forYear= 10f / totally;
        System.out.println(forYear);
        float mashaYear= masha * forYear;
        System.out.println(mashaYear);
        float denisYear= denis * forYear;
        System.out.println(denisYear);
        float christinaYear= christina * forYear;
        System.out.println(christinaYear);
        float mashaNew= mashaYear+masha;
        System.out.println("Маша теперь получает"+ mashaNew +"рублей.Годовой доход вырос на"+mashaYear +"рублей");
        float denisNew= denisYear+denis;
        System.out.println("Денис теперь получает"+denisNew+"рублей.Годовой доход вырос на"+denisYear+"рублей");
        float christinaNew= christinaYear+christina;
        System.out.println("Кристина теперь получает"+christinaNew+"рублей.Годовой доход вырос на"+mashaYear+"рублей");








































    }
}