public class Footballer extends Player implements Position{

  private String currentTeam;
  private String position;

  public Footballer(String name, int age, String nationalTeam, String currentTeam) {
    super(name, age, nationalTeam);
    this.currentTeam = currentTeam;
  }
  public String getCurrentTeam() {
    return currentTeam;
  }

  @Override
  public void setPosition(String position) {
    this.position = position;
  }

  @Override
  public String playerInformation() {
    return "\nName: " + getName() + "\nAge: " + getAge() + "\nNational Team: " + getNationalTeam() + "\nCurrent Team: " + getCurrentTeam() + "\nPosition: " + position;
  }
}

