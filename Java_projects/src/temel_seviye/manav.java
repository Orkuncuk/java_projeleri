package temel_seviye;
import java.util.Scanner;

public class manav {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double tutar;
        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlıcan = 5.00;
        System.out.println("Armut kaç kilo?");
        double armut = input.nextDouble();
        System.out.println("Elma kaç kilo?");
        double elma = input.nextDouble();
        System.out.println("Domates kaç kilo?");
        double domates = input.nextDouble();
        System.out.println("Muz kaç kilo?");
        double muz = input.nextDouble();
        System.out.println("Patlıcan kaç kilo?");
        double patlıcan = input.nextDouble();
        tutar = (Armut*armut)+(Elma*elma)+(Domates*domates)+(Muz*muz)+(Patlıcan*patlıcan);
        System.out.println("Toplam tutar: "+tutar);
        input.close();

    }
    
}
