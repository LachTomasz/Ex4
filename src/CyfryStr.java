import java.lang.Character;
public class CyfryStr {
    public static void main(String[] args) {
        String cyfry = "";
        for (int i = 48; i <58; i++){
            cyfry = cyfry + (char)i;;
        }
        System.out.println(cyfry);
    }
}
