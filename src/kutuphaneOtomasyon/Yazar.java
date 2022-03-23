package kutuphaneOtomasyon;

public class Yazar {
   private String yazarAdi;
   private int yas;
   private String yazarMemleket;


    public void yazarBilgileriGetir() {
        System.out.println("Yazar{" +
                "yazarAdi='" + yazarAdi + '\'' +
                ", yas=" + yas +
                ", yazarMemleket='" + yazarMemleket + '\'' +
                '}');
    }

    public Yazar(String yazarAdi, int yas, String yazarMemleket) {
        this.yazarAdi = yazarAdi;
        this.yas=yas;
        this.yazarMemleket=yazarMemleket;
    }
    public Yazar(){

    }

    public String getYazarMemleket() {
        return yazarMemleket;
    }

    public void setYazarMemleket(String yazarMemleket) {
        this.yazarMemleket = yazarMemleket;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }
}
