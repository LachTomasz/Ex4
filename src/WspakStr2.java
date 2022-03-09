public class WspakStr2 {
    public static void main(String[] args) {
        String text = "programowanie";
        System.out.println("zawartość Stringa text:\t"+text);
        System.out.println();
        String textWspak = "";
        for (int i = text.length()-1; i >= 0 ; i--) {
            textWspak = textWspak + text.charAt(i);
        }
        text = textWspak;
        System.out.println("po trans:\t"+text);
    }
}
