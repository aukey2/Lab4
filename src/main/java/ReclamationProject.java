/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 *
 */
public class ReclamationProject {

    /**
     * Goes through first string and returns largest substring of second string contained
     * within first string.
     *
     * @param firstWord length of string to be searched
     * @param secondWord keyword to see if is contained
     * @return unknown String
     */
    public static String firstContainsSecond(final String firstWord, final String secondWord) {
        String a = firstWord;
        String b = secondWord;
        if (a.length() > b.length()) {
            String c = a;
            a = b;
            b = c;
         }

        String r = ""; // I love the ternary operator!
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    }
                }
            }
        }
        return r;
     }
    /**
     *
     * @param args arguments
     */
    public static void main(final String[] args) {
        System.out.println(firstContainsSecond("Ashutosh", "tosh"));
        System.out.println(firstContainsSecond("Ukey", "yes"));
        System.out.println(firstContainsSecond("abc", "cde"));
        System.out.println(firstContainsSecond("wanna", "kms"));
        System.out.println(firstContainsSecond("zzzzzzzwanzzzzn", "wanna"));

    }
}
