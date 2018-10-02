public class TrimAndConcat {
    public String somethingShort(String one, String two) {
        one = one.trim();
        two = two.trim();
        return (one + " " + two);
    }
}