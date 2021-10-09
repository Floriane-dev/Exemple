package banque;

public class Compte {
    private int num;
    private double solde;

//Création de deux constructeurs
public Compte(){

}
    
    public Compte(int num, double solde) {
        this.num = num;
        this.solde = solde;

    }
    // getter et setter
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

    //Méthode pour que l'affichage apparraisse correctement dans le test
public String toString(){
    return (num + "|" + solde);
    }
}
