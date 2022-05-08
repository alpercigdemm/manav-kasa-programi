import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {

        double musteriArmut, musteriElma, musteriDomates, musteriMuz, musteriPatlican,toplam;
        double fiyatArmut = 2.14, fiyatElma= 3.67, fiyatDomates= 1.11, fiyatMuz= 0.95, fiyatPatlican= 5.00;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kac Kilo? :");
        musteriArmut = inp.nextDouble();

        System.out.print("Elma Kac Kilo? :");
        musteriElma = inp.nextDouble();

        System.out.print("Domates Kac Kilo? :");
        musteriDomates = inp.nextDouble();

        System.out.print("Muz Kac Kilo? :");
        musteriMuz = inp.nextDouble();

        System.out.print("Patlican Kac Kilo? :");
        musteriPatlican = inp.nextDouble();

        toplam = (fiyatArmut * musteriArmut) + (fiyatElma * musteriElma) + (fiyatDomates* musteriDomates) +(fiyatMuz * musteriMuz) + (fiyatPatlican * musteriPatlican);

        System.out.println("Toplam Tutar: " + toplam);

    }
}
