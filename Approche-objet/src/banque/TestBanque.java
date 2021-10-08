package banque;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte(12,12000);
    
        System.out.println(compte1 + "\n"); 
    
        Compte[] tableau = new Compte[2];
        tableau[0] = new Compte(32, 5678);
        tableau[1] = new CompteTaux(43, 347689, 3);

        for(Compte tablea : tableau) {
            System.out.println("Dans mon tableau, il ya : " + tablea);
        }
    }
    
}
