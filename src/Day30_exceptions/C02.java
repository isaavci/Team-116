package Day30_exceptions;

public class C02 {
    public static void main(String[] args) {

        String str1;

        //System.out.println(str1);

        str1=null;// null bir deger değil pointer dır.

        //System.out.println(str1.concat("JAVA"));//NullPointerException

        //StringIndexOutOfBoundsException
        //ArrayIndexOutOfBoundsException

        String a="34"; //34a yazarsak bunu sayiya ceviremez ve exception firlatir
        String b="55";

        //a ve b variablelerindeki sayilarin toplamini yazdirin

        int sonuc= Integer.parseInt(a)+Integer.parseInt(b);//NumberFormatException

        System.out.println(sonuc);

        String str="Nasil amma";
        Object obj=str;
        Integer sayi=(Integer) obj;//ClassCastException

        //FileNotFoundException
        //IoException
        //RunTimeException
        //Exception
        //AritmeticException
        //InputMisMatchException
    }
}
