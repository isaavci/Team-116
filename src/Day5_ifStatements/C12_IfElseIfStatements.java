package Day5_ifStatements;

import java.util.Scanner;

public class C12_IfElseIfStatements {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
        //         Hem 3, hem 5'e bolunuyorsa SUPER yazdirin
        //         ikisine de bolunemeyen sayilar icin YAZIK yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int girilenSayi= scanner.nextInt();

        if (girilenSayi%3 == 0 && girilenSayi%5 == 0) {
            System.out.println("SUPER");
        } else if (girilenSayi % 3 == 0){
            System.out.println("Uc ile bolunebilen sayi");
        } else if (girilenSayi % 5 == 0) {
            System.out.println("Bes ile bolunebilen sayi");
        } else {
            System.out.println("YAZIK");
        }

    }
}
