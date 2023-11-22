public class Comedie extends Filme{

    public Comedie(String titlul, int anu, String regizor){
        super(titlul,anu,regizor);
    }
    @Override
    public String toString() {
        return
                " Titlul ='" + super.getTitlul() + '\'' +
                        " Anu ='" + super.getAnu() + '\'' +
                        " Regizor ='" + super.getRegizor() + '\'';


    }
}
