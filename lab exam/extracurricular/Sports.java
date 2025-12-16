package extracurricular;
import academics.Student;
public class Sports extends Student {
    private int  no_of_matches;
    public Sports(String name, int rollNo, int no_of_matches) {
        super(name, rollNo);
        this.no_of_matches = no_of_matches;
    }
    public int getMatchesPlayed() {
        return  no_of_matches;
    }
    public void display() {
        super.display();
        System.out.println("Matches Played: " +  no_of_matches);
    }
    public void display(String pre) {
        super.display(pre);
        System.out.println(pre + " Matches Played: " + no_of_matches);
    }
}