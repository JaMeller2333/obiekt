public class Main {
    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(5.0);

        System.out.println("Obwód kwadratu: " + kwadrat.obliczObwod());
        System.out.println("Pole kwadratu: " + kwadrat.obliczPole());


        Punkt punkt1 = new Punkt();
        Punkt punkt2 = new Punkt(3, 4);
        double odleglosc1 = punkt1.obliczOdleglosc(3, 4);
        System.out.println("Odległość między punkt1 a (3, 4): " + odleglosc1);
        double odleglosc2 = punkt1.obliczOdleglosc(punkt2);
        System.out.println("Odległość między punkt1 a punkt2: " + odleglosc2);

        Wiatrak wiatrak1 = new Wiatrak();
        System.out.println(wiatrak1.informacje());
        Wiatrak wiatrak2 = new Wiatrak(Wiatrak.FAST, true, 10.0, "blue");
        System.out.println(wiatrak2.informacje());
    }
}