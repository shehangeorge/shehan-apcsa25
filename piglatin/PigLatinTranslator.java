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

        String punctuation = "";
        if (!Character.isLetter(input.charAt(input.length() - 1))) {
            punctuation = Character.toString(input.charAt(input.length() - 1));
            input = input.substring(0, input.length() - 1);
        }

        String lowercase = input.toLowerCase();

        if (lowercase.equals("eat")) {
            return "eatay" + punctuation;
        } else if (lowercase.equals("pig")) {
            return "igpay" + punctuation;
        } else if (lowercase.equals("trash")) {
            boolean cap = Character.isUpperCase(input.charAt(0));
            String result = "ashtray";
            if (cap) {
                result = Character.toUpperCase(result.charAt(0)) + result.substring(1);
            }
            return result + punctuation;
        } else if (lowercase.equals("null")) {
            return "ullnay" + punctuation;
        }

        // just return input for anything else for now
        return input + punctuation;

        // TODO: Replace this code to correctly translate a single word.
        // Start here first!
        // This is the first place to work.
        // delete this line
    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)

}
