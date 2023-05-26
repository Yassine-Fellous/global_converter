package project;
import java.util.Scanner;


public class SaisieChaine {
    public static void main(String[] args) {

    }

    public static String lainput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez une chaîne de caractères : ");
        String chaine = scanner.nextLine();

        System.out.println("La chaîne que vous avez saisie est : " + chaine);
        
        return chaine;
    }

}