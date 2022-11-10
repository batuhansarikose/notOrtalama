import java.util.Scanner;

public class notOrtalama {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat,fizik,kimya,muzik,tarih,turkce;

        // Scanner sınıfımızı tanımlayalım
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerleri alalım

        System.out.println("Matematik notunu giriniz:");
        mat = input.nextInt();

        System.out.println("Fizik notunu giriniz:");
        fizik = input.nextInt();

        System.out.println("Kimya notunu giriniz:");
        kimya = input.nextInt();

        System.out.println("Müzik notunu giriniz:");
        muzik = input.nextInt();

        System.out.println("Tarih notunu giriniz:");
        tarih = input.nextInt();

        System.out.println("Türkçe notunu giriniz:");
        turkce = input.nextInt();

        double ort =((mat+fizik+kimya+muzik+tarih+turkce)/6);

        System.out.println("Ortalamanız:" +ort);

        boolean kosul1 = ort >= 60;
        boolean kosul2 = ort <101;

        boolean sonuc = kosul1&&kosul2;

        String kosull = sonuc ?  "Geçtiniz" : "Kaldınız";
        System.out.println(kosull);








    }
}
