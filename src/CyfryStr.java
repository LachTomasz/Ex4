import java.lang.Character;
public class CyfryStr {
    public static void main(String[] args) {
        String cyfry = "";
        char digit;
        for (int i = 48; i <58; i++){
            digit = (char)i;
            cyfry = cyfry + digit;

        }
        System.out.println(cyfry);
    }
}
