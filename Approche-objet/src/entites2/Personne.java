package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adr;
    // Création d'un constructeur --> méthode 
    public Personne(String nom, String prenom, AdressePostale adr) {
        this.nom = nom;
        this.prenom = prenom;
        this.adr = adr;
    }
    public String toString() {
        //return "Personne [nom=" + nom + ", prenom=" + prenom + ", adr=" + adr +"]";
        return nom + " " + prenom + " " + adr;
    }

    }

