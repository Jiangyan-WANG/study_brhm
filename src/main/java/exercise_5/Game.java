package exercise_5;

import java.text.Format;

public class Game {
    private Team team1;
    private Team team2;
    private int hours;
    private int minutes;

    public Game(Team team1, Team team2, int hours, int minutes){
        this.team1 = team1;
        this.team2 = team2;
        this.hours = hours;
        this.minutes = minutes;

    }

    public Game(){
        this.team1 = null;
        this.team2 = null;
        this.hours = 0;
        this.minutes = 0;

    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public String getTime(){
//        Format()
//        return Format("%2d:%2d",this.hours, this.minutes);
        return this.hours+":"+this.minutes;
    }

    public void setTime(int hour,int minutes){
        this.hours = hour;
        this.minutes = minutes;
    }
}
