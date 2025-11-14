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
        result = translateWord(input);

        return result;
    }

    /**
     * @param input
     * @return
     */
    private static String translateWord(String input) {
        System.out.println("  -> translateWord('" + input + "')");

        if (input.length()==0) 
            return "";
        if (input.trim().length()==0)
            return "";
        if (input.indexOf("") !=-1){
            String result = "";
            int count = 0;
            while (count<input.length()){
                int spaces = input.indexOf("",count);
                if (spaces == -1)
                    {
                    spaces = input.length();
                    }
                String word = input.substring(count,spaces);
                result = result + translateWord(word);
                if (spaces<input.length())
                {
                    result = result + "";
                }
                count = spaces + 1;
            
            }
            return result;
            
        String lowercase = input.toLowerCase();
        String vowels = "aeiou";
        if (!Character.isLetter(last.CharAt(0))){
            end=last;
            input = input.substring(0, input.length()-1);
        }
        

        }
        }
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

