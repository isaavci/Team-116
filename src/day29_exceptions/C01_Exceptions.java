package day29_exceptions;

import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {


        //Kullanicidan iki tam sayi alip ilk sayiyi 2. ye bolun
        //sonucu yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen iki tam sayi giriniz");
        int sayi1=scanner.nextInt();
        System.out.println("Lütfen iki tam sayi giriniz");

        int sayi2=scanner.nextInt();

        System.out.println("Iki sayinin bolme sonucu : " +sayi1/sayi2);

        if (sayi2==0){
            System.out.println("Sayi sifira bolunemez");
        }else {
            System.out.println("Iki sayinin bolme sonucu :" +sayi1/sayi2);
        }



    }
}
