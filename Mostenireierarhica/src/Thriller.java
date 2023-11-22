public class Thriller extends GenLiterar {

    private Double pret;
    public Thriller(String titlul, String numeAutor, int dataPub, Double pret){
        super(titlul,numeAutor,dataPub);
        this.pret = pret;
    }

    public Double getPret(){
        return this.pret = pret;
    }
    public void setPret(Double pret){
        this.pret = pret;
    }
    @Override
    public String toString() {
        return  " Titlul ='" + super.getTitlul() + '\'' +
                " Autorul ='" + super.getNumeAutor() + '\'' +
                " Data publicari  ='" + super.getDataPub() + '\'' +
                " Pretul  ='" + this.getPret()+ '\'';
    }
}
