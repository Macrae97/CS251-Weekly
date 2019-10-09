package week1.one_fifteen;

public class Team {

    private String name;
    private int goals;

    public Team(String name, int goals) {
        this.name = name;
        if (goals <= 0) {
            this.goals = 0;
        } else {
            this.goals = goals;
        }
    }

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

}
