package entites;

public class AdressePostale {
    private int numero;
    private String rue;
    private int codePostale;
    private String ville;
    //générer un constructor automatiqment : clic.dr ; action source ; generer constructeur
    public AdressePostale(int numero, String rue, int codePostale, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codePostale = codePostale;
        this.ville = ville;
    }
    //getter et setter
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getRue() {
        return rue;
    }
    public void setRue(String rue) {
        this.rue = rue;
    }
    public int getCodePostale() {
        return codePostale;
    }
    public void setCodePostale(int codePostale) {
        this.codePostale = codePostale;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    // pour rendre l'adresse en string et pas en méthode

    public String toString() {
        //return "AdressePostale [numero=" + numero + ", rue=" + rue +", codePostale=" + codePostale + "ville=" + ville +"]";
        return numero + " " + rue + " " + codePostale;
    }

}








