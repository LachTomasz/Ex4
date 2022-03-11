import java.lang.Character;
public class CyfryStrHex {
    public static void main(String[] args) {

        StringBuilder Hex = new StringBuilder();

        for (int i = 48; i < 58; i++)
            Hex.append((char) i);

        for (int i = 65; i < 71; i++)
            Hex.append((char) i);

        System.out.println(Hex);

        //ewentualnie
        StringBuilder Szesnastkowe = new StringBuilder();

        for (int i = 0; i < 16; i++)
            Szesnastkowe.append(Character.forDigit(i, 16));

        Szesnastkowe = new StringBuilder(Szesnastkowe.toString().toUpperCase());
        System.out.println(Szesnastkowe);
    }
}
