package kutuphaneOtomasyon;

import java.util.ArrayList;
import java.util.List;

public class KitapIsimleri {
    static List<Kitap> kitaplar=new ArrayList<>();

    public void kitapEkle(Kitap ktp){
        kitaplar.add(ktp);
    }
    public void kitapSil(String isnbNo){

        for(Kitap oAnkiKitap: kitaplar){
            if(oAnkiKitap.getKitapIsNo().equals(isnbNo)){
                kitaplar.remove(oAnkiKitap);
                System.out.println("Kitap basari ile silindi.");
                break;
            }else{
                System.out.println("Kitap bulunamadi..");
            }
        }
    }
    public void kitapBul(String kitapIsmi){
        kitaplar.stream().filter(t->t.getKitapAdi().equalsIgnoreCase(kitapIsmi)).forEach(Kitap::kitapBilgileri);

        for (Kitap oAnkiKitap : kitaplar) {
            if(oAnkiKitap.getKitapAdi().equalsIgnoreCase(kitapIsmi)){
                System.out.println("***KITAP BULUNDU***");
                oAnkiKitap.kitapBilgileri();
            }else{
                System.out.println("Kitap Bulunamadi");
            }
        }
    }
    public void tumKitaplariGoster(){
        kitaplar.stream().forEach(Kitap:: kitapBilgileri);
    }
}
