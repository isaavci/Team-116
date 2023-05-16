package Day30_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01 {
    public static void main(String[] args) {

        try {
            FileInputStream fis=new FileInputStream("src/day29_exceptions/deneme1.txt");
            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu hatali");
        } catch (IOException e) {
            System.out.println("Dosyaya erisim ve okuma ile ilgili bir hata var");
        }
        /*

         eger parent-child iliskisi olan
            birden fazla exception turunu try-catch ile handle etmek istersek
           1- ic ice iki try catch blogu olusturabiliriz
          2- eger bir try birden fazla catch blogu olusturacaksak
             once child exception icin catch blogu yazmaliyiz,
             sonra parent exception icin.
             Cunku parent'dan sonra child'i yazarsak
             parent'in yakalayamayip, child'in yakalayacagi
          exception olmayacagindan, java child exception'i silmemizi ister
          3- child exception icin catch yazmadan
            sadece parent icin 1 tane catch blogu yazmak da yeterli olur
 */



    }
}
