public class Romane extends GenLiterar{
    private int numPagini;
    public Romane(String titlul, String numeAutor, int dataPub, int numPagini){
        super(titlul,numeAutor,dataPub);
        this.numPagini = numPagini;
    }
    public int getNumPagini(){
        return this.numPagini;
    }
    public void setNumPagini(int numPagini){
        this.numPagini = numPagini;
    }

    @Override
    public String toString() {
        return  " Titlul ='" + super.getTitlul() + '\'' +
                " Autorul ='" + super.getNumeAutor() + '\'' +
                " Data publicari  ='" + super.getDataPub() + '\'' +
                " Numarul de pagini  ='" + this.getNumPagini() + '\'';
    }
}
