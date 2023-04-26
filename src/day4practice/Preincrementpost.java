package day4practice;

import java.util.Scanner;

public class Preincrementpost {
    public static void main(String[] args) {
        //KUllanıcıan bir tamsayi isteyin
        // Girilen tam sayyıyı yazdırıp
        //sonra bir artırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı girin");
        int girilenSayi=scanner.nextInt();
        System.out.println("Girlen sayi :" + girilenSayi);

        girilenSayi++;

        //kullanıcıdan bir sayı daha alın
        //bu sayıyı önce artırın
        // sonra yazdırın
        System.out.println("Lütfen bir sayı daha girin");
        int girilenSayi2=scanner.nextInt();
        girilenSayi2++;

        System.out.println("Girilen ikinci sayi :" + girilenSayi2);
        System.out.println("Kodun sonunda GS :" + girilenSayi + " GS2 : " +girilenSayi2 );




    }
}
