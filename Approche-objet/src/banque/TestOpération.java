package banque;

import java.util.Objects;

public class TestOpération {
    public static void main(String[] args) {
        
        //Création d'un tableau
        Compte[] tableau;
        tableau = new Compte[2];
        tableau[0] = new Compte(32, 56);
        tableau[1] = new CompteTaux(43, 34, 3);
        
        Operation[] creditDebit;
        creditDebit = new Operation[4];
        creditDebit[0] = new Credit("03/03/2021", 10);
        creditDebit[1] = new Credit("16/12/2019", 14);
        creditDebit[2] = new Debit("27/08/2018", 3);
        creditDebit[3] = new Debit("21/10/2010", 7);

        for (int i = 0; i<creditDebit.length; i++) {
            if (Objects.equals(creditDebit[i].getType(), "credit")) {
                tableau[i].setSolde(tableau[i].getSolde() + creditDebit[i].getMontant());
            }
            if (Objects.equals(creditDebit[i].getType(), "debit")) {
                tableau[i].setSolde(tableau[i].getSolde() - creditDebit[i].getMontant());
            }
            System.out.println("\n" + tableau[i]);   
            }

            

        }

    
    } 
        
        /* for(Operation credeb : creditDebit) {
            if creditDebit.getType = Credit;

            System.out.println("\n" + credeb); */
        

