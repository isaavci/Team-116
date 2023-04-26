package Day03_datacasting;

import java.util.Scanner;

public class rakamlartoplamı {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen 3 basamaklı pozitif bir tamsayı giriniz");

        int sayi= scanner.nextInt();
        int birlerBas=0;
        int rakamlarToplamı=0;

        birlerBas=sayi % 10;
        rakamlarToplamı= rakamlarToplamı + birlerBas;
        // sayı 213 birler basamağı = 3 rakamlar toplami =3

        sayi= sayi /10; //213 /10 ==>  21


        birlerBas= sayi % 10; // 21 % 10 ==> 1
        rakamlarToplamı= rakamlarToplamı + birlerBas;// 3+1 = 4
        sayi = sayi / 10;
        birlerBas= sayi % 10; // 

    }
}
