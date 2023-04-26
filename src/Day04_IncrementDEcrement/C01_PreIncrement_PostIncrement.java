package Day04_IncrementDEcrement;

import java.util.Scanner;

public class C01_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi isteyin
        // Girilen tam sayiyi yazdirip
        // sonra 1 artirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfn Bir Tamsayı Giriniz : ");
        int girilenSayi =scanner.nextInt();

        System.out.println("Girilen Sayı : " + girilenSayi);

        girilenSayi++;
        System.out.println("Girilen Sayının Bir Fazlası : " + girilenSayi);

        // kullanicidan bir sayi daha alin
        // bu sayiyi once artirin
        // sonra yazdirin

        System.out.println("Lütfen Bir Tamsayı Daha girin : ");
        int girilenSayi2=scanner.nextInt();
        girilenSayi2++;

        System.out.println("Gİrilen Sayının Bİr fazlası : "+ girilenSayi2);

        System.out.println("Kodun Sonunda GS : "  + girilenSayi + "  GS2 : " +  girilenSayi2);











    }
}
