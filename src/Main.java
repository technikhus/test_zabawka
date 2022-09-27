public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Zabawka zabawka1 = new Zabawka("lalka", "kolorowy");
        Zabawka zabawka2 = new Zabawka("pilka", "niebieski");

        System.out.println(zabawka1);
        System.out.println(zabawka2);
        System.out.println("Mam tyle zabawek: " + Zabawka.licznikZabawek);
    }
}