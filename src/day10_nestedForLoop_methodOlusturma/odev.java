package day10_nestedForLoop_methodOlusturma;

public class odev {
    public static void main(String[] args) {

         /*
        verilen sayi icin asağıdaki sayıyı olusturun
        int sayi = 5;

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
         */

        int sayi= 5;

        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");

            }
            System.out.println(" ");

        }for (int i = sayi; i >1 ; i--) {
            for (int j = i; j >1 ; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
