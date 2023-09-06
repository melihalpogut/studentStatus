import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner sınıfı tanım
        Scanner inp = new Scanner(System.in);

        //Kullanıcı Değer Alma
        System.out.println("Matematik Notu:");
        mat= inp.nextInt();

        System.out.println("Fizik Notu:");
        fizik= inp.nextInt();

        System.out.println("Kimya Notu:");
        kimya= inp.nextInt();

        System.out.println("Türkçe Notu:");
        turkce= inp.nextInt();

        System.out.println("Tarih Notu:");
        tarih= inp.nextInt();

        System.out.println("Müzik Notu:");
        muzik= inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6.0;
        if (sonuc <= 55) {
            System.out.println("Sınıfta kaldınız");
            System.out.println("Ortalamanız: " + sonuc);
        } else {
            System.out.println("Sınıfı geçtiniz");
            System.out.println("Ortalamanız: " + sonuc);
        }
    }
}