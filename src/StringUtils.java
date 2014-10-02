public class StringUtils {

    /**
     * Center a string with spaces at either side
     * @param s The string
     * @param size The width of the generated string
     * @return The given string {@code s}, centered
     */
    public static String center(String s, int size) {
        return center(s, size, " ");
    }

    /**
     * Center a string with a given padding to the given width
     * @param s The string
     * @param size The width of the generated string
     * @param pad The padding
     * @return The given string centered.
     */
    public static String center(String s, int size, String pad) {
        if (pad == null)
            throw new NullPointerException("pad cannot be null");
        if (pad.length() <= 0)
            throw new IllegalArgumentException("pad cannot be empty");
        if (s == null || size <= s.length())
            return s;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (size - s.length()) / 2; i++) {
            sb.append(pad);
        }
        sb.append(s);
        while (sb.length() < size) {
            sb.append(pad);
        }
        return sb.toString();
    }

    /**
     * Repeats a given string
     * @param s The string to repeat
     * @param n The number of times to repeat the string
     * @return The string {@code s} repeated {@code n} times.
     */
    public static String repeat(String s, int n) {
        String ret = "";
        for (int i = 0; i < n; i++) {
            ret += s;
        }
        return ret;
    }
}