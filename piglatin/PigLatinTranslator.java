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
     * translate a single word to Pig Latin
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

        boolean cap = Character.isUpperCase(input.charAt(0));
        String lower = input.toLowerCase();
        String vowels = "aeiou";

        if (vowels.indexOf(lower.charAt(0)) != -1) {
            // starts with vowel
            lower = lower + "ay";
        } else {
            // starts with consonant(s)
            int i = 0;
            while (i < lower.length() && vowels.indexOf(lower.charAt(i)) == -1) {
                i++;
            }
            String cons = lower.substring(0, i);
            String rest = lower.substring(i);
            lower = rest + cons + "ay";
        }

        if (cap) {
            lower = Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
        }

        return lower + punctuation;
    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)

}
