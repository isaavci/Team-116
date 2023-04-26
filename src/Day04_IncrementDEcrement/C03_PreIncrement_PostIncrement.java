package Day04_IncrementDEcrement;

public class C03_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a++);//10
        System.out.println(a);//11
        System.out.println(++a);//12
        System.out.println(a);//12

        int b= a++;
        System.out.println("a : " + a + " , b : " + b);//a 13 b 12
        a=--b;
        System.out.println("a : " + a + " , b : " +  b  );//a11 b11
        int c=a++  +  ++b;
        System.out.println("a : " + a + ", b : "+ b + ", c : " + c);//a12 b12 c23
        int x=20;
        System.out.println(--x);//19

        System.out.println(x++);//19
        System.out.println(++x);//21
        int y=++x;
        System.out.println("x : " + x + " y : " + y );//x22 y22
        x=--y;
        System.out.println("x : " + x + " y : " + y );//x21 y21
        y=x++;
        System.out.println("x : " + x + " y : " + y);//x22 y21

        System.out.println(x++ + ++y);//44








    }
}
