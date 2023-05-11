package day03_dataCasting_Increment;

import java.util.Scanner;

public class C08_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        // Kullanicidan 3 basamakli pozitif bir tamsayi alip
        // sayinin rakamlar toplamini yazdirin
        // ornegin 213 girildiginde 6 yazdirsin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı pozitif tamsayı giriniz ");
        int sayi=scanner.nextInt();

        System.out.println(sayi%10+(sayi%100)/10+sayi/100);
        System.out.println("========================================================");

        int birler=0;
        int rakamlarToplami=0;//213

        birler=sayi%10;//3
        rakamlarToplami=rakamlarToplami+birler;//3

        sayi=sayi/10;//21
        birler=sayi%10;//1
        rakamlarToplami=rakamlarToplami+birler;//3+1

        sayi=sayi/10;//      21/10==>2
        birler=sayi%10;//2
        rakamlarToplami=rakamlarToplami+birler;//4+2

        System.out.println(rakamlarToplami);












    }
}
