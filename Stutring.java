public class Stutring {
    public static String stutter(String word) {
        // Extract the first two letters of the word
        String firstTwoLetters = word.substring(0, 2);
        
        // Create the stuttering effect
        String stutteredWord = firstTwoLetters + "... " + firstTwoLetters + "... " + word + "?";
        
        return stutteredWord;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(stutter("incredible"));    // Output: "in... in... incredible?"
        System.out.println(stutter("enthusiastic"));  // Output: "en... en... enthusiastic?"
        System.out.println(stutter("outstanding"));   // Output: "ou... ou... outstanding?"
    }
}
