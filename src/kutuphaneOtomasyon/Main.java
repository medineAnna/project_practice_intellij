package kutuphaneOtomasyon;

import java.util.Scanner;

public class Main {
    static KitapIsimleri kitapislemleri=new KitapIsimleri();
    public static void main(String[] args) {

        //Kitap ekle, Kitap sil, Kitap bul, Tum kitaplari goster ve Cikis

        acilisMenu();

    }

    private static void acilisMenu() {
        Scanner scan= new Scanner(System.in);
        System.out.println("KUTUPHANEYE HOSGELDINIZ. \nYapmak istediginiz islemi seciniz.\n1) Kitap Ekle:" +
                "\n2) Kitap Sil:\n3) Kitap Bul:\n4) Tum Kitaplari Goster:\n5) Cikis.");
        int tercih=scan.nextInt();

        switch (tercih){

            case 1:
                System.out.println("Kitap ismini giriniz: ");
                String kitapAdi= scan.nextLine();
                scan.nextLine();
                System.out.println("Kitap isbn no giriniz: ");
                String kitapIsbn= scan.nextLine();
                System.out.println("Kitap aciklamasi giriniz: ");
                String aciklama=scan.nextLine();

                //yazar  bilgileri girilecek
                System.out.println("Yazar ismini giriniz: ");
                String yazarAdi=scan.nextLine();
                System.out.println("Yazarin yasini giriniz: ");
                int yas= scan.nextInt();
                scan.nextLine();
                System.out.println("Yazarin memleketini giriniz: ");
                String yazarMemleket= scan.next();
                Yazar yazar=new Yazar(yazarAdi,yas,yazarMemleket);

                //yayinevi bilgiler
                System.out.println("Yayinevi ismini giriniz: ");
                String yayineviadi=scan.nextLine();
                System.out.println("Yayinevi adresini giriniz: ");
                String yayineviAdresi=scan.nextLine();
                Yayinevi yayinevi=new Yayinevi(yayineviadi,yayineviAdresi);

                Kitap ktp=new Kitap(kitapAdi,kitapIsbn,aciklama,yazar,yayinevi);
               kitapislemleri.kitapEkle(ktp);
                System.out.println("Kitap kaydedildi");
                kitapislemleri.tumKitaplariGoster();
                acilisMenu();
                break;
            case 2:
                System.out.println("Silmek istedigniz isbn numarasini giriniz: ");
                String isbn=scan.nextLine();
                kitapislemleri.kitapSil(isbn);
                break;
            case 3:
                System.out.println("Aradiginiz kitabin ismini yaziniz: ");
                String arananKitap=scan.nextLine();
                kitapislemleri.kitapBul(arananKitap);
                break;
            case 4:
                kitapislemleri.tumKitaplariGoster();
                break;
            case 5:
                System.out.println("Bol okumalar.");
                System.exit(0);
                break;
            default:
                System.out.println("Yalnis tercih yaptiniz.");
                acilisMenu();
                break;
        }

    }
}
