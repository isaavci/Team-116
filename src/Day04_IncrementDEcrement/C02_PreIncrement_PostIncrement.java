package Day04_IncrementDEcrement;

import java.util.Scanner;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi isteyin
        // Girilen tam sayiyi yazdirip
        // sonra 1 artirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen Bİr Tamsayı Giriniz : ");

        int girilenSayi = scanner.nextInt();
        System.out.println("Girilen Tam Sayı : "  + girilenSayi++);

        // kullanicidan bir sayi daha alin

        // bu sayiyi once artirin
        // sonra yazdirin

        System.out.println("Lütfen Bir Tamsayı Daha Giriniz : ");
        int girilenSayi2=scanner.nextInt();

        System.out.println("Gİrilen İkinci Sayı : " +  ++girilenSayi2);

        System.out.println("Girilen Sayı : " + girilenSayi + "    Girilen 2. Sayı : "  +  girilenSayi2);












    }
}
