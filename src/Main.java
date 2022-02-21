import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        LuciferSpel spel = new LuciferSpel(15, new TestAlgoritme());
//        spel.startSpel(true);
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welke algoritme wil je testen?");
        System.out.println("1: TestAlgoritme, start eerst");
        System.out.println("2: TestAlgoritme, start tweede");
        System.out.println("3: VerstandigeAlgoritme, start eerst");
        System.out.println("4: VerstandigeAlgoritme, start tweede");
        String inp = in.nextLine();

        switch (inp){
            case "1": Test(new TestAlgoritme(), false); break;
            case "2": Test(new TestAlgoritme(), true); break;
            case "3": Test(new VerstandigeAlgoritme(), false); break;
            case "4": Test(new VerstandigeAlgoritme(), true); break;
        }
    }

    private static void Test(LuciferAlgoritme algoritme, boolean start) {
        for (int i = 0; i < 10000; i++)
        {
            LuciferSpel spel = new LuciferSpel(15, algoritme);
            spel.startSpel(start);
        }
    }
}

