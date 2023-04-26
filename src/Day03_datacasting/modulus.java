package Day03_datacasting;

import java.util.Scanner;

public class modulus {
    public static void main(String[] args) {

        System.out.println(20%8);
        System.out.println(625872538%3);

        // 12563412 sayisi 17 nin tam katı mıdır

        System.out.println(12563412%17); // 4 tam katı değil 0 olsaydı tam katı olurdu

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tamsayoı gir");
        int girilenSayi=scanner.nextInt();
        System.out.println(girilenSayi%10 * girilenSayi%10);
        //girilen sayıdan birler basamağını silip kalan sayıyı yaz
        // örnek 213 gir 21 yazdırsın



    }

}
