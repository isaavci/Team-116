package day9_stringManipulation_forloops;

public class C11_ForLoopAsalSayı {
    public static void main(String[] args) {

        // verilen bir sayinin asal sayi olup olmadigini yazdirin

        int sayi = 13;
        boolean asalMi=true;

        for (int i = 2; i <sayi ; i++) {
            System.out.println("dene " + i);

            if (sayi % i == 0){
                asalMi=false;
                break;
            }
        }
        /*
            Bir loop'un icerisinde loop'un calismasini durdurmak isterseniz
            break; yazabilirsiniz
         */

        if (asalMi){
            System.out.println("sayi asal");
        }else {
            System.out.println("sayi asal degil");
        }



    }
}
