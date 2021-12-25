package HastaneProjesi;

public class Hasta extends VeriBankasi{
    private String isim;
    private String soyisim;
    private int hastaId;
    private Durum hastaDurumu;

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public Durum getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(Durum hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getHastaId() {
        return hastaId;
    }

    public void setHastaId(int hastaId) {
        this.hastaId = hastaId;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }


}
