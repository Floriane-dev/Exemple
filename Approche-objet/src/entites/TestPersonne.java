package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr = new AdressePostale(10,"rue de la Figue",4400,"Nantes");
        AdressePostale adrAnc = new AdressePostale(20, "rue de la paix",75002,"Ville");
        AdressePostale adrNouv = new AdressePostale(10, "rue de la nouveau",75006,"Ville");

        System.out.println("Mon adresse est au " + adr);
        System.out.println("Ma deuxième adresse est au " + adrNouv);

        Personne personne1 = new Personne("dujardin","Michel",adr);
        Personne personne2 = new Personne("duhamel","Sophie",adrAnc);
        
        System.out.println(personne1);
        System.out.println("Mes anciennes coordonnées sont : " + personne2);
        
        personne2.setAdr(adrNouv); // modifier l'adresse
        System.out.println("Mes nouvelles coordonnées sont : " + personne2);
        
        
       // System.out.println(personne1);
       // System.out.println(personne2);
        System.out.println(personne2.getAdr());
        
        personne1.nom="";
        personne2.nom="";
    }
    
    }
   