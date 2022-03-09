public class WspakjStr1 {
    public static void main(String[] args) {
        String text = "programowanie";
        System.out.println("zawartość Stringa text:\t"+text);
        System.out.println();
        System.out.println("A teraz wspak:");
        for (int i = text.length()-1; i >= 0 ; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
        System.out.println("a teraz z powrotem original:\t"+text);
    }
}
