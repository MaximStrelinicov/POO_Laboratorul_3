public class Actiuni extends Filme {

    private Double IMDb;
    public Actiuni(String titlul, int anu, String regizor, Double IMDb){
        super(titlul,anu,regizor);
        this.IMDb = IMDb;

    }
    public Double getIMDb(){
        return this.IMDb = IMDb;
    }
    public void setIMDb(Double IMDb){
        this.IMDb = IMDb;
    }
    @Override
    public String toString() {
        return
                " Titlul ='" + super.getTitlul() + '\'' +
                        " Anu ='" + super.getAnu() + '\'' +
                        " Regizor ='" + super.getRegizor() + '\''+
        " IMDb ='" + this.getIMDb() + '\'' ;


    }
}
