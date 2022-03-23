package javaTekrar;

import java.util.Scanner;

public class Piramid {
    /*
     *
     * Ask user to enter the number of lines of a half pyramid. Type a program to
     * create the half pyramid. For exampleif the number of lines is 5, the pyramid
     * will be like;
     *
     * * * * * * * * * * *
     *
     * Kullanıcının girdigi satır sayısı kadar yarım piramid sekli yazdıran bir
     * program create ediniz.
     *
     *
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number for see the pyramid: ");
        int satir=scan.nextInt();

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }


    }}