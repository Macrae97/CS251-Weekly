package week1.one_fifteen;

public class FootballScore {

    public String winningTeam(Team homeTeam, Team awayTeam){

        if (homeTeam.getGoals() == awayTeam.getGoals()){
            return "Draw between " + homeTeam.getName() + " and " + awayTeam.getName();
        } else if (homeTeam.getGoals() > awayTeam.getGoals()) {
            return "Win for " + homeTeam.getName();
        }else{
            return "Win for " + awayTeam.getName();
        }
    }
}
