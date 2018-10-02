public class ConcatSub {
    public String concactSubstring(String string, int one, int two, String strings) {
         string = string.substring(one, two);
         return (string + " " + strings);
    }
}