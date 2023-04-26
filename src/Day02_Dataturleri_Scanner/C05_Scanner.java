package Day02_Dataturleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // Kullanıcıdan ismini isteyip
        //İsmi büyük harfe çevirip kaydedin
        //Sonra kullanıcıya yeni halini yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String girilenIsım= scanner.nextLine();

        // nextline() yazılan bilginin tamamını getirir
        // next() ilk space e kadar olan bölümü getirir. H Ibrahim==> H

        girilenIsım = girilenIsım.toUpperCase();

        System.out.println("Girilen ismin düzenlenmiş hali :" + girilenIsım);












    }
}
