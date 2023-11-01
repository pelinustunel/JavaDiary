public class FootballCoach extends Player {

    private String managedTeam;

    public FootballCoach(String name, int age, String nationalTeam, String managedTeam) {
        super(name, age, nationalTeam);
        this.managedTeam = managedTeam;
    }

    public String getManagedTeam() {
        return managedTeam;
    }

    @Override
    public String playerInformation() {
        return "\nName: " + getName() + "\nAge: " + getAge() + "\nNational Team: " + getNationalTeam() + "\nManaged Team: " + getManagedTeam();
    }
}
