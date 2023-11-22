public class Leptop {
    private String nume;
    private String model;
    private String culoarea;
    private int ram;
    private Double display;
    private Double greutatea;

    public Leptop(String nume, String model, String culoarea){
        this.nume = nume;
        this.model = model;
        this.culoarea = culoarea;
    }
    public Leptop(String nume, String model, String culoarea, int ram, double display){
        this.nume = nume;
        this.model = model;
        this.culoarea = culoarea;
        this.ram = ram;
        this.display = display;
    }
    public Leptop(String nume, String model, String culoarea, int ram, double display, double greutatea){
        this.nume = nume;
        this.model = model;
        this.culoarea = culoarea;
        this.ram = ram;
        this.display = display;
        this.greutatea = greutatea;
    }

    public String getNume(){
        return this.nume = nume;
    }
    public String getModel(){
        return this.model = model;
    }
    public String getCuloarea(){
        return this.culoarea = culoarea;
    }
    public int getRam(){
        return this.ram = ram;
    }
    public Double getDisplay(){
        return this.display = display;
    }
    public Double getGreutatea(){
        return this.greutatea = greutatea;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setCuloarea(String culoarea){
        this.culoarea = culoarea;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public void setDisplay(Double display){
        this.display =display;
    }
    public void setGreutatea(Double greutatea){
        this.greutatea = greutatea;
    }
    @Override
    public String toString() {
        return " Nume ='" + this.getNume() + '\'' +
                " Model ='" + this.getModel() + '\'' +
                " Culoare  ='" + this.getCuloarea() + '\'' +
                " RAM  ='" + this.getRam() + '\'' +
                " Disply  ='" + this.getDisplay() + '\'' +
                " Greutatea  ='" + this.getGreutatea() + '\'';
    }
}

