package entites;



public class TestAdressepostale {
    public static void main(String[] args) {
        AdressePostale adr = new AdressePostale(10,"rue de la Figue",4400,"Nantes");
        AdressePostale adr2 = new AdressePostale(20, "rue de la paix",75002,"Ville");
        
        System.out.println("Mon adresse est au " + adr);
        System.out.println("Ma deuxième adresse est au " + adr2);
    }

    

}
