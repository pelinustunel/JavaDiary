import java.util.Date;

public class Main {
    public static void main(String[] args) {

        HGSAccount hgsAccount = new HGSAccount("Pelin", "Üstünel", "1234567890", 500.0);


        HGSPassage passage1 = new HGSPassage(new Date(), "Ankara - İstanbul", 50.0);
        HGSPassage passage2 = new HGSPassage(new Date(), "İstanbul - İzmir", 75.0);


        hgsAccount.addPassage(passage1);
        hgsAccount.addPassage(passage2);


        hgsAccount.displayAccountInfo();

        
        hgsAccount.displayPassageHistory();
    }
}