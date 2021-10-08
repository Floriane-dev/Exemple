package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adr;
    // Création d'un constructeur --> méthode 
    public Personne(String nom, String prenom, AdressePostale adr) {
        this.nom = nom.toUpperCase(); // mettre le nom en maj
        this.prenom = prenom;
        this.adr = adr;
    }
    // setter: prendre un argument en paramètre et modifie la variable d'instance
    // getter : méthode qui retroune le nom par exemple
    public String getNom() {   
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public AdressePostale getAdr() {
        return adr;
    }

    public void setAdr(AdressePostale adr) {
        this.adr = adr;
    }
    public String toString() {
        //return "Personne [nom=" + nom + ", prenom=" + prenom + ", adr=" + adr +"]";
        return nom + " " + prenom + " " + adr;
    }

}

