package exercise_5;

public class Team {
    private String school;
    private String sport;
    private String mascot;
    public static final String MOTTO = "Sportsmanship";

    public Team(){
        this.school = "to set";
        this.sport = "to set";
        this.mascot = "to set";
    }

    public Team(String school, String sport, String mascot){
        this.school = school;
        this.sport = sport;
        this.mascot = mascot;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

}
