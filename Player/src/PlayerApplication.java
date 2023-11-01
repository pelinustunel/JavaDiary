public class PlayerApplication {
    public static void main(String[] args) {

        Footballer player1 = new Footballer("John", 25, "England", "Galatasaray");
        player1.setPosition("Forward");

        FootballCoach coach1 = new FootballCoach("Alex", 60, "England", "Beşiktaş");


        System.out.println("\n----------------\n");
        System.out.println("Footballer Information: " + player1.playerInformation());
        System.out.println("\n----------------\n");
        System.out.println("Coach Information: " + coach1.playerInformation());
        System.out.println("\n----------------\n");
    }
}