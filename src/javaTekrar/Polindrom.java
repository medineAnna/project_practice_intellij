package javaTekrar;

import java.util.Scanner;

public class Polindrom {
    //kullanicidan bir kelime aliniz ve aldiginiz kelimeyi ters donduren methot yaapiniz.
    // polindrom olup olmadıgina bakiniz
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen girmek istediginiz kelimeyi yaziniz");
        String kelime= scan.next();
        String tersKelime="";
        System.out.println(tersKelime(kelime, tersKelime));



    }



    public static String tersKelime(String kelime, String tersKelime) {
        for (int i = kelime.length()-1; i >= 0; i--) {

            tersKelime  += kelime.substring(i,i+1);
        }

        if (kelime.equals(tersKelime)) System.out.println("polindrom");
        else System.out.println("polindrom degildir");


        return tersKelime;

    }


}
