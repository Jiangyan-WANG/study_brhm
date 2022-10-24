package c5_exercuse_8;

public class Automobile {
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;

    private int milesPerGallon;

    public Automobile(){
    }

    public Automobile(int id, String make, String model, String color, int year, int milesPerGallon) {
        this.setId(id);
        this.setMake(make);
        this.setModel(model);
        this.setColor(color);
        this.setYear(year);
        this.setMilesPerGallon(milesPerGallon);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>=0 && id<10000){
        this.id = id;
        }else{
            System.out.println("not valid");
            this.id =0;
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<2005||year>2024){
            System.out.println("not valid");
            this.year = 0;
        } else{
            this.year = year;
        }
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        if(milesPerGallon<10 || milesPerGallon>60){
            System.out.println("not valid");
            this.milesPerGallon=0;
        }else{
            this.milesPerGallon = milesPerGallon;
        }
    }

}
