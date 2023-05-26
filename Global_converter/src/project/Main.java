package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SaisieChaine input = new SaisieChaine();
        verif verif = new verif();
        convert convert = new convert();
        String userInput = input.lainput();
        boolean v =  project.verif.isAlphaNumeric(userInput);



        if (v){
            Scanner scanner = new Scanner(System.in);
            System.out.print("-d -h -o -t -b : ");
            String option = scanner.nextLine();
            if (option.equals("-d")){
                convert.TextToDecim(userInput);
            }
            else if (option.equals("-h")) {
                String res = convert.convertirEnHexadecimal(userInput);
                System.out.println(res);
            }
            else if (option.equals("-o")) {
                String res = convert.convertirEnOctalASCII(userInput);
                System.out.println(res);
            }
            else if (option.equals("-b")) {
                String res = convert.convertirEnBinaireASCII(userInput);
                System.out.println(res);
            }
        }
        else {
            System.out.println("non alphanumerique");
        }


    }
}

