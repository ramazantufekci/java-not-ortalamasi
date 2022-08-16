import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner giris = new Scanner(System.in);
        System.out.print("Matematik Notunuz:");
        mat = giris.nextInt();
        System.out.print("Fizik Notunuz:");
        fizik = giris.nextInt();
        System.out.print("Kimya Notunuz:");
        kimya = giris.nextInt();
        System.out.print("Türkçe Notunuz:");
        turkce = giris.nextInt();
        System.out.print("Tarih Notunuz:");
        tarih = giris.nextInt();
        System.out.print("Müzik Notunuz:");
        muzik = giris.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam/6.0;
        String durum = ortalama>60?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println("Ortalama "+ortalama+" "+durum);
    }
}
