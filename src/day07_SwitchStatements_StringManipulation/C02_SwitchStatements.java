package day07_SwitchStatements_StringManipulation;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan ay numarasını alın
        // o ayın hangi mevsimde olduğunu yazdirin.
        //        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //        Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir ay numarası giriniz");

        int AyNo= scanner.nextInt();

        switch (AyNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");

            default:
                System.out.println("Geçersiz Ay Numarası");

        }








    }
}
