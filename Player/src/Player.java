public abstract class Player {

    private String name;
    private int age;
    private String nationalTeam;

    public Player(String name, int age, String nationalTeam) {
        this.name = name;
        this.age = age;
        this.nationalTeam = nationalTeam;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationalTeam() {
        return nationalTeam;
    }

    public abstract String playerInformation();


}
