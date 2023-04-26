package day08_StringManipulations;

public class C06_lastIndexOf {
    public static void main(String[] args) {

        String str ="Java cok faydali ";

        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf("a", 10));
        System.out.println(str.lastIndexOf("a", 8));
        System.out.println(str.indexOf("cok"));
        System.out.println(str.lastIndexOf("cok"));


        System.out.println(str.lastIndexOf("cok"));

        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamis

        String str1 ="Java cok kolay";
        String str2="fazla";

        int bastanIndex =str1.indexOf(str2);
        int sondanIndex =str1.lastIndexOf(str2);


        if (bastanIndex==-1){
            System.out.println("Aradığınız kelime cümlede hiç kullanılmamıs");
        }else if (bastanIndex==sondanIndex){
            System.out.println("Aradığınız kelime cümlede 1 kere kullanılmıs");
        }else {
            System.out.println("Aradığınız kelime cümlede 1 den fazla kullanılmıs");}




    }
}
