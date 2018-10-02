public class StringManip {
    public static void main(String[] agrs) {

        TrimAndConcat TaC = new TrimAndConcat();
        System.out.println(TaC.somethingShort("       Byeeeeee      ", "         World       "));

        IndexOrNull IoN = new IndexOrNull();
        System.out.println(IoN.getIndexOrNull("pass a string and a character", 'g'));

        GetStringInString GsiS = new GetStringInString();
        System.out.println(GsiS.getIndexOrNuuu("is this gonna work", "work"));

        ConcatSub cS = new ConcatSub();
        System.out.println(cS.concactSubstring("for pow you take the first argument", 10, 15, "connected"));

    }
}