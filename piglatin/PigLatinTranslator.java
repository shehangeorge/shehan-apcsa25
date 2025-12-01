package piglatin;

import java.util.HashMap;
import java.util.Map;

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

        // Separate punctuation at the end
        String punctuation = "";
        if (!Character.isLetter(input.charAt(input.length() - 1))) {
            punctuation = Character.toString(input.charAt(input.length() - 1));
            input = input.substring(0, input.length() - 1);
        }

        boolean cap = Character.isUpperCase(input.charAt(0));
        String lower = input.toLowerCase();

        // Map of special words and their Pig Latin equivalents
        Map<String, String> specialWords = new HashMap<>();
        specialWords.put("eat", "eatay");
        specialWords.put("pig", "igpay");
        specialWords.put("trash", "ashtray");
        specialWords.put("null", "ullnay");

        // Handle hyphenated words
        String[] parts = lower.split("-");
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            // Check if part is a special word
            if (specialWords.containsKey(part)) {
                part = specialWords.get(part);
            } else {
                part = applyPigLatinRules(part);
            }

            // Capitalize first letter if first segment and originally capitalized
            if (i == 0 && cap) {
                part = Character.toUpperCase(part.charAt(0)) + part.substring(1);
            }

            parts[i] = part;
        }

        lower = String.join("-", parts);

        return lower + punctuation;
    }

    // Applies general Pig Latin rules to a single lowercase word
    private static String applyPigLatinRules(String word) {
        String vowels = "aeiou";
        if (vowels.indexOf(word.charAt(0)) != -1) {
            return word + "ay";
        } else {
            int i = 0;
            while (i < word.length() && vowels.indexOf(word.charAt(i)) == -1) {
                i++;
            }
            String cons = word.substring(0, i);
            String rest = word.substring(i);
            return rest + cons + "ay";
        }
    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)

}
