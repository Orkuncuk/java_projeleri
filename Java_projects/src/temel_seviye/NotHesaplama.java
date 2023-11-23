package temel_seviye;
import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik notunuz: ");
        matematik = input.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();
        
        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.println("Turkce notunuz: ");
        turkce = input.nextInt();é

        System.out.println("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.println("Muzik notunuz: ");
        muzik = input.nextInt();

        input.close();

        int ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        boolean kosul = ortalama >= 60;
        String sonuc = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);

    }
}
