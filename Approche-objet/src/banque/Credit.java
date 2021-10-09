package banque;

public class Credit extends Operation{ 

    //TODO Auto-generated constructor stub : Redéfinition de la classe mère obligatoire
    public Credit(String date, double montant) {
        super(date, montant);
        
    }
    //redéfinition de la méthode abstraite string get type : 
    public String getType() {
        return "credit";
    }

    
    
}
