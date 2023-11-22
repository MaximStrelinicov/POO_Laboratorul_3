public class GenLiterar {

    private String titlul;
    private String numeAutor;
    private int dataPub;

    public GenLiterar(String titlul, String numeAutor, int dataPub){
        this.titlul = titlul;
        this.numeAutor = numeAutor;
        this.dataPub = dataPub;
    }
    public String getTitlul(){
        return this.titlul = titlul;
    }
    public String getNumeAutor(){
        return this.numeAutor;
    }
    public int getDataPub(){
        return this.dataPub;
    }
    public void setTitlul(String titlul){
        this.titlul = titlul;
    }
    public void setNumeAutor(String numeAutor){
        this.numeAutor = numeAutor;
    }
    public void setDataPub(int dataPub){
        this.dataPub = dataPub;
    }
    @Override
    public String toString() {
        return "{" +
                " Titlul ='" + this.getTitlul() + '\'' +
                " Autorul ='" + this.getNumeAutor() + '\'' +
                ", Data publicari  ='" + this.getDataPub() + '\'' +
                '}';
    }
}
