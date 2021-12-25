package HastaneProjesi;

public class Hastane extends VeriBankasi {
    private String isim;
    private String soyisim;
    private int hastaId;
    private Durum hastaDurum;

    Doktor doktor=new Doktor();
    Hasta hasta=new Hasta();

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Durum getHastaDurum() {
        return hastaDurum;
    }

    public void setHastaDurum(Durum hastaDurum) {
        this.hastaDurum = hastaDurum;
    }

    public int getHastaId() {
        return hastaId;
    }

    public void setHastaId(int hastaId) {
        this.hastaId = hastaId;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
