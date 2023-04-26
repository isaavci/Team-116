package day10_nestedForLoop_methodOlusturma;

public class C09_FaktoriyelDegeriYazdirma {

    public static void main(String[] args) {
        // verdigimiz bir sayinin faktoryel degerini yazdiran
        // bir method olusturun

        faktoriyelDegeri(5);


    }


    public static void faktoriyelDegeri(int sayi){


        int faktoriyel=1;

        for (int i = 1; i <=sayi ; i++) {
            faktoriyel*=i;
        }
        System.out.println(sayi+"! = " + faktoriyel);


    }



}
