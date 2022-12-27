import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = 2.14, e = 3.67, d = 1.11, m = 0.95, p = 5, armut, elma, muz, domates, patlican;

        Scanner inp = new Scanner(System.in);


        System.out.print("Kaç kilo armut aldınız? ");
        armut = inp.nextDouble();

        System.out.print("Kaç kilo elma aldınız? ");
        elma = inp.nextDouble();

        System.out.print("Kaç kilo domates aldınız? ");
        domates = inp.nextDouble();

        System.out.print("Kaç kilo muz aldınız? ");
        muz = inp.nextDouble();

        System.out.print("Kaç kilo patlıcan aldınız? ");
        patlican = inp.nextDouble();

        double toplam = (armut*a) + (elma*e) + (domates*e) + (muz*m) + (patlican*p);

        System.out.println("Toplam tutar :" + toplam);


    }
}