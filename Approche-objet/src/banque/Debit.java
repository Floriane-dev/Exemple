package banque;

public class Debit extends Operation {

    //Appel d'un constructeur de la classe-mère (ou super-classe) avec super(...) puis traitements spécifiques
    public Debit(String date, double montant) {
        super(date, montant);
    } 
    // Redéfinition de la méthode abstraite de la classe mère : 
    public String getType() {
        return "debit";
    }
}
