package day4practice;

public class postincrement {
    public static void main(String[] args) {

        int sayi =10;
        int b= sayi;

        sayi=sayi + 1;
        sayi++;
        System.out.println(sayi); // 12
        System.out.println(b); //10

        int c = sayi++;
        System.out.println(c);//12
        System.out.println(sayi);//13

        c=++sayi;
        System.out.println(c);//14
        System.out.println(sayi);//14

        int a=10;
        int d=5;

        d++;
        a++;
        System.out.println(a);//11
        System.out.println(d);//6











    }
}
