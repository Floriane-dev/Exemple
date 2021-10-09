package banque;

public abstract class Operation {
    protected String date;
    protected double montant;
    public char[] getType;
    
    //Création du constructeur
    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Operation [date=" + date + ", montant=" + montant + "]";
    }
    
// METHODE
    public abstract String getType();

    }
    

