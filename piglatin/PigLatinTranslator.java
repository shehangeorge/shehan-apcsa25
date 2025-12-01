package piglatin;

public class PigLatinTranslator {
    public static Book translate(Book input) {
        Book translatedBook = new Book();

        // TODO: Add code here to populate translatedBook with a translation of the
        // input book.
        // Curent do-nothing code will return an empty book.
        // Your code will need to call translate(String input) many times.

        return translatedBook;
    }

    public static String translate(String input) {
        System.out.println("  -> translate('" + input + "')");

        String result = "";

        // TODO: translate a string input, store in result.
        // The input to this function could be any English string.
        // It may be made up of many words.
        // This method must call translateWord once for each word in the string.
        if (input != null) {
            String[] words = input.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                sb.append(translateWord(words[i]));
                if (i < words.length - 1) {
                    sb.append(" ");
                }
            }
            result = sb.toString();
        }

        return result;
    }

    /**
     * @param input
     * @return
     */
    private static String translateWord(String input) {
        System.out.println("  -> translateWord('" + input + "')");

        if (input == null || input.length() == 0)
            return "";
        if (input.trim().length() == 0)
            return "";

        String lowercase = input.toLowerCase();
        String vowels = "aeiou";

        if (lowercase.equals("eat")) {
            return "eatay";
        } else if (lowercase.equals("pig")) {
            return "igpay";
        } else if (lowercase.equals("trash")) {
            return "ashtray";
        }

        // just return input for anything else for now
        return input;

        // TODO: Replace this code to correctly translate a single word.
        // Start here first!
        // This is the first place to work.
        // delete this line
    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)

}
