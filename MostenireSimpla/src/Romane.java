public class Romane extends Carte {

    private int numarPagini;
    private int anulPublic;

    public Romane(String numeCarte, String autor, Double Pret, int numarPagini, int anulPublic){
        super(numeCarte,autor,Pret);
        this.numarPagini=numarPagini;
        this.anulPublic=anulPublic;
    }

    public int getNumarPagini(){
        return this.numarPagini = numarPagini;
    }
    public int getAnulPublic(){
        return this.anulPublic = anulPublic;
    }

    public void setNumarPagini(int numarPagini){
        this.numarPagini = numarPagini;
    }
    public void setAnulPublic (int anulPublic){
        this.anulPublic = anulPublic;
    }

    @Override
    public String toString() {
        return
                " Titlul ='" + super.getnumeCarte() + '\'' +
                " Autorul ='" + super.getAutor() + '\'' +
                " Numarul de pagini ='" + this.getNumarPagini() + '\'' +
                " Anul Publicarii ='" + this.getAnulPublic() + '\'' +
                " Pretul ='" + super.getPret() + '\'';
    }
}
