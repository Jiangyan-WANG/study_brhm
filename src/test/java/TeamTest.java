import exercise_5.Team;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.chrono.IsoChronology;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
    public static void main(String[] args) {
        Team[] allTeam = new Team[3];
        Scanner teamScanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            allTeam[i] = setTeamData(teamScanner);
        }
        for (int i = 0; i < 3; i++) {
            showInfo(allTeam[i]);
        }

    }

    private static void showInfo(Team team) {
        System.out.println(team.getSchool() + " " + team.getSport() + " team " + team.getMascot());
        System.out.println("   Our motto is "+ Team.MOTTO +"!");
    }

    Team thisTest;

    @BeforeEach
    void setThisTest(){
        thisTest = new Team("St Johns", "Waterpolo", "Lion");
    }

    @Test
    void getSchool(){
        assertEquals(thisTest.getSchool(), "St Johns");
    }

    @Test
    void getSport(){
        assertEquals(thisTest.getSport(), "Waterpolo");
    }

    @Test
    void getMascot(){
        assertEquals(thisTest.getMascot(), "Lion");
    }

    public static Team setTeamData(Scanner teamScanner){
        System.out.print("Enter school name >> ");
        String school = teamScanner.nextLine();
        System.out.print("Enter sport >> ");
        String sport = teamScanner.nextLine();
        System.out.print("Enter mascot >> ");
        String mascot = teamScanner.nextLine();

        return new Team(school,sport,mascot);
    }
}
