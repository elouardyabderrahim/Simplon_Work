//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



/*
******** Contexte du projet

Scénario:


Dans le premier cas :

L’utilisateur est invité à introduire le nombre d’heure travaillée par mois
Le nombre d’heure total ne doit pas dépasser 200 heures par mois
Le tarif ne doit pas être inférieur à 20 DH par heure Si le 180 < nombre d’heure <=200 le tarif par heure est augmenté par 50/% par rapport au tarif de base pour les heures extra « les heures qui dépassent 180 »
Dans le second cas :

L’utilisateur est invité à introduire le nombre d’heure travaillée par semaine

Le nombre d’heure total ne doit pas dépasser 50 heures par semaine

Le tarif par heure ne doit pas être inférieur à 25 DH par heure Si le 40 < nombre d’heure <=50 le tarif par heure est augmenté par 50/% par rapport au tarif de base pour les heures extra « les heures qui dépassent 40»

NB : salaire de base= taux horaire * heures prestées
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Écrivez un programme JAVA qui permet de simuler le montant obtenu chaque semaine et chaque mois :

        System.out.println("Programme qui permet de simuler le montant obtenu chaque semaine et chaque mois ");
        /*
             Un message qui invite l’employé à introduire son nom
                Un message de bienvenue au nom de l’utilisateur.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please entre your Name :");
        String employeeName = input.nextLine();
        System.out.println("Welcome " + employeeName);

        //L’utilisateur est invité à choisir entre mode de payement mensuel ou hebdomadaire
        System.out.println("Please entre the type of payment Name mensuel / hebdomadaire : ");
        String paymentType = input.nextLine();

         switch (paymentType) {
            case "mensuel"-> System.out.println("mensuel ");
            case "hebdomadaire" -> System.out.println("hebdomadaire ");
            default -> System.out.println ("Invalid day: " + paymentType);
        };



    }
}