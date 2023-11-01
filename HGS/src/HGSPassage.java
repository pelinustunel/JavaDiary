import java.util.Date;

public class HGSPassage {
    private Date tarih;
    private String yolGuzergahi;
    private double ucret;

    public HGSPassage(Date tarih, String yolGuzergahi, double ucret) {
        this.tarih = tarih;
        this.yolGuzergahi = yolGuzergahi;
        this.ucret = ucret;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getYolGuzergahi() {
        return yolGuzergahi;
    }

    public double getUcret() {
        return ucret;
    }

    @Override
    public String toString() {
        return "Tarih: " + tarih +
                "\nYol Güzergahı: " + yolGuzergahi +
                "\nÜcret: " + ucret + " TL\n";
    }
}