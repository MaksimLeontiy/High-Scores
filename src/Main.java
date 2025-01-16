//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Player data = new Player("default", 999);

        //data.setInitials("ML");
        data.setScore(10);

        System.out.println("Initials: " + data.getInitials());
        System.out.println("Score: " + data.getScore());
    }
}

class Player{
    private String initials;
    private int score;
    // getter and setter methods for initials
    public String getInitials() {
        return initials;
    }
    public void setInitials(String initials) {
        this.initials = initials;
    }
    // getter and setter method for score
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    // Constructor
    public Player(String initials, int score){
        this.initials = initials;
        this.score = score;
    }

}
