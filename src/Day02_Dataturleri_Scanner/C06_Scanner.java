package Day02_Dataturleri_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {


        // Soru 2- kullanıcıdan bir double bir de int sayi alıp
        // bunların toplamını ve çarpımını yazdırın

       Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz : ");
       int sayi1=scanner.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz : ");
       int sayi2=scanner.nextInt();

       sayi1=sayi1 +sayi2;
       sayi2=sayi1-sayi2;
       sayi1=sayi1-sayi2;

        System.out.println("Sayıların değerini değiştirdim :"+
        "\nartık sayi1 :" + sayi1 + "\nsayi2 :" + sayi2);







    }
}
