package Day02_Dataturleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //Kullanıcıdan bir tamsayı isteyin
        //Girilen sayının iki katını yazdırın

        // 1. Scanner objesi olusturulacak

        Scanner scanner= new Scanner(System.in);

        // 2. Kullanıcıdan ne istediğinizi söyleyin

        System.out.println("Lütfen bir tamsayı giriniz");

        // 3. Kullanıcının gireceği data türüne uygun bir variable oluşturun
        //    Scanner objesiyle variable ye uygun hazır method u kullanıp
        // kullanıcıdan değeri alın ve oluşturduğunuz variable ye atayın

        int girilenSayi= scanner.nextInt();

        System.out.println("Girdiğiniz sayinin iki kati :" + 2*girilenSayi );


    }
}
