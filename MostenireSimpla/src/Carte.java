public class Carte {

    private String numeCarte;
    private Double Pret;
    private String autor;

    public Carte(String numeCarte, String autor, Double Pret){
        this.numeCarte = numeCarte;
        this.autor = autor;
        this.Pret = Pret;
    }
    public String getnumeCarte(){
        return this.numeCarte;
    }

    public String getAutor(){
        return this.autor = autor;
    }

    public Double getPret(){
        return this.Pret;

    }

    public void setNumeCarte(String numeCarte){
        this.numeCarte = numeCarte;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setPret(Double Pret ){
        this.Pret = Pret;
    }

    @Override
    public String toString() {
        return  " Titlul ='" + this.getnumeCarte() + '\'' +
                " Autorul ='" + this.getAutor() + '\'' +
                " Pretul ='" + this.getPret() + '\'';
    }
}
