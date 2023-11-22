public class Filme {

    private String titlul;
    private int anu;
    private String regizor;

    public Filme(String titlul, int anu, String regizor){
        this.titlul = titlul;
        this.anu = anu;
        this.regizor = regizor;
    }

    public String getTitlul(){
        return this.titlul = titlul;
    }
    public int getAnu(){
        return this.anu = anu;
    }
    public String getRegizor(){
        return this.regizor = regizor;
    }
    public void setTitlul(String titlul){
        this.titlul= titlul;
    }
    public void setAnu(int anu){
        this.anu = anu;
    }
    public void setRegizor(String regizor){
        this.regizor = regizor;
    }
    @Override
    public String toString() {
        return
                " Titlul ='" + this.getTitlul() + '\'' +
                " Anu ='" + this.getAnu() + '\'' +
                " Regizor ='" + this.getRegizor() + '\'' ;
    }

}
