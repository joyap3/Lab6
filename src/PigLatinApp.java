import java.util.Scanner;

/**
 * Created by joyapuryear on 6/30/17.
 */

public class PigLatinApp {

    public static void main(String[] args) {

        //1. display a welcome message
        System.out.println("Welcome to the Pig Latin Translator! \n");

        //2. prompt for user input
        System.out.println("Enter a line to be translated: ");
        Scanner scan = new Scanner(System.in);

        //3. get user input
        String isVowel = scan.nextLine();

        char v = Character.toLowerCase(isVowel.charAt(0));

        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') { //5. display results for vowels
            String convertToPigLatin = isVowel + "way";
            System.out.println(convertToPigLatin);

        } else

        {
            String first;
        }
        String first = isVowel.substring(0, 1);
        String slice = isVowel.substring(1, isVowel.length());
        System.out.println(slice + first + "ay");

    }


       /* //1. display a welcome message

        System.out.println("Welcome to the Pig Latin Translator! \n");

        //2. prompt for user input

        System.out.println("Enter a line to be translated: ");

        //3. get user input

        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();

        isVowels(userInput);

        //4. translate user input
        //4.1 convert to lowercase
        userInput = userInput.toLowerCase();
        String result;

        if (isVowels(userInput)) {// vowels
            result = pigLatinVowels(userInput);

        } else { //consonants
            result = pigLatinConsonants(userInput);
        }


        //5. display results

        System.out.println(result);

        //6. prompt user to play again

        //save loops for later
    }



    /*
           Translate a word starting with a consonant to pig latin
            */
//    private static String pigLatinConsonants(String userInput) {
//    }

     /*
    Translate a word starting with a vowel to pig latin
     */

   /* private static String pigLatinVowels(String userInput) {
        if (isVowels(userInput)) {
            return "Here is your word in pig latin";
        }

        return "type a word that starts with a vowel";

    }



    public static String isVowels(String userInput) {


        if (userInput.charAt(0) == 'a' || userInput.charAt(0) == 'e' || userInput.charAt(0) == 'i' || userInput.charAt(0) == 'o' || userInput.charAt(0) == 'u')
            ;
        {
            return userInput.substring(1).concat(userInput + "way");


        }
    }*/
}



