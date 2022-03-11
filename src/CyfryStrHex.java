public class CyfryStrHex {
    public static void main(String[] args) {
        String Hex = "";
        for (int i = 48; i < 58; i++){
            Hex += (char)i;
        }
        for (int i = 65; i < 71; i++){
            Hex += (char)i;
        }
        System.out.println(Hex);

    }
}
