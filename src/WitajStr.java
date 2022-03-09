public class WitajStr {
    public static void main(String[] args) {
        String text = "Dzien dobry";
        System.out.println("oryginal: \t" + text);
        System.out.println("pionowo:");
        char[] chars = text.toCharArray();
        for (char x : chars) {
            System.out.println(x);
        }
        System.out.println();
        String textAfterConvert = "";
        System.out.println("poziomo rozdzielone spacjami: ");
        for (char x : chars) {
            textAfterConvert = textAfterConvert + x + " ";
        }
        int textLength = textAfterConvert.length()-1;
        textAfterConvert = textAfterConvert.substring(0, textLength);
        System.out.println(textAfterConvert.charAt(textAfterConvert.length()-1));
        System.out.println(textAfterConvert);
        System.out.println();
        System.out.println("poziomo, wielkimi literami:");
        System.out.println(text.toUpperCase());
        System.out.println();
        System.out.println("poziomo, małymi literami:");
        System.out.println(text.toLowerCase());

    }
}
