package day08_StringManipulations;

import java.util.Scanner;

public class C04_StringManipulationsSoru {
    public static void main(String[] args) {

        //  SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.

        // 1. adım kullanıcın mailin alma
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir mail giriniz");
        String email = scan.next();

//        if (!email.contains("@")){
//            System.out.println("Gecersiz mail");
//        }
//
//        if (!email.contains("@gmail.com")){
//            System.out.println("mail gmail olmali");
//        }
//
//        if (!email.endsWith("@gmail.com")){
//            System.out.println("mailde yazim hatasi var");
//        }

        if (!email.contains("@")){
            System.out.println("Gecersiz mail");
        }else if (!email.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
        }else if (!email.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }






    }

}

