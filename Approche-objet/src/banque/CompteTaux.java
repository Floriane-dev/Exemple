package banque;

public class CompteTaux extends Compte {
    private int num;
    private double solde;
    private double taux;

    //Constructeur
    public CompteTaux(int num,double solde, double taux) {
        this.num = num;
        this.solde = solde;
        this.taux = taux;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public double getTaux() {
        return taux;
    }
    public void setTaux(double taux) {
        this.taux = taux;
    }
    @Override // faire un to String pour un affichage correct
    public String toString() {
        return "CompteTaux [num=" + num + ", solde=" + solde + ", taux=" + taux + "]";
    }

    /* Manuellement : 
    public String toString() {
    return num + "|"+ solde + "|" + taux;
    } */

}


