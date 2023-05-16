package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_tryCatch {
    public static void main(String[] args) {

        //Kullanicidan iki tam sayi alip ilk sayiyi 2. ye bolun
        //sonucu yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen iki tam sayi giriniz");
        int sayi1= 0;
        try {
            sayi1 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("tamsayi degeri girmelisiniz");
        }
        System.out.println("Lütfen iki tam sayi giriniz");

        int sayi2= 0;
        try {
            sayi2 = scanner.nextInt();
        } catch (InputMismatchException e) {

            System.out.println("tamsayi degeri girmelisiniz");
        }

        try {
            System.out.println("Iki sayinin bolme sonucu : " +sayi1/sayi2);

        } catch (ArithmeticException e) {

            System.out.println("Sayilar 0 a bolunemez");
        }


        if (sayi2==0){
            System.out.println("Sayi sifira bolunemez");
        }else {
            System.out.println("Iki sayinin bolme sonucu :" +sayi1/sayi2);
        }

    }
}
