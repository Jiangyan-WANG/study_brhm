package main.exercise_2a;

public class Lease {
    private String name;
    private int number;
    private double rent;
    private int term;
    private double fee;

    public Lease() {
        this.name = "XXX";
        this.number = 0;
        this.rent = 1000;
        this.term = 12;
        this.fee = 10;
    }

    public Lease(String name, int number, double rent, int term){
        this.name = name;
        this.number = number;
        this.rent=rent;
        this.term = term;
        this.fee= 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public static void explainPetPolicy(double fee){
        System.out.printf("A pet fee of $%.1f will be added to the monthly rent.",fee);
        System.out.println();
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
