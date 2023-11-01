import java.util.ArrayList;

public class HGSAccount {
    private String adi;
    private String soyadi;
    private String tcKimlik;
    private double bakiye;
    private ArrayList<HGSPassage> passageList;

    public HGSAccount(String adi, String soyadi, String tcKimlik, double bakiye) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.tcKimlik = tcKimlik;
        this.bakiye = bakiye;
        this.passageList = new ArrayList<>();
    }

    public void addPassage(HGSPassage passage) {
        passageList.add(passage);
    }

    public ArrayList<HGSPassage> getPassages() {
        return passageList;
    }

    public void displayAccountInfo() {
        System.out.println("Adı: " + adi);
        System.out.println("Soyadı: " + soyadi);
        System.out.println("T.C. Kimlik No: " + tcKimlik);
        System.out.println("Bakiye: " + bakiye + " TL\n");
    }

    public void displayPassageHistory() {
        System.out.println("Geçiş Geçmişi:");
        for (HGSPassage passage : passageList) {
            System.out.println(passage);
        }
    }
}