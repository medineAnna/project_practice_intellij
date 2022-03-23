package javaTekrar;

import java.util.Scanner;

public class TersUcgen {
    /*Ask user to enter the number of lines of a inverted half pyramid by using numbers.
    Type a program to create the inverted half pyramid.
    For example if the number of lines is 5, the pyramid will be like;
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
    Kullanıcının  girdigi satır sayısı kadar sayılarla ters yarım piramid sekli yazdıran bir program create ediniz.
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen satir sayisi giriniz: ");
        int satirSayi=scan.nextInt();

        for (int i = 1 ; i <=satirSayi ; satirSayi--) {

            for (int j = 1; j <= satirSayi; j++) {

                System.out.print( " * " );

            }
            System.out.println();
        }}}