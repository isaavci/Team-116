package day04_increment_concatenation;

import java.util.Scanner;

public class C01_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        // Kullanicidan bir tam sayi isteyin
        // Girilen tam sayiyi yazdirip
        // sonra 1 artirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen sayi : " + girilenSayi);

        girilenSayi++;


        // kullanicidan bir sayi daha alin
        // bu sayiyi once artirin
        // sonra yazdirin
        System.out.println("Lutfen bir tamsayi daha girin");
        int girilenSayi2= scanner.nextInt();

        girilenSayi2++;

        System.out.println("Girilen ikinci sayi : " + girilenSayi2);

        System.out.println("Kodun sonunda GS : " + girilenSayi + ", GS2 : " + girilenSayi2);

    }
}