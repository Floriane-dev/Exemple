package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr = new AdressePostale(10,"rue de la Figue",4400,"Nantes");
        AdressePostale adr2 = new AdressePostale(20, "rue de la paix",75002,"Ville");
        
        System.out.println("Mon adresse est au " + adr);
        System.out.println("Ma deuxième adresse est au " + adr2);

        Personne personne1 = new Personne("DUJARDIN","Michel",adr);
        Personne personne2 = new Personne("DUHAMEL","Sophie",adr2);

        System.out.println(personne1);
        System.out.println(personne2);

        personne1.nom="";
        personne2.nom="";
    }
    
    }
   