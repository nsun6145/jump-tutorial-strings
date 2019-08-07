public class Test {
    public static void main(String[] args) {

        //Basic String usage
        String word = "pie";
        System.out.println(word);

        int wordLength = word.length();

        //Length
        System.out.println("The length of the word " + word + " is " + wordLength + " characters long.");

        //Adding quotations in to a string. Same can be done with ' and \
        System.out.println("And thus she said \"Ketchup on macaroni & cheese isn't the worst thing to have.\" ");

        //Change casing
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());

        System.out.println("Yes".toUpperCase());
        
        //Locating part of a string
        String locateSentence = "Indicate where \"locate\" occurs";

        System.out.println(locateSentence);
        System.out.println("The word \"locate\" is in position " + locateSentence.indexOf("locate"));

        //Concatenation
        System.out.println("Word: ".concat(word));
        System.out.println("2 + 2");
        System.out.println(2+2);
        System.out.println("The output of two plus two is " + 2 + 2);
        System.out.println("The output of two plus two is " + (2 + 2));
    
    }
  }
  