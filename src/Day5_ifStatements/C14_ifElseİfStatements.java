package Day5_ifStatements;

import java.util.Scanner;

public class C14_ifElseİfStatements {
    public static void main(String[] args) {
    //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya
        // “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz :" +
                "\nKadın için : K , Erkek için :E");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasınızı giriniz :");
        int yas=scanner.nextInt();


        if ((cinsiyet!='E' && cinsiyet!='K')|| yas<10 ||yas>80) {
            System.out.println("Geçersiz Giriş");}
        else if (cinsiyet=='K' && yas<60) {
            System.out.println("Kadınlar 60 yaşına kadar çalışmalıdır daha : "+ (60-yas) +"yıl çalışmalısın");}
        else if (cinsiyet=='E' && yas<65) {
            System.out.println("Erkekler 65 yaşına kadar çalışmalıdır daha : "+ (60-yas) +"yıl çalışmalısın");}
        else if (cinsiyet=='K' && yas>=60){
            System.out.println("Emekli Olabilirsin");}
        else if (cinsiyet=='E' && yas>=65) {
            System.out.println("Emekli Olabilirsin");}



    }
}
